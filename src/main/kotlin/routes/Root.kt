package com.example.routes

import io.ktor.http.ContentType
import io.ktor.http.HttpStatusCode
import io.ktor.server.response.respond
import io.ktor.server.response.respondText
import io.ktor.server.routing.Route
import io.ktor.server.routing.get

fun Route.root(){
    get("/") {
        call.respond(HttpStatusCode.OK,"Hello World")
    }
}