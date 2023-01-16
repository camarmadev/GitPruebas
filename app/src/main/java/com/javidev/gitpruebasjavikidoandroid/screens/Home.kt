package com.javidev.gitpruebasjavikidoandroid.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.javidev.gitpruebasjavikidoandroid.R
import com.javidev.gitpruebasjavikidoandroid.navigation.Screens
import com.javidev.gitpruebasjavikidoandroid.ui.theme.GitPruebasJavikidoAndroidTheme


@Composable
fun Greeting(name: String,controller: NavController) {
    Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Yellow),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Imagen()
        Image2()
        Imagen3()


        Button(onClick = {
            controller.navigate(Screens.LitMediaItem.route){
                popUpTo(Screens.Home.route)
            }
        }) {
            Text(text = "Siguiente pantalla", color = Color.Black)
        }

    }
}


@Composable
fun Imagen() {
    Surface(
            modifier = Modifier
                .size(150.dp)
                .padding(3.dp),
            shape = RoundedCornerShape(12.dp),
            elevation = 4.dp
    ) {
        Image(
                modifier = Modifier
                    .border(BorderStroke(3.dp, Color.Black), CircleShape),
                painter = painterResource(id = R.drawable.logo_seguridad),
                contentDescription = "icono de la app",
        )
    }
}

@Composable
fun Image2() {
    Image(
            modifier = Modifier
                .border(BorderStroke(1.dp, Color.Black), CircleShape)
                .size(150.dp),
            painter = painterResource(id = com.javidev.gitpruebasjavikidoandroid.R.drawable.logo_seguridad),
            contentScale = ContentScale.Fit,
            contentDescription = "icono dos",

            )


}

// uso el surface para no usar los parametros de la imagen y darle la foorma redonda
@Composable
fun Imagen3() {
    Surface(shape = CircleShape, border = BorderStroke(1.dp, Color.Black)
    ) {
        Image(modifier = Modifier.size(190.dp),
              painter = painterResource(id = com.javidev.gitpruebasjavikidoandroid.R.drawable.logo_seguridad),
              contentDescription = null
        )
    }

}


@Preview(showBackground = false)
@Composable
fun GrettinPrev() {
    val controller= rememberNavController()
    Greeting(name = "ejemplo previu",controller)
}

//@Preview(showBackground = true)
@Composable
fun preImagen() {
    Imagen()
}


//@Preview()
@Composable
fun DefaultPreview() {
    val controller= rememberNavController()
    GitPruebasJavikidoAndroidTheme {
        Greeting("Android",controller)
    }
}

