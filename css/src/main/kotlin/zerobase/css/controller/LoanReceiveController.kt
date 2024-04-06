package zerobase.css.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import zerobase.css.dto.LoanRequestDto
import zerobase.css.dto.LoanResultDto
import zerobase.css.service.LoanReviewService

@RestController
@RequestMapping("/css/api/v1")
class LoanReceiveController(
    private val loanReviewService: LoanReviewService
) {
    @PostMapping("/request")
    fun loanReceive(
        @RequestBody requestInputDto: LoanRequestDto.RequestInputDto
    ): LoanResultDto.ResponseDto =
        loanReviewService.loanReview(requestInputDto)
}