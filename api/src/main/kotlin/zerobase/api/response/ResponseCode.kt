package zerobase.api.response

import org.springframework.http.HttpStatus

enum class ResponseCode(
    val statusCode: HttpStatus,
    val responseCode: String,
    val responseMessage: String
) {
    SUCCESS(HttpStatus.OK, "00", "success")
}