package com.dharmaputera.data.repository

import com.dharmaputera.data.api.NYTimesApi
import com.dharmaputera.data.extensions.toGetBook
import com.dharmaputera.domain.model.book.GetBook
import com.dharmaputera.domain.repository.BookRepository
import javax.inject.Inject

class BookRepositoryImpl @Inject constructor(
    private val api: NYTimesApi
): BookRepository{
    override suspend fun getBooksFiction(): GetBook {
        return api.getBooksFiction().toGetBook()
    }
    override suspend fun getBooksNonFiction(): GetBook {
        return api.getBooksNonFiction().toGetBook()
    }
}