package com.dharmaputera.data.api

import com.dharmaputera.data.model.book.GetBookModel
import retrofit2.http.GET

interface NYTimesApi {

    @GET("svc/books/v3/lists.json?list=hardcover-fiction&api-key=a9SGty8LZSg53QcQRlGT6wBQMe71GL6N")
    suspend fun getBooksFiction(): GetBookModel

    @GET("svc/books/v3/lists.json?list=hardcover-nonfiction&api-key=a9SGty8LZSg53QcQRlGT6wBQMe71GL6N")
    suspend fun getBooksNonFiction(): GetBookModel
}