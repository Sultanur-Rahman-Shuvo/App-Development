package com.example.myapp.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable

@Composable
fun QuoteListScreen(data: Array<Quote>, onClick:(quote: Quote)->Unit) {
    Column (){
        Text(
            text = "Quotes App",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(8.dp,24.dp)
                .fillMaxWidth(1f),
            style = MaterialTheme.typography.h6,
            fontFamily = FontFamily(Font(R.font.montserrot_regular))
        )
        QuoteList(data: data, onClick)
    }
}