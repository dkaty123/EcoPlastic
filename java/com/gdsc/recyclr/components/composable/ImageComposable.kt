package com.gdsc.recyclr.components.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gdsc.recyclr.R

@Composable
fun ImageComponent(
    painter: Painter,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    alignment: Alignment = Alignment.Center,
) {

    Image(
        modifier = modifier,
        alignment = alignment,
        painter = painter,
        contentDescription = contentDescription
    )

}

@Preview(showBackground = true)
@Composable
private fun PreviewReusableImage() {
    ImageComponent(
        modifier = Modifier
            .background(color = Color.Yellow)
            .size(200.dp)
            .clip(CircleShape)
            .border(
                width = 5.dp,
                color = Color.Green,
                shape = CircleShape),
        painter = painterResource(id = R.drawable.profile),
        contentDescription = "profile image"
    )
}