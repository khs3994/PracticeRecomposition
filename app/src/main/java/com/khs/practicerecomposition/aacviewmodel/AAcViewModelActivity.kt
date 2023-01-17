package com.khs.practicerecomposition.aacviewmodel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material.Button
import androidx.compose.material.Text

//기존에 사용하던 AAcViewModel을 이용한 데이터 유지
class AAcViewModelActivity : ComponentActivity() {
    private val vm by viewModels<AAcViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Button(onClick = { vm.data.value = "Hello!" }) {
                Text(text = vm.data.value)
            }
        }
    }
}