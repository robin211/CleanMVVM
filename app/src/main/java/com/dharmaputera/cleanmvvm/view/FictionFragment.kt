package com.dharmaputera.cleanmvvm.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.dharmaputera.cleanmvvm.adapter.BookAdapter
import com.dharmaputera.cleanmvvm.databinding.FragmentFictionBinding
import com.dharmaputera.cleanmvvm.viewmodel.BookFictionViewModel
import com.dharmaputera.cleanmvvm.viewmodel.BookNonFictionViewModel


class FictionFragment : Fragment() {
    lateinit var binding: FragmentFictionBinding
    private lateinit var adapter: BookAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFictionBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as MainActivity?)!!.getbookFictionViewModel().state.observe(requireActivity()){
            if(!it.isLoading){
                binding.progressCircularFiction.visibility = View.INVISIBLE
                if (it.error.isNotBlank()){
                    binding.txtErrorFiction.visibility = View.VISIBLE
                    binding.txtErrorFiction.text = it.error
                }else{
                    binding.rvBooksFiction.visibility = View.VISIBLE
                    adapter = BookAdapter(it.books)
                    binding.rvBooksFiction.adapter = adapter
                }
            }
        }

    }

}