package ec.edu.sudamericano.Internship.service

import ec.edu.sudamericano.Internship.dto.ActivityDto
import ec.edu.sudamericano.Internship.entity.Activity
import ec.edu.sudamericano.Internship.entity.ActivityView
import ec.edu.sudamericano.Internship.mapper.ActivityMapper
import ec.edu.sudamericano.Internship.repository.ActivityRepository
import ec.edu.sudamericano.Internship.repository.ActivityViewRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ActivityService {

    @Autowired
    lateinit var activityRepository: ActivityRepository

    @Autowired
    lateinit var activityViewRepository: ActivityViewRepository

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

    fun listActivityView(): List<ActivityView> {
        return activityViewRepository.findAll()
    }

    fun findByDescription(description: String): List<ActivityView> {
        return activityViewRepository.findByDescription(description)
    }
}


