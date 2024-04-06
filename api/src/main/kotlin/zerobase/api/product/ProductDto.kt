package zerobase.api.product

import zerobase.domain.domain.ProductInfo
import zerobase.domain.enum.toOrganizationCode
import zerobase.domain.enum.toProductCode

class ProductDto(
    val organizationCode : String,
    val productCode: String,
    val productName: String,
    val productMinInterest: Double,
    val productMaxInterest: Double
) {
    data class ProductRequestDto(
        val productDto: ProductDto
    ) {
        fun toEntity(): ProductInfo = ProductInfo(
            toOrganizationCode(productDto.organizationCode) ,
            toProductCode(productDto.productCode),
            productDto.productName,
            productDto.productMinInterest,
            productDto.productMaxInterest)
    }

    data class ProductResponseDto(
        val responseCode: String,
        val responseMessage: String
    )
}