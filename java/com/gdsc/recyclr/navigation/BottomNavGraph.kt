package com.gdsc.recyclr.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.gdsc.recyclr.navigation.BottomBarPage
import com.gdsc.recyclr.screens.home.HomeScreen
import com.gdsc.recyclr.screens.profile.ProfileScreen
import com.gdsc.recyclr.screens.scan.ScanScreen
import com.gdsc.recyclr.screens.shop.ShopScreen

@Composable
fun BottomNavGraph(navController: NavHostController){
    NavHost(
        navController = navController ,
        startDestination = BottomBarPage.Home.route
    ){
        composable(route = BottomBarPage.Home.route){
            HomeScreen()
        }
        composable(route = BottomBarPage.Scan.route){
            ScanScreen()
        }
        composable(route = BottomBarPage.Shop.route){
            ShopScreen()
        }
        composable(route = BottomBarPage.Profile.route){
            ProfileScreen()
        }

    }
}
