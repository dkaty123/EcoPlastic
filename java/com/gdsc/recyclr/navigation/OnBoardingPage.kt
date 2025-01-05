@file:Suppress("unused")

package com.gdsc.recyclr.navigation

import androidx.annotation.DrawableRes
import com.gdsc.recyclr.R

sealed class OnBoardingPage(
    @DrawableRes
    val image: Int,
    val title: String,
    val description: String)
{
    object First : OnBoardingPage(
        image =R.drawable.profile,
        title = "Let's start protecting our environment",
        description = "Scanning helps you understand what can be recycle at home and what can't."
    )

    object Second : OnBoardingPage(
        image = R.drawable.profile,
        title = "Scan the waste",
        description = "Scanning helps you understand what can be recycle at home and what can't."
    )

    object Third : OnBoardingPage(
        image = R.drawable.profile,
        title = "Earn and plan a tree",
        description = "Scanning helps you understand what can be recycle at home and what can't."
    )

}

