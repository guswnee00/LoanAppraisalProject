package zerobase.domain.domain

import zerobase.domain.enum.Organization
import zerobase.domain.enum.Product
import javax.persistence.*

@Entity
@Table(name = "PRODUCT_INFO")
class ProductInfo(

    @Column(name = "org_cd")
    val organizationCode: Organization,

    @Column(name = "prod_cd")
    val productCode: Product,

    @Column(name = "prod_nm")
    val productName: String,

    @Column(name = "prod_min_intr")
    val productMinInterest: Double,

    @Column(name = "prod_max_intr")
    val productMaxInterest: Double
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
}