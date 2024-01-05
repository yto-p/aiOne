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
            title = "Apple iPhone 15 Pro 512 GB",
            cond = "Condition: new",
            price = "99500₽",
            del = "+500₽ for delivery",
            city = "City: Saint P.",
            seller = "re-store"
        ),
        SearchItem(
            id = 1,
            imageId = R.drawable.jordan,
            title = "Nike Air Jordan 4 Lighting 10 US/44 EU",
            cond = "Condition: was used",
            price = "18990₽",
            del = "+150₽ for delivery",
            city = "City: Moscow",
            seller = "Alex Ivanov"
        ),
        SearchItem(
            id = 2,
            imageId = R.drawable.airpods,
            title = "Apple Airpods Pro",
            cond = "Condition: new",
            price = "17990₽",
            del = "+150₽ for delivery",
            city = "City: Moscow",
            seller = "Tech seller"
        ),
        SearchItem(
            id = 3,
            imageId = R.drawable.tnf,
            title = "Puffer The north face Nuptse Purple",
            cond = "Condition: new",
            price = "33000₽",
            del = "free delivery",
            city = "City: Moscow",
            seller = "Sneakerhead"
        ),
        SearchItem(
            id = 4,
            imageId = R.drawable.jbl,
            title = "JBL Flip 6",
            cond = "Condition: was used",
            price = "7990₽",
            del = "+500₽ for delivery",
            city = "City: Saint P.",
            seller = "online-trade"
        )
    )
    SearchContent(viewModel, items)
}