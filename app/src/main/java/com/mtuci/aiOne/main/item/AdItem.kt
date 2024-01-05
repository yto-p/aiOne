package com.mtuci.aiOne.main.item



data class AdItem(
    val id: Int,
    val imageId: Int,
    val price: String,
    val title: String,
    val quantity: String,
    val status: String,
    val views: Int,
    val likes: Int
)
