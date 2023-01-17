package com.khs.practicerecomposition.aacviewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class AAcViewModel : ViewModel() {
    private val _data = mutableStateOf("hi!")
    val data: MutableState<String> get() = _data
}