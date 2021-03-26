package me.kjgleh.spring.aop

import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.springframework.stereotype.Component

@Aspect
@Component
class LoggingAspect {

    @Around("execution(* me.kjgleh.spring.aop.SimpleService.get(..))")
    fun calculatePerformance(proceedingJoinPoint: ProceedingJoinPoint): Any {
        val start = System.currentTimeMillis()
        val result = proceedingJoinPoint.proceed()
        val end = System.currentTimeMillis()

        println("수행 시간 : "+ (end - start))
        return result
    }
}