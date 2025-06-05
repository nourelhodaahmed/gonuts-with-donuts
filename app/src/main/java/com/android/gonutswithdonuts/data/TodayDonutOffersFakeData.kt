package com.android.gonutswithdonuts.data

import com.android.gonutswithdonuts.R
import com.android.gonutswithdonuts.entity.Donuts
import com.android.gonutswithdonuts.ui.theme.BabyBlue
import com.android.gonutswithdonuts.ui.theme.LiteBink

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