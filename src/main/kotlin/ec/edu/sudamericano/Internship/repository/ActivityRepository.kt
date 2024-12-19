package ec.edu.sudamericano.Internship.repository
import ec.edu.sudamericano.Internship.entity.Activity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import java.time.LocalDateTime
import java.util.*

@Repository
interface ActivityRepository: JpaRepository<Activity, Long> {

    fun findByStudentId(id: Long): List<Activity>

    fun findByCompanyTutorId(id: Long): List<Activity>

    fun findByPracticeId(id: Long): List<Activity>

    fun findByCreatedAt(id: Long): List<Activity>

}
