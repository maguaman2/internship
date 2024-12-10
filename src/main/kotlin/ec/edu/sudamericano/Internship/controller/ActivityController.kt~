package ec.edu.sudamericano.Internship.controller

import ec.edu.sudamericano.Internship.dto.ActivityDto
import ec.edu.sudamericano.Internship.entity.Activity
import ec.edu.sudamericano.Internship.service.activityService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.time.LocalDateTime

@RestController
@RequestMapping("/api/activities")
class ActivityController {

    @Autowired
    lateinit var activityService: activityService

    @GetMapping
    fun getActivities() = activityService.getActivities()

    @PostMapping
    fun save(@RequestBody @Valid activityDto: ActivityDto): Activity {
        return activityService.save(activityDto)

    }

    @GetMapping("/activities/byCreatedAt")
    fun getActivitiesByCreatedAt(
        @RequestParam createdAt: Long
    ): List<Activity> {
        return activityService.getActivitiesByCreatedAt(createdAt)
    }








/*
    @GetMapping
    fun getActivitiesByStudentAndDate(
        @RequestParam studentId: Long,
        @RequestParam createdAt: LocalDateTime
    ): List<Activity>{
        return activityService.getActivitiesByStudentAndDate(studentId, createdAt)
    }

 */

}