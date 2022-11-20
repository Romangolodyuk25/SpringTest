package roma.springboot.service

import org.springframework.stereotype.Service
import roma.springboot.dto.HelloResponse

@Service
class HelloService {
    fun getHello(name: String): HelloResponse {
        return HelloResponse(greeting = "Hello $name!")
    }
}