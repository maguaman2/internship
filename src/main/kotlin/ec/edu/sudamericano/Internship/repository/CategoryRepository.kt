package ec.edu.sudamericano.Internship.repository

import ec.edu.sudamericano.Internship.entity.Category
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface CategoryRepository : JpaRepository<Category, Long>{
}

