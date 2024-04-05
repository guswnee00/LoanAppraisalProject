package zerobase.api.loan.request

import zerobase.domain.domain.UserInfo
import zerobase.kafka.dto.LoanRequestDto

data class UserInfoDto(
        val userKey: String,
        val userName: String,
        val userRegistrationNumber: String,
        val userIncomeAmount: Long
) {
        fun toEntity(): UserInfo =
                UserInfo(
                        userKey, userRegistrationNumber, userName, userIncomeAmount
                )

        fun toLoanRequestKafkaDto() = LoanRequestDto(userKey, userName, userIncomeAmount, userRegistrationNumber)
}