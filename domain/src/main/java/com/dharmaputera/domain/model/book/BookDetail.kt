package com.dharmaputera.domain.model.book

data class BookDetail(
    val title : String,
    val description : String,
    val contributor : String,
    val author : String,
    val contributor_note : String,
    val price : Double,
    val age_group : String,
    val publisher : String,
    val primary_isbn13 : String,
    val primary_isbn10 : String,
)
