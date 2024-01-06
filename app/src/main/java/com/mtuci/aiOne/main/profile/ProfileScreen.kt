package com.mtuci.aiOne.main.profile

import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController

@Composable
fun ProfileScreen(controller: NavController){
    val application = LocalContext.current.applicationContext
    val sPref = remember{application.getSharedPreferences("data", MODE_PRIVATE)}
    ProfileContent(
        login = sPref.getString("login", "")!!,
        onExitClick = {
            sPref.edit().remove("token").apply()
            controller.navigate("auth"){
                popUpTo(0)
            }
        }
    )

}
