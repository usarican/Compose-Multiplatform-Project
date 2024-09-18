package org.example.myfirstcomposemultiplatformproject

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform