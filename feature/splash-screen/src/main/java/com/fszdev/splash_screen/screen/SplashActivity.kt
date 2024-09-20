package com.fszdev.splash_screen.screen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import com.fszdev.splash_screen.ui.theme.CinemaFlixTheme
import kotlinx.coroutines.delay

class SplashActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CinemaFlixTheme {
                LaunchedEffect(key1 = Unit) {
                    delay(5_000L)
                }
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    SplashScreen(modifier = Modifier.padding(paddingValues = innerPadding))

                }
            }
        }
    }
}