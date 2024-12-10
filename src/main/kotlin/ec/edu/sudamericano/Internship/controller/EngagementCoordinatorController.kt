package ec.edu.sudamericano.Internship.controller

import ec.edu.sudamericano.Internship.dto.EngagementCoordinatorDto
import ec.edu.sudamericano.Internship.response.SuccessResponse
import ec.edu.sudamericano.Internship.service.EngagementCoordinatorService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/engagementCoordinators")
class EngagementCoordinatorController {

    @Autowired
    lateinit var engagementCoordinatorService: EngagementCoordinatorService

    @GetMapping
    fun getEngagementCoordinators(): ResponseEntity<*> {
        val response = engagementCoordinatorService.getEngagementCoordinators()
        return ResponseEntity(SuccessResponse(status = "success", data = response), HttpStatus.OK)
    }

    @GetMapping("/{id}")
    fun getEngagementCoordinatorById(@PathVariable id: Long): ResponseEntity<*> {
            val response = engagementCoordinatorService.getEngagementCoordinatorById(id)
            return ResponseEntity(SuccessResponse(status = "success", data = response), HttpStatus.OK)
    }

    @PostMapping
    fun save(@RequestBody @Valid engagementCoordinatorDto: EngagementCoordinatorDto): ResponseEntity<*> {
            val response = engagementCoordinatorService.save(engagementCoordinatorDto)
            return ResponseEntity(SuccessResponse(status = "success", data = response), HttpStatus.CREATED)
    }

    @PutMapping("/{id}")
    fun updateEngagementCoordinator(@PathVariable id: Long, @RequestBody @Valid engagementCoordinatorDto: EngagementCoordinatorDto): ResponseEntity<*> {
            val response = engagementCoordinatorService.updateEngagementCoordinator(id, engagementCoordinatorDto)
            return ResponseEntity(SuccessResponse(status = "success", data = response), HttpStatus.OK)

    }

    @DeleteMapping("/{id}")
    fun deleteEngagementCoordinator(@PathVariable id: Long): ResponseEntity<*> {
        engagementCoordinatorService.deleteEngagementCoordinator(id)
        return ResponseEntity(SuccessResponse(status = "success", data = "Coordinator deleted"), HttpStatus.NO_CONTENT)
    }
}