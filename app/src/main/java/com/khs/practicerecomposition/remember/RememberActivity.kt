package com.khs.practicerecomposition.remember

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

//remember 키워드를 이용한 데이터 유지 
class RememberActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var data by remember {
                mutableStateOf("hi!")
            }
            Button(onClick = { data = "hello!" }) {
                Text(text = data)
            }
        }
    }
}