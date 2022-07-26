package com.dharmaputera.cleanmvvm.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dharmaputera.cleanmvvm.model.BookListState
import com.dharmaputera.domain.common.Resource
import com.dharmaputera.domain.use_case.get_books.GetBooksFictionUseCase
import com.dharmaputera.domain.use_case.get_books.GetBooksNonFictionUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class BookNonFictionViewModel @Inject constructor(
    private val getBooksNonFictionUseCase: GetBooksNonFictionUseCase
) : ViewModel() {
    private val _state = MutableLiveData<BookListState>()
    val state: LiveData<BookListState> = _state

    init {
        getBooksNonFiction()
    }

    private fun getBooksNonFiction() {
        getBooksNonFictionUseCase().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.value = BookListState(books = result.data?.results ?: emptyList())
                }
                is Resource.Error -> {
                    _state.value = BookListState(error = result.message ?: "Unexpected Error!")
                }
                is Resource.Loading -> {
                    _state.value = BookListState(isLoading = true)
                }
            }
        }.launchIn(viewModelScope)
    }
}