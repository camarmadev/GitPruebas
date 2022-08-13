package com.javidev.gitpruebasjavikidoandroid

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.javidev.gitpruebasjavikidoandroid.navigation.Screens
import com.javidev.gitpruebasjavikidoandroid.screens.Greeting

@Composable
fun Navigation() {

    val controller = rememberNavController()
    NavHost(navController = controller, startDestination = Screens.Home.route){

        composable(Screens.Home.route){
            Greeting(name = "probando el codigo")
        }

        composable(Screens.Pantalla2.route){
            Screens.Home
        }
    }

}