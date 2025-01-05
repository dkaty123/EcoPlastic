package com.gdsc.recyclr.screens.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.gdsc.recyclr.components.composable.BasicTopBar
import com.gdsc.recyclr.screens.profile.components.ProfileContent

@Composable
fun HomeScreen() {
    Scaffold(
        topBar = {
            BasicTopBar("Recyclr")
        },
        content = { padding ->
            HomeContent(
                padding = padding
            )
        },
    )
}

@Preview(showBackground = true)
@Composable
private fun PreviewHomeScreen() {
    HomeScreen()
}