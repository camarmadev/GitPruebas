package com.javidev.gitpruebasjavikidoandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.navigation.compose.rememberNavController
import com.javidev.gitpruebasjavikidoandroid.screens.ListMediaItem
import com.javidev.gitpruebasjavikidoandroid.ui.theme.GitPruebasJavikidoAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GitPruebasJavikidoAndroidTheme {
                val controller = rememberNavController()
                Surface(color = MaterialTheme.colors.background) {
                    //Navigation()
                    //Home2(controller = controller)
                    ListMediaItem()
                }
            }
        }
    }
}

