package com.javidev.gitpruebasjavikidoandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
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

        Text(
            text = "Hello $name!",
            modifier = Modifier.background(Color.LightGray),
            style = MaterialTheme.typography.h3
        )
        Text(text = "otro text $name!", modifier = Modifier.background(Color.LightGray))

        Button(onClick = { /*TODO*/ }) {
            Text(text = "Boton azul", color = Color.Black)
        }

        Button(onClick = { /*TODO*/ }) {
            Text(text = "Branch uno", color = Color.Green)
        }

        Button(onClick = { /*TODO*/ }) {
            Text(text = "Branch uno", color = Color.Yellow)
        }


    }
}

@Preview()
@Composable
fun DefaultPreview() {
    GitPruebasJavikidoAndroidTheme {
        Greeting("Android")
    }
}