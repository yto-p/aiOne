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
            imageId = R.drawable.profile,
            price = "12500₽",
            title = "Advertisment",
            quantity = "125 pieces",
            status = "Status: checking", views = 0, likes = 0),
        AdItem(
            id = 0,
            imageId = R.drawable.profile,
            price = "12500₽",
            title = "Advertisment",
            quantity = "125 pieces",
            status = "Status: checking", views = 0, likes = 0)
    )
    AdsContent(viewModel = viewModel, adItems = items)
}