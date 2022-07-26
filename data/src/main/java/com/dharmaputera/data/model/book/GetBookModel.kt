package com.dharmaputera.data.model.book

import com.dharmaputera.domain.model.book.Book
import com.dharmaputera.domain.model.book.BookDetail
import com.dharmaputera.domain.model.book.Isbn
import com.dharmaputera.domain.model.book.Review
import com.google.gson.annotations.SerializedName

data class GetBookModel(
    @SerializedName("status")val status : String,
    @SerializedName("copyright")val copyright : String,
    @SerializedName("num_results")val numResults : Int,
    @SerializedName("last_modified")val lastModified : String,
    @SerializedName("results")val results : List<Book>,
)
