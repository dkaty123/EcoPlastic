@file:Suppress("DEPRECATION")

package com.gdsc.recyclr.navigation

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.navigation.NavHostController
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.composable
import com.gdsc.recyclr.navigation.Screen.*
import com.gdsc.recyclr.screens.auths.forgot_password.ForgotPasswordScreen
import com.gdsc.recyclr.screens.auths.sign_in.SignInScreen
import com.gdsc.recyclr.screens.auths.sign_up.SignUpScreen
import com.gdsc.recyclr.screens.dashboard.MainScreen

@ExperimentalMaterialApi
@Composable
@ExperimentalAnimationApi
@ExperimentalComposeUiApi
fun NavGraph( navController: NavHostController ) {
    AnimatedNavHost(
        navController = navController,
        startDestination = SignInScreen.route,
        enterTransition = {EnterTransition.None },
        exitTransition = { ExitTransition.None }
    ) {
        composable(route = SignInScreen.route) {
            SignInScreen(
                navigateToForgotPasswordScreen = {
                    navController.navigate(ForgotPasswordScreen.route)
                },
                navigateToSignUpScreen = {
                    navController.navigate(SignUpScreen.route)
                }
            )
        }
        composable(
            route = ForgotPasswordScreen.route
        ) {
            ForgotPasswordScreen(
                navigateBack = {
                    navController.popBackStack()
                }
            )
        }
        composable(
            route = SignUpScreen.route
        ) {
            SignUpScreen(
                navigateBack = {
                    navController.popBackStack()
                }
            )
        }
        composable(
            route = ProfileScreen.route
        ) {
            MainScreen()
        }
    }
}
