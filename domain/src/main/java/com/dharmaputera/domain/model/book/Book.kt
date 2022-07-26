package com.dharmaputera.domain.model.book

data class Book(
    val list_name : String,
    val display_name : String,
    val bestsellers_date : String,
    val published_date : String,
    val rank : Int,
    val rank_last_week : Int,
    val weeks_on_list : Int,
    val asterisk : Int,
    val dagger : Int,
    val amazon_product_url : String,
    val isbns : List<Isbn>,
    val book_details : List<BookDetail>,
    val reviews : List<Review>
)
