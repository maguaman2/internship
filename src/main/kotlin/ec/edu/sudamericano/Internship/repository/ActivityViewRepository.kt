package ec.edu.sudamericano.Internship.repository

import ec.edu.sudamericano.Internship.entity.ActivityView
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ActivityViewRepository: JpaRepository<ActivityView, Long> {
    fun findByDescription(description: String): List<ActivityView>
}