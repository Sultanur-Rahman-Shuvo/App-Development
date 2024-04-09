package com.example.myapp

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@Composable
fun ListComposable(){
    var categoryState = remember { mutableStateOf(emptyList<String>()) }
    LaunchedEffect(key1 = Unit) {
        categoryState.value = fetchCategories()
    }

    LazyColumn{
        items(categoryState.value){item->
            Text(text = item)
        }
    }
}

fun fetchCategories(): List<String>{
    return listOf("one","two","three")
}