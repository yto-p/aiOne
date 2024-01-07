package com.mtuci.aiOne.auth

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController

@Composable
fun AuthScreen(navController: NavController){
    val context = LocalContext.current
    val viewModel = viewModel{
        val application = get(APPLICATION_KEY)!!
        val sPref = application.getSharedPreferences("data", MODE_PRIVATE)
        AuthViewModel(sPref)
    }
    val login by viewModel.login.collectAsState()
    val password by viewModel.password.collectAsState()
    val isLoading by viewModel.isLoading.collectAsState()

    LaunchedEffect(Unit) {
        for (action in viewModel.actions){
            when(action){
                AuthViewModel.Action.RouteMain -> {
                    navController.navigate("main"){
                        popUpTo(0)
                    }
                }
                AuthViewModel.Action.ShowRequestError -> {
                    showToast(context)
                }

            }
        }
    }

    AuthContent(
        login = login,
        onLoginChange = { value -> viewModel.login.value = value },
        password = password,
        onPasswordChange = { value -> viewModel.password.value = value},
        onLoginClick = {viewModel.onLoginClick()},
        isLoading = isLoading)
}

fun showToast(context: Context){
    Toast.makeText(context, "Authorisation error", Toast.LENGTH_SHORT).show()
}