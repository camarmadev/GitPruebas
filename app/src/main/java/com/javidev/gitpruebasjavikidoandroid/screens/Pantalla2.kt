package com.javidev.gitpruebasjavikidoandroid.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayCircle
import androidx.compose.material.icons.filled.PlayCircleOutline
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage

@Composable
fun Home2(controller: NavController) {

    Column(
            modifier = Modifier
                .fillMaxSize()
                .height(200.dp),

            ) {
        Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
        ) {

            AsyncImage(model = "https://loremflickr.com/400/400/cat?lock=1",
                       contentDescription = null,
                       modifier = Modifier.fillMaxWidth(),
                       contentScale = ContentScale.Crop,
            )

            Icon(imageVector = Icons.Default.PlayCircleOutline,
                 contentDescription = null,
                 tint = Color.White,
                 modifier = Modifier.size(58.dp).align(Alignment.Center)
            )
        }
        Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Cyan)
                    .padding(12.dp),
                contentAlignment = Alignment.Center
        ) {
            Text(text = "titulo 1", style = MaterialTheme.typography.h6)
        }


    }


}


@Preview(showBackground = true, widthDp = 200, heightDp = 400)
@Composable
fun Previ() {
    val controller = rememberNavController()
    Home2(controller = controller)
}