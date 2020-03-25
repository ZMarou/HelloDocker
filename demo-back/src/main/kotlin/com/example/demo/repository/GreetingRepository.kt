package com.example.demo.repository

import com.example.demo.entity.Greeting
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface GreetingRepository : CrudRepository<Greeting, Long> {
}
