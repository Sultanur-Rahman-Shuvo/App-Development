package com.example.myapp.screens

import androidx.compose.foundation.lazy.LazyColumn
import com.example.myapp.models.Quote

fun QuoteList(data: Array<Quote>, onClick:(quote: Quote)->Unit){
    LazyColumn (
        content = {
            items(data){
                QuoteListItem(quote = it, onClick)
            }
        }
    ){

    }
}