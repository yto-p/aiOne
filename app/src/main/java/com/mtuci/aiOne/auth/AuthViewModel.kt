package com.mtuci.aiOne.auth

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class AuthViewModel : ViewModel() {
    val login = MutableStateFlow("")
    val password = MutableStateFlow("")
    val actions = Channel<Action>()
    fun onLoginClick(){
        viewModelScope.launch {
            actions.send(Action.RouteMain)
        }
    }
    sealed interface Action{
        object RouteMain : Action
    }
}