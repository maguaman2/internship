package ec.edu.sudamericano.Internship.controller

import ec.edu.sudamericano.Internship.dto.TestDto
import ec.edu.sudamericano.Internship.response.ErrorResponse
import ec.edu.sudamericano.Internship.response.FailedResponse
import ec.edu.sudamericano.Internship.response.SuccessResponse
import ec.edu.sudamericano.Internship.service.TestService
import jakarta.persistence.EntityNotFoundException
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/test")
class TestController {
    @Autowired
    lateinit var testService: TestService


    @GetMapping
    fun findAll(): ResponseEntity<*> {
        val response = testService.findAll()
        return ResponseEntity(SuccessResponse(data=response), HttpStatus.OK)
        }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): ResponseEntity<*> {
        val response = testService.findById(id)
        return ResponseEntity(SuccessResponse(data = response), HttpStatus.OK)
        }

    @PostMapping
    fun save(@RequestBody @Valid testDto: TestDto): ResponseEntity<Any> {
        val response = testService.save(testDto)
        return ResponseEntity(SuccessResponse(data = response), HttpStatus.CREATED)
    }

    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @RequestBody @Valid testDto: TestDto): ResponseEntity<Any> {
        val response = testService.update(id, testDto)
        return ResponseEntity(SuccessResponse(data = response), HttpStatus.OK)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): ResponseEntity<Any>{
     val response = testService.delete(id)
        return ResponseEntity(SuccessResponse(data = response), HttpStatus.OK)
}
}