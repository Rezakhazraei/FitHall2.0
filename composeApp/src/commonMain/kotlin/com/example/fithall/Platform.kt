package com.example.fithall

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform