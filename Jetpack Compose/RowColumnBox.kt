package com.example.myapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


//class RowColumnBox : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            Column {
//                ListViewItem(R.drawable.a,"John Doe","Software Engineer")
//                ListViewItem(R.drawable.b,"SRS","Data Scientist")
//            }
//        }
//    }
//}

//Row

//@Preview(showBackground = true, widthDp = 300, heightDp = 500)
//@Composable
//fun PreviewFunction(){
//    Column(
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Text(text = "A", fontSize = 24.sp)
//        Text(text = "B", fontSize = 24.sp)
//    }
//}


//@Preview(showBackground = true, widthDp = 300, heightDp = 500)
//@Composable
//fun PreviewFunction(){
//    Row(
//        horizontalArrangement = Arrangement.SpaceEvenly,
//        verticalAlignment = CenterVertically
//    ) {
//        Text(text = "A", fontSize = 24.sp)
//        Text(text = "B", fontSize = 24.sp)
//    }
//}

//Box

//@Preview(showBackground = true, widthDp = 300, heightDp = 500)
//@Composable
//fun PreviewFunction(){
//    Box(
//        contentAlignment = Alignment.Center
//    ){
//        Image(painter = painterResource(id = R.drawable.a), contentDescription = "")
//        Image(painter = painterResource(id = R.drawable.b), contentDescription = "")
//    }
//}

//Example of Box

//@Composable
//fun ListViewItem(imgId: Int, name: String, occupation: String){
//    Row(Modifier.padding(8.dp)){
//        Image(
//            painter = painterResource(id = imgId),
//            contentDescription = "");
//            Modifier.size(40.dp)
//        Column() {
//            Text(text = name, fontWeight = FontWeight.Bold)
//            Text(text = occupation, fontWeight = FontWeight.Thin, fontSize = 12.sp)
//        }
//    }
//}

