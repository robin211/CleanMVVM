package com.dharmaputera.domain.use_case.get_books

import com.dharmaputera.domain.common.Resource
import com.dharmaputera.domain.model.book.Book
import com.dharmaputera.domain.model.book.GetBook
import com.dharmaputera.domain.repository.BookRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException
import javax.inject.Inject

class GetBooksFictionUseCase @Inject constructor(
    private val repository: BookRepository
) {
    operator fun invoke() : Flow<Resource<GetBook>> = flow {
        try{
            emit(Resource.Loading())
            val books = repository.getBooksFiction()
            emit(Resource.Success(books))
        }catch (e: IOException){
            emit(Resource.Error("Could not reach Server. Check your connections"))
        }
    }
}