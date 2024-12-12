package ec.edu.sudamericano.Internship.controller

import ec.edu.sudamericano.Internship.dto.PracticeDto
import ec.edu.sudamericano.Internship.response.SuccessResponse
import ec.edu.sudamericano.Internship.service.PracticeService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RequestMapping("/api/practices")
@RestController
class PracticeController {

    @Autowired
    lateinit var practiceService: PracticeService


    @GetMapping
    fun getPractices(): ResponseEntity<*> {
        val response = practiceService.getPractices()
        return ResponseEntity(SuccessResponse(data = response), HttpStatus.OK)
    }


    @GetMapping("/{id}")
    fun getPracticeById(@PathVariable id: Long): ResponseEntity<*> {
        val response = practiceService.getPracticeById(id)
        return ResponseEntity(SuccessResponse(data = response), HttpStatus.OK)
    }


    @PostMapping
    fun save(@RequestBody @Valid practiceDto: PracticeDto): ResponseEntity<*> {
        val response = practiceService.save(practiceDto)
        return ResponseEntity(SuccessResponse( data = response), HttpStatus.CREATED)
    }


    @PutMapping("/{id}")
    fun updatePractice(@PathVariable id: Long, @RequestBody @Valid practiceDto: PracticeDto): ResponseEntity<*> {
        val response = practiceService.updatePractice(id, practiceDto)
        return ResponseEntity(SuccessResponse(data = response), HttpStatus.OK)
    }


    @DeleteMapping("/{id}")
    fun deletePractice(@PathVariable id: Long): ResponseEntity<*> {
        practiceService.deletePractice(id)
        return ResponseEntity(SuccessResponse(data = "Practice deleted"), HttpStatus.NO_CONTENT)
    }
}
