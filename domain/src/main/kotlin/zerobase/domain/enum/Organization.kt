package zerobase.domain.enum

enum class Organization(
    val organizationCode: String
) {
    NONE("00000"),
    ORGANIZATION_ONE("00001"),
    ORGANIZATION_TWO("00001")
}
fun toOrganizationCode(code: String): Organization{
    return Organization.values()
        .find { organization -> organization.organizationCode == code }
        ?: throw RuntimeException("fail")
}