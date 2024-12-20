package ec.edu.sudamericano.Internship.service

import ec.edu.sudamericano.Internship.dto.ActivityDto
import ec.edu.sudamericano.Internship.entity.Activity
import ec.edu.sudamericano.Internship.mapper.ActivityMapper
import ec.edu.sudamericano.Internship.repository.ActivityRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ActivityService {

    @Autowired
    lateinit var activityRepository: ActivityRepository

    fun getActivities(): List<Activity> {
        return activityRepository.findAll()
    }

    fun getActivitiesByCreatedAt(createdAt: Long): List<Activity> {
        return activityRepository.findByCreatedAt(createdAt)
    }

    fun save(activityDto: ActivityDto): Activity {
        val activity = ActivityMapper.toEntity(activityDto)
        return activityRepository.save(activity)
    }
}
   /*
   fun getActivitiesByStudentId(studentId: Long): List<Activity> {
        return activityRepository.findByStudentId(studentId)
    }

    fun getActivitiesByCompanyTutorId(companyTutorId: Long): List<Activity> {
        return activityRepository.findByCompanyTutorId(companyTutorId)
    }

    fun getActivitiesByPracticeId(practiceId: Long): List<Activity> {
        return activityRepository.findByPracticeId(practiceId)
    }
*/

/*
    fun getActivitiesByStudentAndDate(studentId: Long, createdAt: LocalDateTime): List<Activity> {
        return activityRepository.findByStudentIdAndCreatedAt(studentId, createdAt)
    }

 */

