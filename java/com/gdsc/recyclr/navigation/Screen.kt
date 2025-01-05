package com.gdsc.recyclr.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

/*sealed class OnBoardingPage(
    @DrawableRes
    val image: Int,
    val title: String,
    val description: String)
{
    object First : OnBoardingPage(
        image = R.drawable.splash_image_1,
        title = "Let's start protecting our environment",
        description = "Scanning helps you understand what can be recycle at home and what can't."
    )

    object Second : OnBoardingPage(
        image = R.drawable.splash_image_2,
        title = "Scan the waste",
        description = "Scanning helps you understand what can be recycle at home and what can't."
    )

    object Third : OnBoardingPage(
        image = R.drawable.splash_image_3,
        title = "Earn and plant a tree",
        description = "Scanning helps you understand what can be recycle at home and what can't."
    )

}*/


sealed class Screen(val route: String) {

    object Home: Screen("home_screen")
    object Welcome : Screen("welcome_screen")
    object Scan: Screen("Scan_screen")
    object Shop: Screen("shop_screen")

    object Profile: Screen("profile_screen")
    object SignInScreen: Screen("signIn_screen")
    object ForgotPasswordScreen: Screen("forgotPassword_screen")
    object SignUpScreen: Screen("signUp_screen")
    object ProfileScreen: Screen("profile_screen")

}

sealed class BottomBarPage(
    val route: String,
    val title: String,
    val icon: ImageVector,
)
{
    object Home: BottomBarPage(
        route = "home",
        title = "Home",
        icon = Icons.Default.Home
    )
    object Scan: BottomBarPage(
        route = "scan",
        title = "Scan",
        icon = Icons.Default.PhotoCamera
    )
    object Shop: BottomBarPage(
        route = "shop",
        title = "Shop",
        icon = Icons.Default.ShoppingBag
    )
    object Profile: BottomBarPage(
        route = "profile",
        title = "Profile",
        icon = Icons.Default.Person
    )

}

sealed class GoogleScreen(val route: String) {
    object AuthScreen: GoogleScreen("Authentication")
    object ProfileScreen: GoogleScreen("Profile")
}