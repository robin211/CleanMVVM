package com.dharmaputera.cleanmvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dharmaputera.cleanmvvm.databinding.ActivityMainBinding
import com.dharmaputera.domain.model.book.Book
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var book : Book
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

}