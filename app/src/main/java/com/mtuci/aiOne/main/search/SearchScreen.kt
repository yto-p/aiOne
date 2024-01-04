package com.mtuci.aiOne.main.search

import androidx.compose.runtime.Composable
import com.mtuci.aiOne.R
import com.mtuci.aiOne.main.item.SearchItem

@Composable
fun SearchScreen(){
    val viewModel = SearchViewModel()
    val items = listOf(
        SearchItem(
            id = 0,
            imageId = R.drawable.profile,
            title = "Товар1",
            price = "1500₽",
            seller = "Продавец1"
        ),
        SearchItem(
            id = 0,
            imageId = R.drawable.profile,
            title = "Товар1",
            price = "1500₽",
            seller = "Продавец1"
        ),
        SearchItem(
            id = 0,
            imageId = R.drawable.profile,
            title = "Товар1",
            price = "1500₽",
            seller = "Продавец1"
        ),
        SearchItem(
            id = 0,
            imageId = R.drawable.profile,
            title = "Товар1",
            price = "1500₽",
            seller = "Продавец1"
        ),
        SearchItem(
            id = 0,
            imageId = R.drawable.profile,
            title = "Товар1",
            price = "1500₽",
            seller = "Продавец1"
        ),
        SearchItem(
            id = 0,
            imageId = R.drawable.profile,
            title = "Товар1",
            price = "1500₽",
            seller = "Продавец1"
        ),
        SearchItem(
            id = 0,
            imageId = R.drawable.profile,
            title = "Товар1",
            price = "1500₽",
            seller = "Продавец1"
        )
    )
    SearchContent(viewModel, items)
}