package com.example.demo.entity

import javax.persistence.*

@Entity
class Greeting {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int = 0

        @Column(nullable = false)
        val counter: Long

        @Column(nullable = false)
        val name: String


        constructor(counter: Long, name: String) {
                this.counter = counter
                this.name = name
        }

}
