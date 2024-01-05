package com.mtuci.aiOne.main.ads.creating

import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material.icons.outlined.ArrowBackIos
import androidx.compose.material.icons.outlined.Camera
import androidx.compose.material.icons.outlined.Photo
import androidx.compose.material.icons.outlined.PhotoCamera
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType.Companion.Uri
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import androidx.navigation.NavController
import coil.compose.rememberImagePainter

@Composable
fun CreatingContent(navController: NavController){
    var text1 by remember { mutableStateOf(TextFieldValue("")) }
    var text2 by remember { mutableStateOf(TextFieldValue("")) }
    var text3 by remember { mutableStateOf(TextFieldValue("")) }
    var text4 by remember { mutableStateOf(TextFieldValue("")) }
    var text5 by remember { mutableStateOf(TextFieldValue("")) }
    var text6 by remember { mutableStateOf(TextFieldValue("")) }

    var selectImages by remember { mutableStateOf(listOf<Uri>()) }
    val galeryLouncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetMultipleContents()) {
        selectImages = it
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .navigationBarsPadding()
            .statusBarsPadding()
            .padding(20.dp)
    ) {
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .fillMaxSize()
        ) {
            Spacer(modifier = Modifier.height(50.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .background(Color(0xFFF3EDF7))
                    .clickable { galeryLouncher.launch("image/*") },
            ) {
                if (selectImages.isNotEmpty()){
                    Image(
                        painter = rememberImagePainter(selectImages[0]),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxSize()
                    )
                } else {
                    Icon(
                        painter = rememberVectorPainter(image = Icons.Outlined.PhotoCamera),
                        contentDescription = "",
                        tint = Color.Gray,
                        modifier = Modifier.size(24.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Choose images",
                        color = Color.Gray
                    )
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            OutlinedTextField(
                value = text1,
                onValueChange = {newText -> text1 = newText},
                label = { Text("Title")},
                maxLines = 3,
                modifier = Modifier
                    .fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(5.dp))
            OutlinedTextField(
                value = text2,
                onValueChange = {newText -> text2 = newText},
                label = { Text("Condition")},
                maxLines = 1,
                modifier = Modifier
                    .fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Price and amount",
                fontSize = 15.sp,
                color = Color.Gray
            )
            OutlinedTextField(
                value = text3,
                onValueChange = {newText -> text3 = newText},
                label = { Text("Price")},
                maxLines = 1,
                modifier = Modifier
                    .fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(5.dp))
            OutlinedTextField(
                value = text4,
                onValueChange = {newText -> text4 = newText},
                label = { Text("Amount")},
                maxLines = 1,
                modifier = Modifier
                    .fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "City and Shipping info",
                fontSize = 15.sp,
                color = Color.Gray
            )
            OutlinedTextField(
                value = text5,
                onValueChange = {newText -> text5 = newText},
                label = { Text("City")},
                maxLines = 1,
                modifier = Modifier
                    .fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(5.dp))
            OutlinedTextField(
                value = text6,
                onValueChange = {newText -> text6 = newText},
                label = { Text("Shipping info")},
                maxLines = 1,
                modifier = Modifier
                    .fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = { navController.navigateUp() },
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Create advertisement",
                    fontSize = 16.sp,
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
        }
        IconButton(onClick = { navController.navigateUp() }) {
            Icon(
                painter = rememberVectorPainter(image = Icons.Outlined.ArrowBackIos),
                contentDescription = "",
                tint = Color.Gray,
                modifier = Modifier.size(20.dp)
            )
        }
    }

}