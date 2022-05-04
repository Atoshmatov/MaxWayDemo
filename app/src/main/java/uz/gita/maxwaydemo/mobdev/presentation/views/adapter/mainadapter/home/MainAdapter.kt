package uz.gita.maxwaydemo.mobdev.presentation.views.adapter.mainadapter.home

import android.annotation.SuppressLint
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class MainAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    private val list = ArrayList<Fragment>()

    @SuppressLint("NotifyDataSetChanged")
    fun setListPager(pager: ArrayList<Fragment>) {
        list.clear()
        list.addAll(pager)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment = list[position]
}