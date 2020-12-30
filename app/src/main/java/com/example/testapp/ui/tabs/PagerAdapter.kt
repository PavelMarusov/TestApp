package com.example.testapp.ui.tabs

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.testapp.ui.fragments.fragment.dashboard.DashboardFragment
import com.example.testapp.ui.fragments.fragment.home.HomeFragment
import com.example.testapp.ui.fragments.fragment.notifications.NotificationsFragment

class PagerAdapter (fm:FragmentManager): FragmentPagerAdapter (fm) {
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                HomeFragment()
            }
            1 -> DashboardFragment()
            else -> {
                return NotificationsFragment()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "\uD83D\uDC2E Агробазар"
            1 -> "\uD83D\uDE9C Сельхоз техника"
            else -> {
                return "⚒ Строительные материалы"
            }
        }
    }

}