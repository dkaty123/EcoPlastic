package com.gdsc.recyclr.screens.shop

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gdsc.recyclr.R
import com.gdsc.recyclr.ui.theme.Gray_color
import com.gdsc.recyclr.ui.theme.Green_color

@Composable
fun ShopItemCard(shopItem: ShopItem){
    Card(
        modifier = Modifier
            .width(210.dp)
            .height(230.dp)
            .background(Gray_color)
            .clip(RoundedCornerShape(10.dp)),
    ){
        Column(
            modifier = Modifier.padding(vertical = 14.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(shopItem.imageId),
                contentDescription = null,
                modifier = Modifier.size(99.dp)
            )
            Text(
                text = shopItem.title,
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold

            )

            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = "${shopItem.price} coins",
                    fontSize = 12.sp,
                )

                Image(
                    modifier = Modifier.size(15.dp),
                    painter = painterResource(R.drawable.coins),
                    contentDescription = "coins",
                )
            }

            Button(
                modifier = Modifier.defaultMinSize(minHeight = 1.dp),
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(backgroundColor = Green_color),
                contentPadding = PaddingValues(horizontal = 20.dp,vertical = 0.dp)
            ) {
                Text(
                    text = stringResource(R.string.redeem),
                    fontSize = 15.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}