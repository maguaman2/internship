package ec.edu.sudamericano.internship.repository

import ec.edu.sudamericano.internship.entity.Coordinator
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CoordinatorRepository : JpaRepository<Coordinator, Long> {
    fun findById(id: Long?): Coordinator?
    fun findByEmail(email: String?): Coordinator?
}
