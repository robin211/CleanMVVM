package com.dharmaputera.data.extensions

import com.dharmaputera.data.model.book.GetBookModel
import com.dharmaputera.domain.model.book.GetBook

fun GetBookModel.toGetBook(): GetBook{
    return GetBook(
        status,
        copyright,
        numResults,
        lastModified,
        results
    )
}