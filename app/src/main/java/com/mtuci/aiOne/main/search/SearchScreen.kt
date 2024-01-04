package com.mtuci.aiOne.main.search

import androidx.compose.runtime.Composable

@Composable
fun SearchScreen(){
    val viewModel = SearchViewModel()
    SearchContent(viewModel)
}