package com.dharmaputera.data.model.book

import com.dharmaputera.domain.model.book.BookDetail
import com.dharmaputera.domain.model.book.Isbn
import com.dharmaputera.domain.model.book.Review
import com.google.gson.annotations.SerializedName

data class BookModel(
    @SerializedName("list_name")val listName : String,
    @SerializedName("display_name")val displayName : String,
    @SerializedName("bestsellers_date")val bestsellersDate : String,
    @SerializedName("published_date")val publishedDate : String,
    @SerializedName("rank")val rank : Int,
    @SerializedName("rank_last_week")val rankLastWeek : Int,
    @SerializedName("weeks_on_list")val weeksOnList : Int,
    @SerializedName("asterisk")val asterisk : Int,
    @SerializedName("dagger")val dagger : Int,
    @SerializedName("amazon_product_url")val amazonProductUrl : String,
    @SerializedName("isbns")val isbns : List<Isbn>,
    @SerializedName("book_details")val bookDetails : List<BookDetail>,
    @SerializedName("reviews")val reviews : List<Review>
)
