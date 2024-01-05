package com.mtuci.aiOne

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.core.view.WindowCompat
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mtuci.aiOne.auth.AuthContent
import com.mtuci.aiOne.auth.AuthScreen
import com.mtuci.aiOne.main.MainScreen
import com.mtuci.aiOne.main.ads.creating.CreatingContent

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        WindowCompat.getInsetsController(window, window.decorView).isAppearanceLightStatusBars = true
        setContent {
            MaterialTheme() {
                val navController = rememberNavController()

                NavHost(
                    startDestination = "auth",
                    navController = navController
                ) {
                    composable("main") {
                        MainScreen(navController)
                    }
                    composable("auth") {
                       AuthScreen(navController = navController)
                    }
                    composable("create") {
                        CreatingContent()
                    }
                }
            }
        }
    }


}
