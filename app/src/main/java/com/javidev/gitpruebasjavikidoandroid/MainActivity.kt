package com.javidev.gitpruebasjavikidoandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.javidev.gitpruebasjavikidoandroid.ui.theme.GitPruebasJavikidoAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GitPruebasJavikidoAndroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Imagen()

        Text(
            text = "Hello $name!",
            modifier = Modifier.background(Color.LightGray),
            style = MaterialTheme.typography.h3
        )
        Text(text = "otro text $name!", modifier = Modifier.background(Color.LightGray))

        Button(onClick = { /*TODO*/ }) {
            Text(text = "Branch master", color = Color.Black)
        }
    }
}


@Composable
fun Imagen() {
    Surface(
        modifier = Modifier.size(80.dp).padding(3.dp),
        shape = RectangleShape,
        border = BorderStroke(1.dp, Color.LightGray),
        elevation = 4.dp
    ) {
            Image(
                painter = painterResource(id = R.drawable.logo_seguridad),
                contentDescription = "icono de la app"
            )
    }
}


@Preview(showBackground = true)
@Composable
fun GrettinPrev() {
    Greeting(name = "ejemplo previu")
}

@Preview(showBackground = true)
@Composable
fun preImagen() {
    Imagen()
}


//@Preview()
@Composable
fun DefaultPreview() {
    GitPruebasJavikidoAndroidTheme {
        Greeting("Android")
    }
}

