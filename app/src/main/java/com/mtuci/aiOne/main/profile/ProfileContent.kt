package com.mtuci.aiOne.main.profile

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mtuci.aiOne.R

@Composable
fun ProfileContent(){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .systemBarsPadding()
            .navigationBarsPadding()
            .padding(vertical = 25.dp)
    ){
        Column(
            modifier = Modifier.padding(horizontal = 20.dp)
        ) {
            Box(modifier = Modifier.fillMaxWidth()) {
                Image(
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(96.dp)
                        .clip(CircleShape)
                        .align(Alignment.CenterStart)

                )
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .align(Alignment.CenterEnd)
                        .padding(end = 20.dp),

                ) {
                    Text(
                        text = "Edit",
                        modifier = Modifier.padding(horizontal = 30.dp, vertical = 5.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = "Username",
                fontWeight = FontWeight.SemiBold,
                fontSize = 32.sp
            )
            Text(
                text = "@nickname",
                fontSize = 14.sp
            )
        }
        Spacer(modifier = Modifier.height(24.dp))
        Divider(color = Color.LightGray, thickness = 1.dp)
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 15.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.weight(1f)
            ){
                Text(
                    text = "Purchases",
                    fontSize = 14.sp
                )
                Text(
                    text = "0",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 18.sp
                )
            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = "Sales",
                    fontSize = 14.sp
                    )
                Text(
                    text = "0",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 18.sp
                )
            }
        }
        Divider(color = Color.LightGray, thickness = 1.dp)
    }
}