package com.dbank

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DBankApplication

fun main(args: Array<String>) {
	runApplication<DBankApplication>(*args)
}
