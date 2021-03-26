package me.kjgleh.spring.aop

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class SimpleServiceTest @Autowired constructor(
    private val simpleService: SimpleService
) {

    @Test
    fun get() {
        // Act
        val sut = simpleService
        sut.get()
    }

    @Test
    fun outsideMethod() {
        // Act
        val sut = simpleService
        sut.outsideMethod()
    }
}