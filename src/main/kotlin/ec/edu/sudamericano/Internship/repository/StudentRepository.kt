package ec.edu.sudamericano.Internship.repository

import ec.edu.sudamericano.Internship.entity.TutorCompanyEntity
import ec.edu.sudamericano.Internship.entity.student
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.NativeQuery
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface StudentRepository: JpaRepository<student, Long> {
    fun findById(id:Long?): student?
    @Query(nativeQuery = true)
    fun findAllStudentCompany(@Param("companyId") companyId:Long?,):List
}