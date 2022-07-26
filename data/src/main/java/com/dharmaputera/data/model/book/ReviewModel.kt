package com.dharmaputera.data.model.book

import com.google.gson.annotations.SerializedName

data class ReviewModel(
    @SerializedName("book_review_link")val bookReviewLink : String,
    @SerializedName("first_chapter_link")val firstChapterLink : String,
    @SerializedName("sunday_review_link")val sundayReviewLink : String,
    @SerializedName("article_chapter_link")val articleChapterLink : String,
)
