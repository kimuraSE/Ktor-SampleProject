package com.example.routes

import com.example.repository.HeroRepository
import io.ktor.http.HttpStatusCode
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import org.koin.ktor.ext.inject

fun Route.getAllHeroes(){
    val heroRepository: HeroRepository by inject()

    get("/boruto/heroes") {
        try {
            val queryPage = call.request.queryParameters["page"]?.toInt() ?: 1
            require(queryPage in 1..5)
            val apiResponse = heroRepository.getAllHeroes(queryPage)
            call.respond(HttpStatusCode.OK,apiResponse)
        } catch (e: NumberFormatException) {
            call.respond(HttpStatusCode.BadRequest,"Invalid Query")
        } catch (e: IllegalArgumentException) {
            call.respond(HttpStatusCode.InternalServerError,"Something went wrong")
        }
    }
}