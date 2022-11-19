package kotlin.springboot.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.springboot.dto.HelloDto
import kotlin.springboot.service.HelloService

@RestController
class HelloController(val helloService: HelloService) {

    @GetMapping("/hello")
    fun helloKotlin():String {
        return "Hello kotlin"
    }

    @GetMapping("/hello-service")
     fun helloService ():String {
         return helloService.getHello()
    }

    @GetMapping("/hello-dto")
    fun helloDto(): HelloDto {
        return HelloDto("Hello from the dto")
    }
}