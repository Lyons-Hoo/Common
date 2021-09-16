package com.common.core.ui.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.AbsoluteLayout;
import android.widget.ProgressBar;

import com.tencent.smtt.sdk.WebView;

/**
 * Describe:
 * Created by lyons on 2021/05/14.
 */
public class ProgressWebView extends WebView {

    public ProgressWebView(Context context) {
        this(context, null);
    }

    public ProgressWebView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ProgressWebView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private ProgressBar progressbar;
    private WebChromeClient mChromeClient;

    private void init(Context context) {
        progressbar = new ProgressBar(context, null, android.R.attr.progressBarStyleHorizontal);
        //设置颜色
        setProgressColor(Color.BLACK);
        progressbar.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, 8, 0));
        addView(progressbar);
        this.mChromeClient = new WebChromeClient(this.progressbar, this);
        setWebChromeClient(this.mChromeClient);
    }

    public void setProgressColor(int color) {
        @SuppressLint("RtlHardcoded") ClipDrawable d = new ClipDrawable(
                new ColorDrawable(color),
                Gravity.LEFT,
                ClipDrawable.HORIZONTAL
        );
        progressbar.setProgressDrawable(d);
    }

    private static final class WebChromeClient extends com.tencent.smtt.sdk.WebChromeClient {

        private ProgressWebView webView;
        private ProgressBar p;

        WebChromeClient(ProgressBar p, ProgressWebView webView) {
            this.p = p;
            this.webView = webView;
        }

        @Override
        public void onProgressChanged(WebView view, int newProgress) {
            if (newProgress == 100) {
                if (null != p) p.setVisibility(GONE);
                this.webView.onLoadPageFinish(view);
            } else {
                if (null != p) {
                    if (p.getVisibility() == GONE)
                        p.setVisibility(VISIBLE);
                    p.setProgress(newProgress);
                }
            }
            super.onProgressChanged(view, newProgress);
        }

        void free() {
            this.p = null;
            this.webView = null;
        }

    }

    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        AbsoluteLayout.LayoutParams lp = (AbsoluteLayout.LayoutParams) progressbar.getLayoutParams();
        lp.width = l;
        lp.height = t;
        progressbar.setLayoutParams(lp);
        super.onScrollChanged(l, t, oldl, oldt);
    }

    protected void onLoadPageFinish(WebView view) {
    }

    @Override
    public void destroy() {
        if (null != this.mChromeClient) {
            this.mChromeClient.free();
            this.mChromeClient = null;
        }
        super.destroy();
    }
}