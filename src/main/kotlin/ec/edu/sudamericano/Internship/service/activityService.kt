package ec.edu.sudamericano.Internship.service

import ec.edu.sudamericano.Internship.dto.ActivityDto
import ec.edu.sudamericano.Internship.entity.Activity
import ec.edu.sudamericano.Internship.mapper.ActivityMapper
import ec.edu.sudamericano.Internship.repository.ActivityRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.jpa.domain.AbstractPersistable_.id
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class activityService {

    @Autowired
    lateinit var activityRepository: ActivityRepository

    fun getActivities(): List<Activity> {
        return activityRepository.findAll()
    }

    fun getActivitiesByStudentId(studentId: Long): List<Activity> {
        return activityRepository.findByStudentId(studentId)
    }

    fun getActivitiesByCompanyTutorId(companyTutorId: Long): List<Activity> {
        return activityRepository.findByCompanyTutorId(companyTutorId)
    }

    fun getActivitiesByPracticeId(practiceId: Long): List<Activity> {
        return activityRepository.findByPracticeId(practiceId)
    }

    fun getActivitiesByCreatedAt(createdAt: Long): List<Activity> {
        return activityRepository.findByCreatedAt(createdAt)
    }

    fun getActivitiesByStudentAndDate(studentId: Long, createdAt: LocalDateTime): List<Activity> {
        return activityRepository.findByStudentIdAndCreatedAt(studentId, createdAt)
    }

    fun save(activityDto: ActivityDto): Activity {
        val activity = ActivityMapper.toEntity(activityDto)
        return activityRepository.save(activity)
    }
}