package com.common.core.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

/**
 * Created by Lyons-Hoo on 2020/05/14.
 * Describe: 通用的viewPager碎片适配器
 */
class FragmentPagerAdapter<F : Fragment>(fm : FragmentManager,
                                         private val fragments : List<F>,
                                         private val titles : List<String> = listOf()) : FragmentStatePagerAdapter(fm)
{
    override fun getItem(p0: Int): Fragment {
        return this.fragments[p0]
    }

    override fun getCount(): Int {
        return this.fragments.size
    }

    override fun getPageTitle(position: Int): CharSequence {
        return if(this.titles.size > position) this.titles[position] else ""
    }
}