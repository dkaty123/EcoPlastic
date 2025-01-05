package com.gdsc.recyclr.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gdsc.recyclr.R
import com.gdsc.recyclr.ui.theme.Gray_color
import com.gdsc.recyclr.ui.theme.Green_color
import com.gdsc.recyclr.ui.theme.Red_color

@Composable
fun HomeContent(
    padding: PaddingValues
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Gray_color)
            .padding(padding)
            .padding(20.dp),
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 10.dp)
        ) {
            Text(text = "Welcome Back", fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.padding(10.dp))


            //Card reward and scan
            Row(
                Modifier.width(200.dp).height(150.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            )
            {
                //Reward
                Card(
                    modifier = Modifier
                        .clip(RoundedCornerShape(8.dp))
                        .fillMaxSize()
                )
                {

                    Row(
                        modifier = Modifier.fillMaxSize().background(Green_color)
                            .padding(10.dp),
                    ) {

                        Icon(
                            painter = painterResource(id = R.drawable.reward),
                            contentDescription = null,
                            tint = Color.Unspecified
                        )

                        Spacer(modifier = Modifier.width(20.dp))

                        Column(
                        ) {
                            Text(
                                text = "You've earned"
                            )
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "106", fontWeight = FontWeight.Bold
                            )
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "Points"
                            )
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "12 points last week",
                                style = TextStyle(
                                    fontWeight = FontWeight.W600,
                                    fontSize = 5.sp
                                )
                            )
                        }
                    }

                }

                // Scan
                Card(
                    modifier = Modifier
                        .clip(RoundedCornerShape(8.dp)).width(70.dp)
                        .height(150.dp)
                        .background(Red_color),
                ) {
                    Text(
                        text = "Scan",
                        style = TextStyle(
                            fontWeight = FontWeight.W400,
                            fontSize = 5.sp
                        )
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.scan),
                        contentDescription = null
                    )

                }
            }

            // categories

            Column() {
                Text(
                    text ="Categories",
                )

            }

        }
    }
}