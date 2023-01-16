package com.javidev.gitpruebasjavikidoandroid

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.javidev.gitpruebasjavikidoandroid.data.getMediaItem
import com.javidev.gitpruebasjavikidoandroid.navigation.Screens
import com.javidev.gitpruebasjavikidoandroid.screens.Greeting
import com.javidev.gitpruebasjavikidoandroid.screens.Home2
import com.javidev.gitpruebasjavikidoandroid.screens.ListMediaItem

@Composable
fun Navigation() {

    val controller = rememberNavController()
    NavHost(navController = controller, startDestination = Screens.Home.route){

        composable(Screens.Home.route){
            Greeting(name = "probando el codigo",controller)
        }

        composable(Screens.LitMediaItem.route){
           ListMediaItem()
        }
    }

}