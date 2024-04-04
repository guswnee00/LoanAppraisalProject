package zerobase.api.test

import org.springframework.stereotype.Service
import zerobase.domain.domain.UserInfo
import zerobase.domain.repository.UserInfoRepository

@Service
class TestService(
        private val userInfoRepository: UserInfoRepository
) {
    fun testGetService(userKey: String) = userInfoRepository.findByUserKey(userKey).toDto()

    fun UserInfo.toDto() = TestDto.UserInfoDto(userKey, userRegistrationNumber, userName, userIncomeAmount)
}