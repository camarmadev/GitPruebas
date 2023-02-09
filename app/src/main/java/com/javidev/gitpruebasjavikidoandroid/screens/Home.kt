package com.javidev.gitpruebasjavikidoandroid.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.javidev.gitpruebasjavikidoandroid.R
import com.javidev.gitpruebasjavikidoandroid.navigation.Screens
import com.javidev.gitpruebasjavikidoandroid.ui.theme.GitPruebasJavikidoAndroidTheme


@Composable
fun Greeting(name: String,controller: NavController,vm: visibilityViewModel) {
    Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Yellow),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Imagen()
        Image2()
        Imagen3(vm.visibility.value){
            vm.onChangeVisibility()
        }
        ImageOnly()


        Button(onClick = {
            controller.navigate(Screens.LitMediaItem.route){
                popUpTo(Screens.Home.route)
            }
        }) {
            Text(text = "Siguiente pantalla", color = Color.Black)
        }

    }
}

// usando el surface sin tocar la forma de la imagen
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

// usando una imagen solo sin surface
@Composable
fun Image2() {
    Image(
            modifier = Modifier
                .size(100.dp)
                .border(BorderStroke(1.dp, Color.Black), CircleShape),
            painter = painterResource(id = R.drawable.logo_seguridad),
            contentScale = ContentScale.Crop,
            contentDescription = "icono dos",

            )


}


@Composable
fun ImageOnly() {
    // uso el clip de modifier pero es importante el contentScale
    Image(
            painter = painterResource(id = R.drawable.logo_seguridad),
            contentDescription = null,
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
                .border(border = BorderStroke(2.dp, color = Color.Red), CircleShape),
            contentScale = ContentScale.Crop
            )
}

// uso el surface para no usar los parametros de la imagen y darle la foorma redonda
@Composable
fun Imagen3(visibility: Boolean,onclick: ()-> Unit) {
    Surface(shape = CircleShape, border = BorderStroke(1.dp, Color.Black)
    ) {
        if (visibility){
            Image(modifier = Modifier
                .size(100.dp)
                .clickable { onclick() },
                  painter = painterResource(id = R.drawable.logo_seguridad),
                  contentDescription = null
            )
        }

    }

}


@Preview(showBackground = false)
@Composable
fun GrettinPrev() {
    val controller= rememberNavController()
    val vm: visibilityViewModel = viewModel<visibilityViewModel>()
    Greeting(name = "ejemplo previu",controller,vm)
}

//@Preview(showBackground = true)
@Composable
fun preImagen() {
    Imagen()
}


@Preview()
@Composable
fun DefaultPreview() {
    val controller= rememberNavController()
    val vm: visibilityViewModel = viewModel<visibilityViewModel>()
    GitPruebasJavikidoAndroidTheme {
        Greeting("Android",controller,vm)
    }
}

