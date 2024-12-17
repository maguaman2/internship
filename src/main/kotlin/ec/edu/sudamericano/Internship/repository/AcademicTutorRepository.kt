package ec.edu.sudamericano.Internship.repository

import ec.edu.sudamericano.Internship.entity.AcademicTutorEntity
import ec.edu.sudamericano.Internship.entity.Practice
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AcademicTutorRepository: JpaRepository<AcademicTutorEntity, Long> {
     fun findById(id: Long?): AcademicTutorEntity?
}


