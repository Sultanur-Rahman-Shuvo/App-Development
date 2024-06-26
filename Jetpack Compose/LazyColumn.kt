package com.example.myapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class LazyColumn : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PreviewItem()
        }
    }
}

@Preview(heightDp = 500)
@Composable
fun PreviewItem(){
//    BlogCategory(img = R.drawable.a, title = "Programming", subtitle = "Learn Different Languages")
//    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
//        getCategoryList().map{item->
//            BlogCategory(img = item.img, title = item.title, subtitle = item.subtitle)
//        }
//    }
    LazyColumn (content = {
        items(getCategoryList()){
            item->
            BlogCategory(img = item.img, title = item.title, subtitle = item.subtitle)
        }
    })
}



@Composable
fun BlogCategory(img: Int,title: String,subtitle: String){
    Card(
        elevation = 8.dp,
        modifier = Modifier.padding(8.dp)
    ) {
        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)){
            Image(
                painter = painterResource(id = img),
                contentDescription = "",
                modifier = Modifier
                    .size(48.dp)
                    .padding(8.dp)
                    .weight(.2f)
                )
            Column (modifier = Modifier.weight(.8f)){
                Text(
                    text = title,
                    style = MaterialTheme.typography.headlineLarge
                )
                Text(
                    text = subtitle,
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.Thin
                )
            }
        }
    }
}

data class Category(val img:Int,val title:String,val subtitle: String)

fun getCategoryList(): MutableList<Category> {
    val list = mutableListOf<Category>()
    list.add(Category(R.drawable.a,"Programming","Learn Different Languages"))
    list.add(Category(R.drawable.b,"Hello World","Learn Something New Everyday"))
    list.add(Category(R.drawable.a,"Love Bangladesh","Gain Skills"))
    list.add(Category(R.drawable.b,"Business","Digital Marketing"))
    return list
}
