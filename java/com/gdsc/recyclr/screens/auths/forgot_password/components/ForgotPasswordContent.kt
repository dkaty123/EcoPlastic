package com.gdsc.recyclr.screens.auths.forgot_password.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gdsc.recyclr.components.composable.EmailField
import com.gdsc.recyclr.screens.auths.sign_up.components.SignUpDetail

@Composable
fun ForgotPasswordContent(
    sendPasswordResetEmail: (email: String) -> Unit,
) {
    var email by rememberSaveable(
        stateSaver = TextFieldValue.Saver
    ) { mutableStateOf(TextFieldValue("")) }

    Column(
        Modifier.fillMaxSize().background(Color.Green).padding(20.dp).verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(10.dp))
        SignUpDetail()
        Spacer(modifier = Modifier.size(60.dp))

        EmailField( email = email,onEmailValueChange = { newValue -> email = newValue })
        Spacer(modifier = Modifier.height(10.dp))

        Spacer(modifier = Modifier.size(20.dp))
        Button(
            modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(10.dp)),
            colors = ButtonDefaults.buttonColors( backgroundColor = MaterialTheme.colors.secondary ),
            onClick = {
                sendPasswordResetEmail(email.text)
            },
        ) {
            Text(
                text = "SUBMIT",
                fontSize = 20.sp,
                color = MaterialTheme.colors.surface,
            )
        }
    }
}