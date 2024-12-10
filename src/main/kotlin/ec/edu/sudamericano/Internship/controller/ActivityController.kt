package ec.edu.sudamericano.Internship.controller

import ec.edu.sudamericano.Internship.dto.ActivityDto
import ec.edu.sudamericano.Internship.entity.Activity
import ec.edu.sudamericano.Internship.response.ErrorResponse
import ec.edu.sudamericano.Internship.response.FailedResponse
import ec.edu.sudamericano.Internship.response.SuccessResponse
import ec.edu.sudamericano.Internship.service.activityService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/activities")
class ActivityController {

    @Autowired
    lateinit var activityService: activityService

    @GetMapping
    fun getActivities(): ResponseEntity<Any> {
        return try {
            val activities = activityService.getActivities()
            ResponseEntity.ok(SuccessResponse(data = activities))
        } catch (e: Exception) {
            ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(
                ErrorResponse(message = e.message, code = HttpStatus.INTERNAL_SERVER_ERROR.value())
            )
        }
    }

    @PostMapping
    fun save(@RequestBody @Valid activityDto: ActivityDto): ResponseEntity<Any> {
        return try {
            val activity = activityService.save(activityDto)
            ResponseEntity.ok(SuccessResponse(data = activity))
        } catch (e: Exception) {
            ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
                ErrorResponse(message = e.message, code = HttpStatus.BAD_REQUEST.value())
            )
        }
    }

    @GetMapping("/activities/byCreatedAt")
    fun getActivitiesByCreatedAt(
        @RequestParam createdAt: Long
    ): ResponseEntity<Any> {
        return try {
            val activities = activityService.getActivitiesByCreatedAt(createdAt)
            if (activities.isEmpty()) {
                ResponseEntity.ok(FailedResponse(data = "No activities found for the given timestamp"))
            } else {
                ResponseEntity.ok(SuccessResponse(data = activities))
            }
        } catch (e: Exception) {
            ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(
                ErrorResponse(message = e.message, code = HttpStatus.INTERNAL_SERVER_ERROR.value())
            )
        }
    }
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

