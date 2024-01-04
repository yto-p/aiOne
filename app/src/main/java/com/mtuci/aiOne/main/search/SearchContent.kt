package com.mtuci.aiOne.main.search

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Close
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchContent(viewModel: SearchViewModel){

    val searchText by viewModel.searchText.collectAsState()
    val isSearching by viewModel.isSearching.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 10.dp)
    ) {
        SearchBar(
            query = searchText,
            onQueryChange = viewModel::onSearchTextChange,
            onSearch = viewModel::onSearchTextChange,
            active = isSearching,
            onActiveChange = {viewModel.onToogleSearch()},
            placeholder = {
                Text(text = "Enter something to search...")
            },
            leadingIcon = {
                Icon(imageVector = Icons.Outlined.Search, contentDescription = "")
            },
            trailingIcon = {
                if (isSearching){
                    Icon(
                        imageVector = Icons.Outlined.Close,
                        contentDescription = "",
                        modifier = Modifier.clickable {
                            viewModel.onSearchTextChange("")
                        }
                    )
                }
            },
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        ) { }
        Spacer(modifier = Modifier.height(10.dp))
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ){
            Text(text = "No goods")
        }

    }

}