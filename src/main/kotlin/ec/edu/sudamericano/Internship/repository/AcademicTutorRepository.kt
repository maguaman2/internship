package ec.edu.sudamericano.Internship.repository

import ec.edu.sudamericano.Internship.entity.AcademicTutorWithCareerEntity

import ec.edu.sudamericano.Internship.entity.Practice
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AcademicTutorRepository: JpaRepository<AcademicTutorWithCareerEntity, Long> {
     fun findById(id: Long?): AcademicTutorWithCareerEntity?
}


