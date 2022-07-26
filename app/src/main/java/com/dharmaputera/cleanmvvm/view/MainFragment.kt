package com.dharmaputera.cleanmvvm.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dharmaputera.cleanmvvm.R
import com.dharmaputera.cleanmvvm.adapter.ViewPagerAdapter
import com.dharmaputera.cleanmvvm.databinding.FragmentMainBinding
import com.google.android.material.tabs.TabLayoutMediator


val arrayTitle = arrayOf(
    "Fiction",
    "Non Fiction"
)
class MainFragment : Fragment() {
    lateinit var binding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewPager = binding.vp
        val tabLayout = binding.tab
        val adapter = ViewPagerAdapter(childFragmentManager, lifecycle)
        viewPager.adapter = adapter
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = arrayTitle[position]
        }.attach()
    }

}