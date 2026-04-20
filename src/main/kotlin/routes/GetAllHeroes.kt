package com.example.routes

import io.ktor.http.HttpStatusCode
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get

fun Route.getAllHeroes(){
    get("/boruto/heroes") {
        try {
            val queryPage = call.request.queryParameters["page"]?.toInt() ?: 1
            require(queryPage in 1..5)
            call.respond(HttpStatusCode.OK,queryPage)
        } catch (e: NumberFormatException) {
            call.respond(HttpStatusCode.BadRequest,"Invalid Query")
        } catch (e: IllegalArgumentException) {
            call.respond(HttpStatusCode.InternalServerError,"Something went wrong")
        }
    }
}