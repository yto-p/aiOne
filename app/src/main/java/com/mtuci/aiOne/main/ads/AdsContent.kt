package com.mtuci.aiOne.main.ads

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mtuci.aiOne.main.item.AdItem
import com.mtuci.aiOne.main.item.AdItemView
import com.mtuci.aiOne.main.item.SearchItemView

@Composable
fun AdsContent(viewModel: AdsViewModel, adItems: List<AdItem>){
    Box(modifier = Modifier
        .fillMaxSize()
        .navigationBarsPadding()
        .statusBarsPadding()){
        Column (
            modifier = Modifier.fillMaxSize()
        ){
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(vertical = 10.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = "My advertisements",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp
                )
            }
            Column(
                modifier = Modifier.fillMaxSize()
            ){
                LazyColumn(
                    contentPadding = PaddingValues(bottom = 80.dp),
                    modifier = Modifier.fillMaxHeight()
                ){
                    items(items = adItems){ adItem ->
                        AdItemView(adItem = adItem)
                    }
                }
            }
        }
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 95.dp)
                .padding(horizontal = 25.dp)
                .align(Alignment.BottomCenter)
        ) {
            Icon(
                painter = rememberVectorPainter(image = Icons.Outlined.Add),
                contentDescription = "",
                tint = Color.White
            )
            Text(
                text = "Create a new ad",
                fontSize = 16.sp,
                modifier = Modifier.padding(start = 5.dp)
            )
        }
    }
}