package com.gdsc.recyclr.screens.auths.forgot_password

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import com.gdsc.recyclr.core.Utils.Companion.showMessage
import com.gdsc.recyclr.screens.auths.forgot_password.components.ForgotPassword
import com.gdsc.recyclr.screens.auths.forgot_password.components.ForgotPasswordContent

@Composable
fun ForgotPasswordScreen(
    viewModel: ForgotPasswordViewModel = hiltViewModel(),
    navigateBack: () -> Unit
) {
    val context = LocalContext.current
    ForgotPasswordContent(
        sendPasswordResetEmail = { email ->
            viewModel.sendPasswordResetEmail(email)
        }
    )

    ForgotPassword(
        navigateBack = navigateBack,
        showResetPasswordMessage = {
            showMessage(context, "Reset Password")
        },
        showErrorMessage = { errorMessage ->
            showMessage(context, errorMessage)
        }
    )
}