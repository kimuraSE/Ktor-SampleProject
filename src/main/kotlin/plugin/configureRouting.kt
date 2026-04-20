package com.example.plugin

import com.example.routes.getAllHeroes
import com.example.routes.root
import io.ktor.server.application.Application
import io.ktor.server.routing.routing

fun Application.configureRouting() {
    routing {
        root()
        getAllHeroes()
    }
}