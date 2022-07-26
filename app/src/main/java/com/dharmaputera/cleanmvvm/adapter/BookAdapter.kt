package com.dharmaputera.cleanmvvm.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.dharmaputera.cleanmvvm.R
import com.dharmaputera.cleanmvvm.databinding.BookRowBinding
import com.dharmaputera.cleanmvvm.view.MainActivity
import com.dharmaputera.domain.model.book.Book

class BookAdapter(val bookList : List<Book>): RecyclerView.Adapter<BookAdapter.BookViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BookViewHolder {
        val binding = BookRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BookViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val book: Book = bookList[position]
        holder.bindBook(book)

        holder.itemView.setOnClickListener {
            (holder.itemView.context as MainActivity).saveBook(book)
            val navController = Navigation.findNavController(holder.itemView)
            navController.navigate(R.id.detailFragment)
        }
    }

    override fun getItemCount(): Int {
        return bookList.size
    }

    class BookViewHolder(private val binding: BookRowBinding) :RecyclerView.ViewHolder(binding.root){
        fun bindBook(item : Book){
            binding.bookTitle.text = item.book_details[0].title
            binding.author.text = item.book_details[0].author
        }
    }
}