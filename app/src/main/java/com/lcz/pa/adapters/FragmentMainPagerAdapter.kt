package com.lcz.pa.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.lcz.pa.MainFragment
import com.lcz.pa.ui.PlantListFragment

/**
 *
 * desc: TODO
 *
 * create by lcz on 2021-07-02
 */


const val MY_GARDEN_PAGE_INDEX = 0
const val PLANT_LIST_PAGE_INDEX = 1

class FragmentMainPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    /**
     * Mapping of the ViewPager page indexes to their respective Fragments
     */
    private val tabFragmentsCreators: Map<Int, () -> Fragment> = mapOf(
        MY_GARDEN_PAGE_INDEX to { MainFragment() },
        PLANT_LIST_PAGE_INDEX to { PlantListFragment() }
    )

    override fun getItemCount() = tabFragmentsCreators.size

    override fun createFragment(position: Int): Fragment {
        return tabFragmentsCreators[position]?.invoke() ?: throw IndexOutOfBoundsException()
    }
}