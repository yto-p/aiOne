package com.mtuci.aiOne.auth

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController

@Composable
fun AuthScreen(navController: NavController){
    val viewModel = viewModel<AuthViewModel>()
    val login by viewModel.login.collectAsState()
    val password by viewModel.password.collectAsState()

    LaunchedEffect(Unit) {
        for (action in viewModel.actions){
            when(action){
                AuthViewModel.Action.RouteMain -> navController.navigate("main")
            }
        }
    }

    AuthContent(
        login = login,
        onLoginChange = { value -> viewModel.login.value = value },
        password = password,
        onPasswordChange = { value -> viewModel.password.value = value},
        onLoginClick = {viewModel.onLoginClick()})
}