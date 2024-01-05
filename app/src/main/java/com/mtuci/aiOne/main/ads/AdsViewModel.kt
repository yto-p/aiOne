package com.mtuci.aiOne.main.ads

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch

class AdsViewModel : ViewModel() {
    val actions = Channel<Action>()
    fun onCreateClick(){
        viewModelScope.launch {
            actions.send(Action.RouteCreation)
        }
    }
    sealed interface Action{
        object RouteCreation : Action
    }
}