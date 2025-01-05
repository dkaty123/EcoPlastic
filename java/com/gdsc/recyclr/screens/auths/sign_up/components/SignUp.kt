package com.gdsc.recyclr.screens.auths.sign_up.components

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.hilt.navigation.compose.hiltViewModel
import com.gdsc.recyclr.components.composable.ProgressBar
import com.gdsc.recyclr.core.Utils.Companion.print
import com.gdsc.recyclr.domain.model.Response.*
import com.gdsc.recyclr.screens.auths.sign_up.SignUpViewModel
import com.gdsc.recyclr.screens.dashboard.MainScreen

@ExperimentalMaterialApi
@Composable
fun SignUp(
    viewModel: SignUpViewModel = hiltViewModel(),
) {
    when(val signUpResponse = viewModel.signUpResponse) {
        is Loading -> ProgressBar()
        is Success -> {
            val isUserSignedUp = signUpResponse.data
                if (isUserSignedUp == true) {
                    MainScreen()
                }
        }
        is Failure -> signUpResponse.apply {
            LaunchedEffect(e) {
                print(e)
            }
        }
    }
}