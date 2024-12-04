package ec.edu.sudamericano.Internship.repository

import ec.edu.sudamericano.Internship.entity.Career
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CareerRepository : JpaRepository<Career, Long> {
    fun findByFullName(fullName: String): List<Career>
}