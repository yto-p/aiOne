package com.mtuci.aiOne.auth

import android.content.SharedPreferences
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mtuci.aiOne.api.AiOneApi
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class AuthViewModel(
    private val sPref: SharedPreferences
) : ViewModel() {
    val login = MutableStateFlow("")
    val password = MutableStateFlow("")
    val isLoading = MutableStateFlow(false)
    val actions = Channel<Action>()
    private val api = AiOneApi()

    init {
        val token = sPref.getString("token", null)
        if (token != null){
            viewModelScope.launch {
                actions.send(Action.RouteMain)
            }
        }
    }

    fun onLoginClick(){
        isLoading.value = true
        viewModelScope.launch {
            try {
                val token = api.authorize(login.value, password.value)
                sPref.edit().putString("token", token).apply()
                sPref.edit().putString("login", login.value).apply()
                actions.send(Action.RouteMain)
            } catch (t: Throwable){ }
            isLoading.value = false
        }
    }
    sealed interface Action{
        object RouteMain : Action
    }
}