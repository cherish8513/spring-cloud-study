package com.study.secondservice

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/second-service")
class SecondServiceController {
    @GetMapping("/welcome")
    fun welcome() : String{
        return "welcome second"
    }

    @GetMapping("/message")
    fun message(@RequestHeader("second-request") header : String) : String = header
}