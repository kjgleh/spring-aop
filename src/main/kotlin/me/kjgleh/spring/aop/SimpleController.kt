package me.kjgleh.spring.aop

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SimpleController(
    private val simpleService: SimpleService
) {

    @GetMapping("/test")
    fun get(): String {
        return simpleService.outsideMethod()
    }
}