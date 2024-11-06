package com.example.justnotes_jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.NavigationRail
import com.example.justnotes_jetpackcompose.navigation.Navigation
import com.example.justnotes_jetpackcompose.ui.theme.JustNotesTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JustNotesTheme(dynamicColor = false) {
                Navigation()
            }
        }
    }
}
