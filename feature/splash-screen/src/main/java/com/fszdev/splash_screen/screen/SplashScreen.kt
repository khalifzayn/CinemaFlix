package com.fszdev.splash_screen.screen

import android.window.SplashScreen
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.fszdev.splash_screen.screen.section.SplashSection

@Composable
internal fun SplashScreen(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier,
        color = Color(0xFF01193C)
    ) {
        SplashSection()
    }
}

@Preview
@Composable
private fun SplashScreenPreview() {
    SplashScreen()
}