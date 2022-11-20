package roma.springboot.service

import org.springframework.stereotype.Service
import roma.springboot.dto.DickStatusRequest
import roma.springboot.dto.DickStatusResponse

@Service
class DickService {
    fun isDickOk(dickStatusRequest: DickStatusRequest): DickStatusResponse {
        if ((dickStatusRequest.age > 15) && (dickStatusRequest.age < 20) && (dickStatusRequest.dickLength < 10)) {
            return DickStatusResponse("${dickStatusRequest.name} тебе не повезло в ${dickStatusRequest.age} иметь такой короткий член!")
        } else if ((dickStatusRequest.age > 12) && (dickStatusRequest.age < 16) && (dickStatusRequest.dickLength > 10 && dickStatusRequest.dickLength < 15)) {
            return DickStatusResponse("${dickStatusRequest.name} в ${dickStatusRequest.age} это норм, расслабься!")
        } else if ((dickStatusRequest.age > 20) && (dickStatusRequest.dickLength > 15)) {
            return DickStatusResponse("${dickStatusRequest.name} нихуя у тебя труба!")
        }
        if ((dickStatusRequest.age < 10) && (dickStatusRequest.dickLength < 10)) {
            return DickStatusResponse("${dickStatusRequest.name} для твоего ${dickStatusRequest.age} все нормально")
        } else if ((dickStatusRequest.age < 10) && (dickStatusRequest.dickLength > 15)) {
            return DickStatusResponse("${dickStatusRequest.name} для ${dickStatusRequest.age} ты больной")
        } else {
            return DickStatusResponse("${dickStatusRequest.name}не пиши сюда")
        }
    }
}