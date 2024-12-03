package ec.edu.sudamericano.Internship.repository

import ec.edu.sudamericano.Internship.entity.Practice
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface PracticeRepository: JpaRepository<Practice, Long> {
    fun findById(id: Long?): Practice?
}