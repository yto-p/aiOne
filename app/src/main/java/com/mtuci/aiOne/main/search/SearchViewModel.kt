package com.mtuci.aiOne.main.search

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class SearchViewModel : ViewModel() {
    private val _isSearching = MutableStateFlow(false)
    val isSearching = _isSearching.asStateFlow()

    private val _searchText = MutableStateFlow("")
    val searchText = _searchText.asStateFlow()

    fun onSearchTextChange(text: String){
        _searchText.value = text
    }

    fun onToogleSearch(){
        _isSearching.value = !_isSearching.value
        if (!_isSearching.value){
            onSearchTextChange("")
        }
    }
}