package zerobase.domain.repository

import org.springframework.data.jpa.repository.JpaRepository
import zerobase.domain.domain.ProductInfo
import zerobase.domain.enum.Organization

interface ProductInfoRepository : JpaRepository<ProductInfo, Long> {
    fun findByOrganizationCode(organization: Organization): ProductInfo
}