package com.example.myapp

import android.util.Log
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalView
import androidx.lifecycle.findViewTreeViewModelStoreOwner

@Composable
fun App1(){
    var state = remember { mutableStateOf(false) }
    DisposableEffect(key1 = state.value) {
        Log.d("CheezyCode","Disposable Effect Started")
        onDispose {
            Log.d("CheezyCode","Cleaning up side effects")
        }
        Button(onClick = { state.value = !state.value } ) {
            Text(text = "Change State")
        }
    }
}
