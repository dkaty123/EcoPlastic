package com.gdsc.recyclr.screens.auths.sign_up.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight

@Composable
fun SignUpDetail(
) {
    Text(
        modifier = Modifier
            .fillMaxWidth(),
        text = "Create account",
        style = MaterialTheme.typography.h5,
        fontWeight = FontWeight.Bold
    )
}