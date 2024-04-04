package zerobase.domain.repository

import org.springframework.data.jpa.repository.JpaRepository
import zerobase.domain.domain.UserInfo

interface UserInfoRepository : JpaRepository<UserInfo, Long> {
    fun findByUserKey(userKey: String): UserInfo
}