package zerobase.domain.repository

import org.springframework.data.jpa.repository.JpaRepository
import zerobase.domain.domain.LoanReview

interface LoanReviewRepository : JpaRepository<LoanReview, Long> {
}