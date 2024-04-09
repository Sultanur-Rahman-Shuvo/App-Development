package com.example.myapp

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.produceState
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import kotlinx.coroutines.delay

@Composable
fun Counters(){
    val state = produceState(initialValue = 0) {
        for (i in 1<=..<=10){
            delay(5000)
            value += 1
        }
    }
    Text(text = state.value.toString(),
        style = MaterialTheme.typography.headlineMedium)
}

@Composable
fun Derived(){
    val tableOf = remember { mutableStateOf(5) }
    val index = remember { mutableStateOf(1) }

    val message = derivedStateOf { "function" }
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize(1f)
    ){
        Text(text = message.value, style = MaterialTheme.typography.displayLarge)
    }
}