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
            imageId = R.drawable.iphone,
            title = "Apple iPhone 15",
            price = "99500₽",
            seller = "re-store"
        ),
        SearchItem(
            id = 1,
            imageId = R.drawable.jordan,
            title = "Nike Air Jordan 4",
            price = "23800₽",
            seller = "sneakerhead"
        ),
        SearchItem(
            id = 2,
            imageId = R.drawable.airpods,
            title = "Apple Airpods Pro",
            price = "17990₽",
            seller = "Tech seller"
        ),
        SearchItem(
            id = 3,
            imageId = R.drawable.tnf,
            title = "Puffer The north face Nuptse",
            price = "33000₽",
            seller = "Alex Ivanov"
        ),
        SearchItem(
            id = 4,
            imageId = R.drawable.jbl,
            title = "JBL Flip 6",
            price = "11990₽",
            seller = "online-trade"
        ),
        SearchItem(
            id = 5,
            imageId = R.drawable.doritos,
            title = "Doritos Nacho Cheese",
            price = "1500₽",
            seller = "IP Foodbox"
        )
    )
    SearchContent(viewModel, items)
}