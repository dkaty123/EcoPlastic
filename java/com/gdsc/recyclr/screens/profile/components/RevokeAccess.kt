package com.gdsc.recyclr.screens.profile.components

import androidx.compose.material.ScaffoldState
import androidx.compose.material.SnackbarResult
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import com.gdsc.recyclr.components.composable.ProgressBar
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import com.gdsc.recyclr.core.Utils.Companion.print
import com.gdsc.recyclr.core.Utils.Companion.showMessage
import com.gdsc.recyclr.domain.model.Response.*
import com.gdsc.recyclr.screens.profile.ProfileViewModel

@Composable
fun RevokeAccess(
    viewModel: ProfileViewModel = hiltViewModel(),
    scaffoldState: ScaffoldState,
    coroutineScope: CoroutineScope,
    signOut: () -> Unit,
) {
    val context = LocalContext.current

    fun showRevokeAccessMessage() = coroutineScope.launch {
        val result = scaffoldState.snackbarHostState.showSnackbar(
            message = "Your access has been revoked.!",
            actionLabel = "Sign Out"
        )
        if (result == SnackbarResult.ActionPerformed) {
            signOut()
        }
    }

    when(val revokeAccessResponse = viewModel.revokeAccessResponse) {
        is Loading -> ProgressBar()
        is Success -> {
            val isAccessRevoked = revokeAccessResponse.data
            LaunchedEffect(isAccessRevoked) {
                if (isAccessRevoked == true) {
                    showMessage(context, "Your access has been revoked.")
                }
            }
        }
        is Failure -> revokeAccessResponse.apply {
            LaunchedEffect(e) {
                print(e)
                if (e.message == "This operation is sensitive and requires recent authentication. Log in again before retrying this request.") {
                    showRevokeAccessMessage()
                }
            }
        }
    }
}