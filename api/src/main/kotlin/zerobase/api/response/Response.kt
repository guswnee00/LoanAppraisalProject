package zerobase.api.response

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

class Response(
    private val responseCode: ResponseCode
) {
    data class ResponseDto(
        val code: String,
        val message: String
    )

    fun toResponseEntity(): ResponseEntity<ResponseDto> {
        return ResponseEntity
            .status(responseCode.statusCode)
            .body(ResponseDto(code = responseCode.responseCode,
                message = responseCode.responseMessage
            )
        )
    }
}