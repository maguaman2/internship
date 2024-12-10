package ec.edu.sudamericano.Internship.repository

import ec.edu.sudamericano.Internship.entity.TutorCompanyEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TutorCompanyRepository: JpaRepository<TutorCompanyEntity, Long>{
    fun findById(id:Long?): TutorCompanyEntity
}