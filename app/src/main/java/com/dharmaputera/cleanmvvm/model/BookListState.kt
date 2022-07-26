package com.dharmaputera.cleanmvvm.model

import com.dharmaputera.domain.model.book.Book

data class BookListState(
    val isLoading : Boolean = false,
    val books : List<Book> = emptyList(),
    val error : String = ""
)