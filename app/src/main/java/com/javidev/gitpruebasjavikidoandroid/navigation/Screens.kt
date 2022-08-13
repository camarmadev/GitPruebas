package com.javidev.gitpruebasjavikidoandroid.navigation

sealed class Screens ( val route: String){
    object Pantalla2: Screens("pantalla_2")
    object Home: Screens("home")
}
