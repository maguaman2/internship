package ec.edu.sudamericano.Internship.repository

import ec.edu.sudamericano.Internship.entity.TutorCompanyView
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TutorCompanyViewRepository: JpaRepository<TutorCompanyView, Long?> {
    fun findById(id:Long?): TutorCompanyView
}