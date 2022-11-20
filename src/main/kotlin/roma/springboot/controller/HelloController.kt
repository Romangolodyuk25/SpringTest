package roma.springboot.controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import roma.springboot.dto.DickStatusRequest
import roma.springboot.dto.DickStatusResponse
import roma.springboot.dto.HelloResponse
import roma.springboot.service.DickService
import roma.springboot.service.HelloService

@RestController
class HelloController(
    val helloService: HelloService,
    val dickService: DickService
) {
    @GetMapping("/say-hello")
    fun helloKotlin(@RequestParam name: String): HelloResponse {
        return helloService.getHello(name);
    }

    @PostMapping("/dick-status")
    fun isMyDickOk(@RequestBody dickStatusRequest: DickStatusRequest): DickStatusResponse {
        return dickService.isDickOk(dickStatusRequest)
    }

}