package com.example.myapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp


class TextFieldwithState : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextInput()
        }
    }
}

//Text Composable

//@Preview(showBackground = true, widthDp = 300, heightDp = 500)
//@Composable
//fun PreviewFunction(){
//    Text(
//        text = "hello shuvo",
//        fontStyle = FontStyle.Italic,
//        fontWeight = FontWeight.ExtraBold,
//        color = Color.Red,
//        fontSize = 36.sp,
//        textAlign = TextAlign.Center
//    )
//}

//Image Composable

//@Preview(showBackground = true, widthDp = 300, heightDp = 500)
//@Composable
//fun PreviewFunction(){
//    Image(
//        painter = painterResource(id = R.drawable.a),
//        contentDescription = "Dummy Text",
//        colorFilter = ColorFilter.tint(Color.Blue),
//        contentScale = ContentScale.Crop
//    )
//}

//Button Composable

//@Preview(showBackground = true, widthDp = 300, heightDp = 500)
//@Composable
//fun PreviewFunction(){
//    Button(onClick = {}, colors = ButtonDefaults.buttonColors(
//        contentColor = Color.White,
//        backgroundColor = Color.Black
//    ),
//        enabled = false
//    ) {
//        Text(text = "Hello")
//        Image(
//            painter = painterResource(id = R.drawable.a),
//            contentDescription = "Dummy"
//        )
//    }
//}

//TextField Composable

//@Preview(showBackground = true, widthDp = 300, heightDp = 500)
//@Composable
//fun PreviewFunction(){
//    TextField(
//        value = "Hello World",
//        onValueChange = {},
//        label = { Text(text = "Enter Message")},
//        placeholder = {}
//    )
//}

@Composable
fun TextInput(){
    val state = remember{ mutableStateOf("") }
    TextField(
        value = state.value,
        onValueChange = {
            state.value = it
        },
        label = { Text(text = "Enter Message")}
   )
}
