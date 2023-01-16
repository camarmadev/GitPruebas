package com.javidev.gitpruebasjavikidoandroid.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayCircleOutline
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import com.javidev.gitpruebasjavikidoandroid.data.MediaItem
import com.javidev.gitpruebasjavikidoandroid.data.getMediaItem

@Composable
fun Home2(controller: NavController, item: MediaItem,modifier: Modifier = Modifier) {

    Column(
            modifier = modifier
                .fillMaxSize()
            ) {
        Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp)
        ) {

            AsyncImage(model = item.thumb,
                       contentDescription = null,
                       modifier = Modifier.fillMaxWidth(),
                       contentScale = ContentScale.Crop,
            )

            if (item.tipo == MediaItem.Type.VIDEO)
            Icon(imageVector = Icons.Default.PlayCircleOutline,
                 contentDescription = null,
                 tint = Color.White,
                 modifier = Modifier
                     .size(58.dp)
                     .align(Alignment.Center)
            )
        }
        Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Cyan)
                    .padding(12.dp),
                contentAlignment = Alignment.Center
        ) {
            Text(text = item.title, style = MaterialTheme.typography.h6)
        }


    }


}


//@Preview(showBackground = true, widthDp = 200, heightDp = 400)
@Composable
fun Previ() {
    val controller = rememberNavController()
    //Home2(controller = controller, item = item)
}

//@Preview
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ListMediaItem(){
    val controller = rememberNavController()
    LazyVerticalGrid(
            contentPadding = PaddingValues(4.dp),
            cells = GridCells.Fixed(2) // si eligo adaptive(150.dp)
    ){
        items(getMediaItem()){ item ->
            Home2(controller = controller,item, modifier = Modifier.padding(4.dp) )
        }
    }
}