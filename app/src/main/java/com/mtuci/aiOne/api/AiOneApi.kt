package com.mtuci.aiOne.api

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.serialization.kotlinx.json.json
import kotlinx.coroutines.time.delay
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put

class AiOneApi {
    private val httpClient = HttpClient{
        install(ContentNegotiation){
            json()
        }
    }
    private val baseUrl = ""

    suspend fun authorize(login: String, password: String): String{
//        val token = httpClient.post("$baseUrl/auth"){
//            val body = buildJsonObject {
//                put("email", login)
//                put("password", password)
//            }
//            setBody(body)
//        }.body<String>()
//        return token
        kotlinx.coroutines.delay(2000L)
        return "token"
    }
}