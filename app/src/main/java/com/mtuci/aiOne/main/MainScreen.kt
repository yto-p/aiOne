package com.mtuci.aiOne.main

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mtuci.aiOne.main.ads.AdsContent
import com.mtuci.aiOne.main.profile.ProfileContent
import com.mtuci.aiOne.main.search.SearchContent
import com.mtuci.aiOne.main.search.SearchScreen

@Composable
fun MainScreen(
    navController: NavController
) {
    val controller = rememberNavController()
    MainContent(controller)
    NavHost(navController = controller, startDestination = "search"){
        composable("search"){
            SearchScreen()
        }
        composable("ads"){
            AdsContent()
        }
        composable("profile"){
            ProfileContent()
        }
    }
}