package com.dharmaputera.cleanmvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import com.dharmaputera.cleanmvvm.databinding.ActivityMainBinding
import com.dharmaputera.cleanmvvm.viewmodel.BookFictionViewModel
import com.dharmaputera.cleanmvvm.viewmodel.BookNonFictionViewModel
import com.dharmaputera.domain.model.book.Book
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var book : Book
    private val bookFictionViewModel : BookFictionViewModel by viewModels()
    private val bookNonFictionViewModel : BookNonFictionViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun saveBook(book: Book){
        this.book = book
    }

    fun getBook() : Book{
        return book
    }

    fun getbookFictionViewModel(): BookFictionViewModel{
        return bookFictionViewModel
    }

    fun getbookNonFictionViewModel(): BookNonFictionViewModel{
        return bookNonFictionViewModel
    }

}