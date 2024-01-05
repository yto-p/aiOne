package com.mtuci.aiOne.main.ads

import androidx.compose.runtime.Composable
import com.mtuci.aiOne.R
import com.mtuci.aiOne.main.item.AdItem

@Composable
fun AdsScreen(){
    val viewModel = AdsViewModel()
    val items = listOf(
        AdItem(
            id = 0,
            imageId = R.drawable.nvidia,
            price = "34990₽",
            title = "NVIDIA GeForce RTX 3060",
            quantity = "2 pieces",
            status = "Status: checking", views = 0, likes = 0),
        AdItem(
            id = 1,
            imageId = R.drawable.jordan3,
            price = "29500₽",
            title = "Nike Air Jordan 3 Lucky Green",
            quantity = "1 piece",
            status = "Status: published", views = 213, likes = 8)
    )
    AdsContent(viewModel = viewModel, adItems = items)
}