package ec.edu.sudamericano.Internship.controller

import ec.edu.sudamericano.Internship.dto.ActivityDto
import ec.edu.sudamericano.Internship.entity.Activity
import ec.edu.sudamericano.Internship.entity.ActivityView
import ec.edu.sudamericano.Internship.response.ErrorResponse
import ec.edu.sudamericano.Internship.response.FailedResponse
import ec.edu.sudamericano.Internship.response.SuccessResponse
import ec.edu.sudamericano.Internship.service.ActivityService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/activities")
class ActivityController {

    @Autowired
    lateinit var activityService: ActivityService

    @GetMapping
    fun getActivities(): ResponseEntity<*> {
        val response = activityService.getActivities()
        return ResponseEntity(SuccessResponse(data=response), HttpStatus.OK)
    }

    @PostMapping
    fun save(@RequestBody @Valid activityDto: ActivityDto): ResponseEntity<*> {
        val response = activityService.save(activityDto)
        return ResponseEntity(SuccessResponse(data=response), HttpStatus.OK)

    }

    @GetMapping("/activities/byCreatedAt")
    fun getActivitiesByCreatedAt(
        @RequestParam createdAt: Long): ResponseEntity<*> {
        val response = activityService.getActivitiesByCreatedAt(createdAt)
        return ResponseEntity(SuccessResponse(data=response), HttpStatus.OK)
    }

    @GetMapping("/view")
    fun listActivityView(): List<ActivityView> {
        return activityService.listActivityView()
    }

    @GetMapping("/search")
    fun searchByDescription(@RequestParam description: String): List<ActivityView> {
        return activityService.findByDescription(description)
    }

}











