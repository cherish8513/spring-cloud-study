package com.study.firstservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class FirstServiceApplication

fun main(args: Array<String>) {
    runApplication<FirstServiceApplication>(*args)
}
