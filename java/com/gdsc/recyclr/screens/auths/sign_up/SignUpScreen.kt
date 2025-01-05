package com.gdsc.recyclr.screens.auths.sign_up

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.hilt.navigation.compose.hiltViewModel
import com.gdsc.recyclr.screens.auths.sign_up.components.SignUpContent

@ExperimentalMaterialApi
@Composable
@ExperimentalComposeUiApi
fun SignUpScreen(
    viewModel: SignUpViewModel = hiltViewModel(),
    navigateBack: () -> Unit
) {
    SignUpContent(
        signUp = { name,email, password ->viewModel.signUpWithEmailAndPassword(name, email, password)
        },
        navigateBack = navigateBack
    )

}