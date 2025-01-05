package com.gdsc.recyclr.screens.auths.sign_in

import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import com.gdsc.recyclr.core.Utils.Companion.showMessage
import com.gdsc.recyclr.screens.auths.sign_in.components.SignIn
import com.gdsc.recyclr.screens.auths.sign_in.components.SignInContent

@Composable
@ExperimentalComposeUiApi
fun SignInScreen(
    viewModel: SignInViewModel = hiltViewModel(),
    navigateToForgotPasswordScreen: () -> Unit,
    navigateToSignUpScreen: () -> Unit,
) {
        val context = LocalContext.current
        SignInContent(
            signIn = { email, password -> viewModel.signInWithEmailAndPassword(email, password) },
            navigateToForgotPasswordScreen = navigateToForgotPasswordScreen,
            navigateToSignUpScreen = navigateToSignUpScreen
        )
    SignIn(
        showErrorMessage = { errorMessage ->
            showMessage(context, errorMessage)
        }
    )
}