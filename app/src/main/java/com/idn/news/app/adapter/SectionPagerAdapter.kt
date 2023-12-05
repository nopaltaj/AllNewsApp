package com.idn.news.app.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.idn.news.app.ui.AboutAlQuranFragment
import com.idn.news.app.ui.WarningFragment
import com.idn.news.app.ui.aljazeera
import com.idn.news.app.ui.commonFragment

class SectionPagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    override fun getItemCount() = 4

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> commonFragment()
            1 -> AboutAlQuranFragment()
            2 -> aljazeera()
            3 -> WarningFragment()
            else -> aljazeera()
        }
    }
}