package com.corryn.kmpplayground

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform