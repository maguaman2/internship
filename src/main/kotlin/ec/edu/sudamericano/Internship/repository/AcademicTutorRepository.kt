package ec.edu.sudamericano.Internship.repository

import ec.edu.sudamericano.Internship.entity.AcademicTutorEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AcademicTutorRepository: JpaRepository<AcademicTutorEntity, Long> {
}


//aqui se realizan las consultas derivadas