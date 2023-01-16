package com.javidev.gitpruebasjavikidoandroid.navigation

sealed class Screens ( val route: String){
    object Home2: Screens("home2")
    object Home: Screens("home")
    object LitMediaItem: Screens("mediaItem")
}
