package com.example.plugin

import io.ktor.http.HttpHeaders
import io.ktor.server.application.Application
import io.ktor.server.application.install
import io.ktor.server.plugins.defaultheaders.DefaultHeaders
import io.netty.handler.codec.DefaultHeaders
import kotlin.time.Duration

fun Application.configureDefaultHeader() {
    install(DefaultHeaders) {
        val oneYearHeader = java.time.Duration.ofDays(365).seconds.toString()
        header(HttpHeaders.CacheControl, oneYearHeader)
    }
}