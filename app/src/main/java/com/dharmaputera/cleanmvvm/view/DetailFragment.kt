package com.dharmaputera.cleanmvvm.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.dharmaputera.cleanmvvm.databinding.FragmentDetailBinding
import com.dharmaputera.domain.model.book.Book


class DetailFragment : Fragment() {
    lateinit var binding: FragmentDetailBinding
    lateinit var book: Book
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        book = (activity as MainActivity?)!!.getBook()
        binding.title.text = book.book_details[0].title
        binding.author.text = "Author: ${book.book_details[0].author}"
        binding.contributor.text = "Contributor: ${book.book_details[0].contributor}"
        binding.description.text = " \"${book.book_details[0].description}\""
        binding.publisher.text = "Publisher: ${book.book_details[0].publisher}"
        binding.bestSellerDate.text = "Best Seller Date: ${book.bestsellers_date}"
        binding.rank.text = "Rank: ${book.rank}"
        binding.rankLastWeek.text = "Rank Last Week: ${book.rank_last_week}"
    }

}