package  ec.edu.sudamericano.Internship.repository

import ec.edu.sudamericano.Internship.entity.InstituteEngagementView
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface InstituteViewRepository : JpaRepository<InstituteEngagementView, Int> {
}
