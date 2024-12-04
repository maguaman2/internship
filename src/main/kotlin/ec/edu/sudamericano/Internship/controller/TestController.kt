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
    fun findAll(): ResponseEntity<Any> {
        return try {
            val tests = testService.findAll()
            if (tests.isNotEmpty()) {
                ResponseEntity(SuccessResponse(data = tests), HttpStatus.OK)
            } else {
                ResponseEntity(FailedResponse(data = "No se encontraron tests"), HttpStatus.NOT_FOUND)
            }
        } catch (e: Exception) {
            ResponseEntity(
                ErrorResponse(message = "Error al buscar los tests", code = 500),
                HttpStatus.INTERNAL_SERVER_ERROR
            )
        }
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): ResponseEntity<Any> {
        return try {
            val test = testService.findById(id)
            ResponseEntity(SuccessResponse(data = test), HttpStatus.OK)
        } catch (e: EntityNotFoundException) {
            ResponseEntity(
                FailedResponse(data = e.message ?: "Test no encontrado"),
                HttpStatus.NOT_FOUND
            )
        } catch (e: Exception) {
            ResponseEntity(
                ErrorResponse(message = "Error encontrado", code = 500),
                HttpStatus.INTERNAL_SERVER_ERROR
            )
        }
    }

    @PostMapping
    fun create(@RequestBody @Valid testDto: TestDto): ResponseEntity<Any> {
        return try {
            val test = testService.save(testDto)
            ResponseEntity(SuccessResponse(data = test), HttpStatus.CREATED)
        } catch (ex: Exception) {
            ResponseEntity(
                ErrorResponse(message = "Error al crear un test", code = 500),
                HttpStatus.INTERNAL_SERVER_ERROR
            )
        }
    }

    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @RequestBody @Valid testDto: TestDto): ResponseEntity<Any> {
        return try {
            val test = testService.update(id, testDto)
            ResponseEntity(SuccessResponse(data = test), HttpStatus.OK)
        } catch (e: EntityNotFoundException) {
            ResponseEntity(
                FailedResponse(data = e.message ?: "Test no encontrado"),
                HttpStatus.NOT_FOUND
            )
        } catch (e: Exception) {
            ResponseEntity(
                ErrorResponse(message = "Error al actualizar el test", code = 500),
                HttpStatus.INTERNAL_SERVER_ERROR
            )
        }
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): ResponseEntity<Any>{
        return try {
            testService.delete(id)
            ResponseEntity(SuccessResponse(data = "Test eliminado correctamente"), HttpStatus.OK)
        }catch (e: EntityNotFoundException){
            ResponseEntity(FailedResponse(data = e.message ?: "Error al actualizar el test"), HttpStatus.NOT_FOUND)
        }catch (e: Exception){
            ResponseEntity(ErrorResponse(message = "Error al actualizar el test", code = 500), HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }
}
