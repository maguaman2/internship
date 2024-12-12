package ec.edu.sudamericano.Internship.controller

import ec.edu.sudamericano.Internship.dto.ActivityDto
import ec.edu.sudamericano.Internship.dto.InstituteDto
import ec.edu.sudamericano.Internship.response.SuccessResponse
import ec.edu.sudamericano.Internship.service.InstituteService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping()
class InstituteController {
    @Autowired
    lateinit var instituteService: InstituteService

    @GetMapping
    fun getActivities(): ResponseEntity<*> {
        val response = instituteService.getActivities()
        return ResponseEntity(SuccessResponse(data = response), HttpStatus.OK)
    }

    @PostMapping
    fun save(@RequestBody @Valid activityDto: ActivityDto): ResponseEntity<*> {
        val response = instituteService.save(InstituteDto())
        return ResponseEntity(SuccessResponse(data = response), HttpStatus.OK)

    }
}