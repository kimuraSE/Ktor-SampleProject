package com.example.routes

import com.example.repository.HeroRepository
import io.ktor.http.HttpStatusCode
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import org.koin.ktor.ext.inject

fun Route.searchHeroesRoutes() {
    val heroRepository: HeroRepository by inject()

    get("/boruto/heroes/search") {
        try {
            val name = call.request.queryParameters["name"].toString()
            require(name.isNotBlank())

            val apiResponse = heroRepository.searchHeroes(name)

            call.respond(HttpStatusCode.OK,apiResponse)
        } catch (e: IllegalArgumentException) {
            call.respond(HttpStatusCode.BadRequest, "Invalid name")
        }


    }
}