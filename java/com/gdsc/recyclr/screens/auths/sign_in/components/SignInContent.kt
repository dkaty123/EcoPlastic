package com.gdsc.recyclr.screens.auths.sign_in.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gdsc.recyclr.R
import com.gdsc.recyclr.components.composable.PasswordField
import com.gdsc.recyclr.components.composable.ButtonAuth
import com.gdsc.recyclr.components.composable.EmailField

@OptIn(ExperimentalMaterialApi::class)
@Composable
@ExperimentalComposeUiApi
fun SignInContent(
    signIn: (email: String, password: String) -> Unit,
    navigateToForgotPasswordScreen: () -> Unit,
    navigateToSignUpScreen: () -> Unit
) {
    var email by rememberSaveable(
        stateSaver = TextFieldValue.Saver
    ) { mutableStateOf(TextFieldValue("")) }
    var password by rememberSaveable(
        stateSaver = TextFieldValue.Saver
    ) { mutableStateOf(TextFieldValue("")) }
    val keyboard = LocalSoftwareKeyboardController.current

    Column(
        Modifier.fillMaxSize().background(Color.Green).padding(20.dp).verticalScroll(rememberScrollState()),
        //verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(modifier = Modifier.height(10.dp))
        SignDetail()
        Spacer(modifier = Modifier.size(60.dp))

        EmailField( email = email,onEmailValueChange = { newValue -> email = newValue })
        Spacer(modifier = Modifier.height(10.dp))

        PasswordField( password = password, onPasswordValueChange = { newValue -> password = newValue })
        Spacer(modifier = Modifier.height(10.dp))

        Spacer(modifier = Modifier.height(10.dp))
        // remember me and forget password
        Row(
            modifier = Modifier,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier.clickable {
                    navigateToForgotPasswordScreen()
                },
                text = "Forgot password ",
                style = TextStyle(
                    color = MaterialTheme.colors.primary,
                    fontSize = 15.sp
                )
            )

        }

        Spacer(modifier = Modifier.size(20.dp))
        Button(
            modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(10.dp)),
            colors = ButtonDefaults.buttonColors( backgroundColor = MaterialTheme.colors.secondary ),
            onClick = {
                keyboard?.hide()
                signIn(email.text, password.text)
            },

            ) {
            Text(
                text = "LOG IN",
                fontSize = 20.sp,
                color = MaterialTheme.colors.surface,
            )
        }

        Spacer(modifier = Modifier.height(50.dp))
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text( text = "or sign in with",fontWeight = FontWeight.W300)
            Spacer(modifier = Modifier.padding(30.dp))

            //login using google
            Row {

                ButtonAuth(
                    icon = R.drawable.ic_google_icon,
                    contentDescription = "Google Button",
                    onClicked = {/*click*/}
                )
                Spacer(modifier = Modifier.width(30.dp))
            }

            Spacer(modifier = Modifier.height(30.dp))

            // sign up text
            Row(
                modifier = Modifier.padding(10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {

                Text(text = "Don't you have an account?",)
                Spacer(modifier = Modifier.padding(3.dp))
                Text(
                    modifier = Modifier.clickable { navigateToSignUpScreen() },
                    text = "Sign up ",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colors.primary,
                    )
                )

            }
        }

    }

}