package ec.edu.sudamericano.internship.repository

import ec.edu.sudamericano.internship.entity.EngagementCInstituteView
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EngagementCInstituteRepositoryView : JpaRepository<EngagementCInstituteView, String?> {
    fun findById(id: String?): EngagementCInstituteView
}