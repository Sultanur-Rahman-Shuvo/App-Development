package com.example.myapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapp.ui.theme.BlogAppTheme
import com.example.myapp.ui.theme.MyAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BlogAppTheme {
                Text(text = "CheezyCode")
            }
            BlogAppTheme(content = {
                Text(text = "CheezyCode")
            })
        }
    }
}

@Composable
fun CheezyCode(name: String){
    Text(text = "Hello $name")
}

//@Preview(showBackground = true, name = "Hello Message", showSystemUi = true)
//@Composable
//fun PreviewFunction(){
//    CheezyCode(name = "Cheezy Code")
//}

@Composable
fun Greeting(name: String){
    Text(text = "Hello $name")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview(){
    BlogAppTheme {
        Greeting(name = "Androaid")
    }
}

