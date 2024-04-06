package zerobase.domain.enum

enum class Product(
    val productCode: String
) {
    PRODUCT_ONE("001"),
    PRODUCT_TWO("002")
}

fun toProductCode(code: String): Product{
    return Product.values()
        .find { product -> product.productCode == code }
        ?: throw RuntimeException("fail")
}