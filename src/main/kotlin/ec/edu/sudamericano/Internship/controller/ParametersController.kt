package ec.edu.sudamericano.Internship.controller

import ec.edu.sudamericano.Internship.dto.ParametersDto
import ec.edu.sudamericano.Internship.response.SuccessResponse
import ec.edu.sudamericano.Internship.service.ParametersService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/parameters")
class ParametersController {

    @Autowired
    lateinit var parametersService: ParametersService//
    @GetMapping("/all")
    fun getAllParameters(): ResponseEntity<Any> {
        val response = parametersService.findAll()
        return ResponseEntity(SuccessResponse(data = response), HttpStatus.OK)
    }

    // Endpoint para vista lista de parámetros
    @GetMapping("/list")
    fun listView(): ResponseEntity<*> {
        val response = parametersService.listView()
        return ResponseEntity(SuccessResponse(data = response), HttpStatus.OK)
    }

    // Endpoint para crear un parámetro
    @PostMapping
    fun createParameter(@RequestBody @Valid parametersDto: ParametersDto): ResponseEntity<Any> {
        val response = parametersService.save(parametersDto)
        return ResponseEntity(SuccessResponse(data = response), HttpStatus.CREATED)
    }
}
