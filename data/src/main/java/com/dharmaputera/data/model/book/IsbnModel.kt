package com.dharmaputera.data.model.book

import com.google.gson.annotations.SerializedName

data class IsbnModel(
    @SerializedName("isbn10")val isbn10 : String,
    @SerializedName("isbn13")val isbn13 : String,
)
