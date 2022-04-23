package com.study.firstservice

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/first-service")
class FirstServiceController {
    @GetMapping("/welcome")
    fun welcome() : String{
        return "welcome first"
    }

    @GetMapping("/message")
    fun message(@RequestHeader("first-request") header : String) : String = header
}