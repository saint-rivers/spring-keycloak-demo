package com.ksga.keycloakdemo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("/public")
    fun publicRoute() = mapOf("message" to "this is a public route")

    @GetMapping("/private")
    fun privateRoute() = mapOf("message" to "this is a private route")
}