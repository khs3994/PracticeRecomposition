package com.khs.practicerecomposition

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var num by remember {
                mutableStateOf(0)
            }

            println("Text - setContent recomposition")//text recomposeScope : start
            Text(
                text = "Click me! count: $num",
                modifier = Modifier.clickable { num++ }
            ).also { println("Text - Text Recomposition!") } //end


            println("Text with Btn - setContent recomposition!")
            Button(onClick = { num++ }) {//btn recomposeScope : start
                Text(//text recomposeScope : start
                    text = "Click me! count: $num",
                ).also {
                    println("Text with Btn - Text recomposition!")
                }//end
            }.also { println("Text with Btn - Button Recomposition!") }//end
        }
    }
}