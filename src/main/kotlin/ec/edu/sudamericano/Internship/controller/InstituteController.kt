package ec.edu.sudamericano.Internship.controller

import ec.edu.sudamericano.Internship.dto.ActivityDto
import ec.edu.sudamericano.Internship.dto.InstituteDto
import ec.edu.sudamericano.Internship.response.SuccessResponse
import ec.edu.sudamericano.Internship.service.InstituteService
import ec.edu.sudamericano.Internship.service.TestService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.security.Provider
import javax.swing.text.html.ListView

@RestController
@RequestMapping()
class InstituteController {
    @Autowired
    private lateinit var testService: TestService

    @Autowired
    lateinit var instituteService: InstituteService
    }

    @GetMapping
    fun getActivities(): ResponseEntity<*> {
        val response = instituteService.getActivities()
        return ResponseEntity(SuccessResponse(data = response), HttpStatus.OK)
    }

    @GetMapping("/view-institute")
    fun listView():ResponseEntity<*> {
        val response = InstituteService.listView()
        return ResponseEntity(SuccessResponse(data = response), HttpStatus.OK)
    }

    @PostMapping
    fun save(@RequestBody @Valid activityDto: ActivityDto): ResponseEntity<*> {
        val response = instituteService.save(InstituteDto())
        return ResponseEntity(SuccessResponse(data = response), HttpStatus.OK)

    }
}