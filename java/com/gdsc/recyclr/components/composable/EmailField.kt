package com.gdsc.recyclr.components.composable

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue

@Composable
fun EmailField(
    email: TextFieldValue,
    onEmailValueChange: (newValue: TextFieldValue) -> Unit
) {
    val focusManager = LocalFocusManager.current

    OutlinedTextField(
        value = email,
        modifier = Modifier.fillMaxWidth(),
        onValueChange = { newValue -> onEmailValueChange(newValue) },
        label = { Text( text = "E-mail" )},
        placeholder = { Text("Enter email") },
        leadingIcon = { Icon( imageVector = Icons.Default.Email, contentDescription = "Email" )},
        keyboardOptions = KeyboardOptions ( keyboardType = KeyboardType.Email,imeAction = ImeAction.Next),
        keyboardActions = KeyboardActions( onNext = {focusManager.moveFocus(FocusDirection.Down) }),
        singleLine = true,
    )

}