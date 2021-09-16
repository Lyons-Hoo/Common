// Generated by data binding compiler. Do not edit!
package com.common.core.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.common.core.R;
import com.scwang.smartrefresh.header.MaterialHeader;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.footer.ClassicsFooter;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentListBinding extends ViewDataBinding {
  @NonNull
  public final ClassicsFooter rfFooter;

  @NonNull
  public final MaterialHeader rfHeader;

  @NonNull
  public final RecyclerView rvData;

  @NonNull
  public final SmartRefreshLayout srlContainer;

  protected FragmentListBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ClassicsFooter rfFooter, MaterialHeader rfHeader, RecyclerView rvData,
      SmartRefreshLayout srlContainer) {
    super(_bindingComponent, _root, _localFieldCount);
    this.rfFooter = rfFooter;
    this.rfHeader = rfHeader;
    this.rvData = rvData;
    this.srlContainer = srlContainer;
  }

  @NonNull
  public static FragmentListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_list, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentListBinding>inflateInternal(inflater, R.layout.fragment_list, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_list, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentListBinding>inflateInternal(inflater, R.layout.fragment_list, null, false, component);
  }

  public static FragmentListBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentListBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentListBinding)bind(component, view, R.layout.fragment_list);
  }
}