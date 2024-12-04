package ec.edu.sudamericano.Internship.mapper

import ec.edu.sudamericano.Internship.dto.ActivityDto
import ec.edu.sudamericano.Internship.entity.Activity


object ActivityMapper {

    fun toEntity(activityDto: ActivityDto): Activity {
        val activity = Activity()
        activity.description = activityDto.description
        activity.hours = activityDto.hours
        activity.resources = activityDto.resources
        activity.observations = activityDto.observations
        activity.studentId = activityDto.studentId
        activity.companyTutorId = activityDto.companyTutorId
        activity.practiceId = activityDto.practiceId
        return activity
    }
}