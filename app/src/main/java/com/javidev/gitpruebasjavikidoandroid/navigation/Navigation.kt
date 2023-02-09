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
import com.javidev.gitpruebasjavikidoandroid.screens.visibilityViewModel

@Composable
fun Navigation(viewModel: visibilityViewModel) {

    val controller = rememberNavController()
    NavHost(navController = controller, startDestination = Screens.Home.route){

        composable(Screens.Home.route){
            Greeting(name = "probando el codigo",controller,viewModel)
        }

        composable(Screens.LitMediaItem.route){
           ListMediaItem()
        }
    }

}