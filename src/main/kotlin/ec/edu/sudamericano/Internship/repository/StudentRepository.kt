package ec.edu.sudamericano.Internship.repository

import ec.edu.sudamericano.Internship.entity.Student
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface StudentRepository : JpaRepository<Student, Long> {

}
