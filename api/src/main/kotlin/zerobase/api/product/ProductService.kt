package zerobase.api.product

import zerobase.api.response.Response
import zerobase.domain.enum.Organization

interface ProductService {
    fun saveProduct(productDto: ProductDto.ProductRequestDto): Response.ResponseDto

    fun findProduct(organization: Organization): ProductDto.ProductResponseDto
}