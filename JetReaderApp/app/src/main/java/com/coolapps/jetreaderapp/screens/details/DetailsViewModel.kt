package com.coolapps.jetreaderapp.screens.details

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.coolapps.jetreaderapp.data.Resource
import com.coolapps.jetreaderapp.model.Item
import com.coolapps.jetreaderapp.repository.BookRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DetailsViewModel @Inject constructor(private val repository: BookRepository)
    : ViewModel(){

        suspend fun getBookInfo(bookId: String): Resource<Item> {
            viewModelScope.launch {

            }
            return repository.getBookInfo(bookId)
        }
}