package com.dharmaputera.domain.model.book

data class GetBook(
    val status : String,
    val copyright : String,
    val num_results : Int,
    val last_modified : String,
    val results : List<Book>,
)
