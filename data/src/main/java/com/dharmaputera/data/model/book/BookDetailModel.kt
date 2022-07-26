package com.dharmaputera.data.model.book

import com.google.gson.annotations.SerializedName

data class BookDetailModel(
    @SerializedName("title") val title : String,
    @SerializedName("description") val description : String,
    @SerializedName("contributor") val contributor : String,
    @SerializedName("author") val author : String,
    @SerializedName("contributor_note") val contributorNote : String,
    @SerializedName("price") val price : Double,
    @SerializedName("age_group") val ageGroup : String,
    @SerializedName("publisher") val publisher : String,
    @SerializedName("primary_isbn13") val primaryIsbn13 : String,
    @SerializedName("primary_isbn10") val primaryIsbn10 : String,
)
