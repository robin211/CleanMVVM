package com.dharmaputera.domain.repository

import com.dharmaputera.domain.model.book.GetBook

interface BookRepository {
    suspend fun getBooksFiction(): GetBook
    suspend fun getBooksNonFiction(): GetBook
}