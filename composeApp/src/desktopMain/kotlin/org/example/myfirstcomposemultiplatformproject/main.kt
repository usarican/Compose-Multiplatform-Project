package org.example.myfirstcomposemultiplatformproject

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "MyFirstComposeMultiplatformProject",
    ) {
        App()
    }
}