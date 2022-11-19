package roma.springboot.service

import org.springframework.stereotype.Service
import roma.springboot.dto.DickStatusRequest
import roma.springboot.dto.DickStatusResponse

@Service
class DickService {
    fun isDickOk(dickStatusRequest: DickStatusRequest): DickStatusResponse {
        if (dickStatusRequest.dickLength < 10) {
            return DickStatusResponse("${dickStatusRequest.name} тебе не повезло в ${dickStatusRequest.age} иметь такой короткий член!")
        } else if (dickStatusRequest.dickLength > 10 && dickStatusRequest.dickLength < 15) {
            return DickStatusResponse("${dickStatusRequest.name} в ${dickStatusRequest.age} это норм, расслабься!")
        } else {
            return DickStatusResponse("${dickStatusRequest.name} нихуя у тебя труба!")
        }
    }
}