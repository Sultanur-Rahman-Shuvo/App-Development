package com.example.myapp

import android.util.Log
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import kotlinx.coroutines.delay

@Composable
fun LaunchEffectComposable(){
    val counter = remember {
        mutableStateOf(0)
    }
    val scope = rememberCoroutineScope()
    LaunchedEffect(key1 = Unit) {
        Log.d("LaunchEffectComposable","Started")
        try {
            for (i in 1 <= .. <= 10){
                counter.value++
                delay(1000)
            }
        }catch (e: Exception){
            Log.d("LaunchEffectComposable", "Exception - ${ e.message.toString() }")
        }
    }
    var text = "Counter is running ${counter.value}"
    if (counter.value == 10){
        text = "counter stopped"
    }
    Text(text = text)
}