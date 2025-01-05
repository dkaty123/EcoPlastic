package com.gdsc.recyclr.screens.profile.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.gdsc.recyclr.R
import androidx.compose.ui.unit.sp
import com.gdsc.recyclr.ui.theme.Gray_color

@Composable
fun ProfileContent(
    padding: PaddingValues
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Gray_color)
            .padding(15.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            imageVector = Icons.Default.AccountCircle,
            contentDescription = "avatar",
            modifier = Modifier.size(200.dp)
        )
        Card(
            modifier = Modifier
                .height(150.dp)
                .padding(vertical = 30.dp),
            shape = RoundedCornerShape(12.dp),
            ) {
            Column(
                modifier = Modifier
                .padding(horizontal = 50.dp),
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "John Doe",
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp
                )
                Row(
                    horizontalArrangement = Arrangement.Center) {
                    Text(text = "0",
                        fontSize = 20.sp
                    )
                    Image(
                        modifier = Modifier.padding(5.dp),
                        alignment = Alignment.BottomCenter,
                        painter = painterResource(id = R.drawable.coins),
                        contentDescription = "coins")
                }
            }
        }
        Spacer(modifier = Modifier.height(15.dp))
        Card(modifier = Modifier
            .fillMaxWidth(),
            shape = RoundedCornerShape(12.dp)
        ) {
            Column(modifier = Modifier.padding(vertical = 20.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.people_planting_a_tree),
                    contentDescription = "trees_planted",
                    modifier = Modifier.size(100.dp)
                )
                Text(text = "You saved 0 tree(s)")
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        Card(modifier = Modifier
            .fillMaxWidth()
            .height(100.dp),
            shape = RoundedCornerShape(12.dp)) {
            Text(
                text = "E-Mail: nibruce@gmail.com",
                modifier = Modifier.padding(vertical = 20.dp, horizontal = 10.dp))
        }
    }
}