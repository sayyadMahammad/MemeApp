package com.example.mymemesapp.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import coil.compose.AsyncImage
import com.example.mymemesapp.data.Meme
import java.lang.reflect.Modifier


@Composable
fun RV( list : List<Meme>){
    LazyColumn(){
        items(list){ item ->
            EachRow(meme = item)
        }
    }

}



@Composable
fun EachRow(meme : Meme
//meme :String
){

 AsyncImage(
     model =meme.url,
     contentDescription = null
 )
}

//@Preview
//@Composable
//fun Pre(){
//    EachRow("https://i.imgflip.com/30b1gx.jpg")
//
//}