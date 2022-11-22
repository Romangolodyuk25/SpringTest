package roma.springboot.service

import org.springframework.stereotype.Service
import roma.springboot.dto.DickStatusRequest
import roma.springboot.dto.DickStatusResponse

@Service
class DickService {
    fun isDickOk(dickStatusRequest: DickStatusRequest): DickStatusResponse {
        //новый
        if ((dickStatusRequest.age < 10) && (dickStatusRequest.dickLength < 10)) {
            return DickStatusResponse("${dickStatusRequest.name}, для  ${dickStatusRequest.age} пойдет")
        } else if ((dickStatusRequest.age<10)&&(dickStatusRequest.dickLength>15)&&(dickStatusRequest.dickLength<20)||(dickStatusRequest.dickLength>20)) {
            return DickStatusResponse("${dickStatusRequest.name} для твоих ${dickStatusRequest.age}лет ты мутант")
        }else if ((dickStatusRequest.age > 10) && (dickStatusRequest.dickLength < 10)) {
            return DickStatusResponse("${dickStatusRequest.name}, для ${dickStatusRequest.age} тебе не повезло")
        } else if ((dickStatusRequest.age > 10) && (dickStatusRequest.age < 15) && (dickStatusRequest.dickLength > 10) && (dickStatusRequest.dickLength < 15)) {
            return DickStatusResponse("${dickStatusRequest.name} для твоего ${dickStatusRequest.age} все вроде ок")
        } else if ((dickStatusRequest.age > 15) && (dickStatusRequest.age < 20) && (dickStatusRequest.dickLength < 10)) {
            return DickStatusResponse("${dickStatusRequest.name} для твоего ${dickStatusRequest.age} все плохо")
        }else if ((dickStatusRequest.age>15)&&(dickStatusRequest.age<20)&&(dickStatusRequest.dickLength>15)&&(dickStatusRequest.dickLength<20)) {
            return DickStatusResponse("${dickStatusRequest.name} для твоего ${dickStatusRequest.age} заебумба")
        } else if ((dickStatusRequest.age>15)&&(dickStatusRequest.age<20)&&(dickStatusRequest.dickLength>20)) {
            return DickStatusResponse("${dickStatusRequest.name} для ${dickStatusRequest.age} это труба ")
        }
        return DickStatusResponse("${dickStatusRequest.name} не пиши сюда больше")
    }
}