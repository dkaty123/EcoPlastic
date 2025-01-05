package com.gdsc.recyclr.screens.auths.sign_in.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight

@Composable
fun SignDetail() {
    Text(
        modifier = Modifier
            .fillMaxWidth(),
        text = "Authentication",
        style = MaterialTheme.typography.h5,
        fontWeight = FontWeight.Bold
    )
}