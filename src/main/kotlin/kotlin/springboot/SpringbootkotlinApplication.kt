package kotlin.springboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringbootkotlinApplication

fun main(args: Array<String>) {
	runApplication<SpringbootkotlinApplication>(*args)
}
