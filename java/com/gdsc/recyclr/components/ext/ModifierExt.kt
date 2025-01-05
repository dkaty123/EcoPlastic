package com.gdsc.recyclr.components.ext

import androidx.compose.foundation.layout.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

fun Modifier.textDescription(): Modifier {
  return this.fillMaxWidth().padding(top = 10.dp, bottom = 10.dp)
}

fun Modifier.textAuth(): Modifier {
  return this.fillMaxWidth().padding(top = 70.dp)
}

fun Modifier.basicButton(): Modifier {
  return this.fillMaxWidth().padding(16.dp, 8.dp)
}

fun Modifier.card(): Modifier {
  return this.padding(16.dp, 0.dp, 16.dp, 8.dp)
}

fun Modifier.fieldModifier(): Modifier {
  return this.fillMaxWidth().padding(16.dp, 4.dp)
}

fun Modifier.spacer(): Modifier {
  return this.fillMaxWidth().padding(12.dp)
}

fun Modifier.smallSpacer(): Modifier {
  return this.fillMaxWidth().height(8.dp)
}
