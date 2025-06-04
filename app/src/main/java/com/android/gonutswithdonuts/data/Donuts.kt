package com.android.gonutswithdonuts.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import com.android.gonutswithdonuts.R
import com.android.gonutswithdonuts.ui.theme.BabyBlue
import com.android.gonutswithdonuts.ui.theme.LiteBink

data class Donuts(
    val image: Int,
    val title: String,
    val description: String,
    val price: String,
    val oldPrice: String,
    val backgroundColor: Color
)

val todayOffersData: List<Donuts> = listOf(
    Donuts(
        R.drawable.today_donuts1,
        "Strawberry Wheel",
        "These Baked Strawberry Donuts are filled with fresh strawberries...",
        "\$16",
        "\$20",
        BabyBlue
    ),
    Donuts(
        R.drawable.today_donuts2,
        "Chocolate Glaze",
        "Moist and fluffy baked chocolate donuts full of chocolate flavor.",
        "\$16",
        "\$20",
        LiteBink
    )
)

val donutsPriceData: List<Donuts> = listOf(
    Donuts(
        R.drawable.donuts_data_1,
        "Chocolate Cherry",
        "",
        "\$22",
        "",
        White
    ),
    Donuts(
        R.drawable.donuts_data_2,
        "Strawberry Rain",
        "",
        "\$22",
        "",
        White
    ),
    Donuts(
        R.drawable.donuts_data_3,
        "Strawberry",
        "",
        "\$22",
        "",
        White
    )

)