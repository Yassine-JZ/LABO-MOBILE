package com.example.thirtydaysoftravel.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class TravelDay(
    val day: Int,
    @StringRes val title: Int,
    @StringRes val description: Int,
    @DrawableRes val image: Int
)