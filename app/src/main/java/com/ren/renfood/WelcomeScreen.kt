package com.ren.renfood

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.core.view.WindowCompat
import com.ren.renfood.ui.screens.WelcomeScreen
import com.ren.renfood.ui.theme.RenFoodTheme

class WelcomeScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            RenFoodTheme {
               Surface(modifier = Modifier.fillMaxSize(),
                   color = colorResource(id = R.color.black)) {
                   WelcomeScreen()
               }
            }
        }
    }
}
