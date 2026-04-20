package com.example

import com.example.plugin.configureDefaultHeader
import com.example.plugin.configureKoin
import com.example.plugin.configureMonitoring
import com.example.plugin.configureRouting
import com.example.plugin.configureSerialization

import io.ktor.server.application.*


fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureKoin()
    configureMonitoring()
    configureSerialization()
    configureDefaultHeader()
    configureRouting()
}

