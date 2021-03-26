package me.kjgleh.spring.aop

import org.springframework.stereotype.Service

@Service
class InternalSimpleService {

    fun get(): String {
        Thread.sleep(3000)
        return "good"
    }
}