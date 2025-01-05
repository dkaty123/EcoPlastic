@file:Suppress("UNUSED_EXPRESSION")

package com.gdsc.recyclr.components.composable

import android.graphics.Color.parseColor
import androidx.annotation.StringRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gdsc.recyclr.ui.theme.Shapes

@Composable
fun BasicTextButton(@StringRes text: Int, modifier: Modifier, action: () -> Unit) {
  TextButton(onClick = action, modifier = modifier) { Text(text = stringResource(text)) }
}

@Composable
fun BasicButton(@StringRes text: Int, action: () -> Unit) {
  Button(
    onClick = action,
    modifier = Modifier.width(341.dp).height(39.dp).clip(RoundedCornerShape(10.dp)),
    colors =
      ButtonDefaults.buttonColors(
        backgroundColor = "#89BC84".color,
        contentColor = MaterialTheme.colors.onSurface
      )
  ) {
    Text(text = stringResource(text), fontSize = 16.sp)
  }
}

@Composable
fun ButtonIcon(
  imageVector: ImageVector,
  contentDescription: String,
  onClickIcon: () -> Unit
){
  IconButton(

    onClick = {
      onClickIcon
    }) {
    Icon(
      imageVector = imageVector,
      contentDescription = contentDescription
    )
  }
}

@ExperimentalMaterialApi
@Composable
fun ButtonAuth(
  modifier: Modifier = Modifier,
  icon: Int,
  contentDescription: String,
  shape: Shape = Shapes.medium,
  borderColor: Color = Color.LightGray,
  backgroundColor: Color = MaterialTheme.colors.surface,
  onClicked: () -> Unit
) {

  var clicked by remember { mutableStateOf(false) }

  Surface(
    onClick = { clicked = !clicked },
    shape = Shapes.medium,
    border = BorderStroke(width = 2.dp, color = Color.LightGray),
    color = MaterialTheme.colors.surface

  ) {

    Surface(
      modifier = modifier
        .clickable { clicked = !clicked },
      shape = shape,
      border = BorderStroke(width = 1.dp, color = borderColor),
      color = backgroundColor
    ) {
      Row(
        modifier = Modifier
          .padding(all = 15.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
      ) {

        Icon(
          painter = painterResource(id = icon),
          contentDescription = contentDescription,
          tint = Color.Unspecified
        )
        if (clicked) {
          onClicked()
        }
      }
    }
  }
}






val String.color
  get() = Color(parseColor(this))
