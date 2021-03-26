package me.kjgleh.spring.aop

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SimpleService {

    @Autowired
    private lateinit var simpleService: SimpleService

    fun outsideMethod(): String {
        return simpleService.get()
    }

    fun get(): String {
        Thread.sleep(3000)
        return "good"
    }
}