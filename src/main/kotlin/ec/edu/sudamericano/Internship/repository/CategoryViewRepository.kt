package ec.edu.sudamericano.Internship.repository

import ec.edu.sudamericano.Internship.entity.CategoryStudentView
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CategoryStudentViewRepository : JpaRepository<CategoryStudentView, Int>{

}