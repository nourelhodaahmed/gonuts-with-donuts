package com.android.gonutswithdonuts.entity

import androidx.compose.ui.graphics.Color

data class Donuts(
    val image: Int,
    val title: String,
    val description: String,
    val price: String,
    val oldPrice: String,
    val backgroundColor: Color
)
