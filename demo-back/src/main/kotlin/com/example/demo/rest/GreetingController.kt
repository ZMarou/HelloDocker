package com.example.demo.rest

import com.example.demo.entity.Greeting
import com.example.demo.repository.GreetingRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicInteger
import java.util.concurrent.atomic.AtomicLong

@RestController
class GreetingController @Autowired constructor(private val greetingRepository: GreetingRepository){

    val counter = AtomicLong()

    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String): Greeting {
        val res = Greeting(counter.incrementAndGet(), "Hello, $name")
        return greetingRepository.save(res)
    }

    @GetMapping("/greeting/hello")
    fun hello(): String {
        return "Hello World !!"
    }

}
