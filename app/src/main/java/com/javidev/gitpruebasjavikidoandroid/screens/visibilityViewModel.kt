package com.javidev.gitpruebasjavikidoandroid.screens

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class visibilityViewModel: ViewModel() {
    private var _visibility = mutableStateOf(true)
    val visibility: State<Boolean> get() = _visibility

    fun onChangeVisibility(){
        _visibility.value != _visibility.value
    }
}