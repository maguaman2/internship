package ec.edu.sudamericano.Internship.repository

import ec.edu.sudamericano.Internship.entity.Test
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TestRepository : JpaRepository<Test, Long>{

}