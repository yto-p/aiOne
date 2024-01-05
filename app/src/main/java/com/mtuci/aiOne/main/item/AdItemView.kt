package com.mtuci.aiOne.main.item


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.HeartBroken
import androidx.compose.material.icons.filled.LocalSee
import androidx.compose.material.icons.filled.MonitorHeart
import androidx.compose.material.icons.filled.PanoramaFishEye
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AdItemView(adItem: AdItem){
    Column(
        modifier = Modifier
            .padding(vertical = 2.dp)
            .clickable { }

    ) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp, horizontal = 25.dp)
        ) {
            Image(
                painter = painterResource(id = adItem.imageId),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(70.dp)
                    .width(100.dp)
                    .clip(RoundedCornerShape(5.dp))
            )
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 15.dp)
            ) {
                Text(
                    text = adItem.price,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp,
                    modifier = Modifier.padding(top = 1.dp)
                )
                Text(
                    text = adItem.title,
                    fontSize = 13.sp
                )
                Text(
                    text = adItem.quantity,
                    fontSize = 13.sp
                )
                Text(
                    text = adItem.status,
                    fontSize = 13.sp,
                    color = Color.Gray
                )
                Spacer(modifier = Modifier.height(2.dp))
                Row (verticalAlignment = Alignment.CenterVertically){
                    Icon(
                        painter = rememberVectorPainter(image = Icons.Filled.Visibility),
                        contentDescription = "",
                        modifier = Modifier.size(18.dp)
                    )
                    Spacer(modifier = Modifier.width(2.dp))
                    Text(text = adItem.views.toString(), fontWeight = FontWeight.SemiBold)
                    Spacer(modifier = Modifier.width(5.dp))
                    Icon(
                        painter = rememberVectorPainter(image = Icons.Filled.Favorite),
                        contentDescription = "",
                        modifier = Modifier.size(18.dp)
                    )
                    Spacer(modifier = Modifier.width(2.dp))
                    Text(text = adItem.likes.toString(), fontWeight = FontWeight.SemiBold)
                }
            }
        }
    }
}