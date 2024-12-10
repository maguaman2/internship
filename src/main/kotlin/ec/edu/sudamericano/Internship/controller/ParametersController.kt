package ec.edu.sudamericano.Internship.controller

import ec.edu.sudamericano.Internship.entity.Parameters
import ec.edu.sudamericano.Internship.response.ErrorResponse
import ec.edu.sudamericano.Internship.response.FailedResponse
import ec.edu.sudamericano.Internship.response.SuccessResponse
import ec.edu.sudamericano.Internship.service.ParametersService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/parameters")
class ParametersController @Autowired constructor(
    private val parametersService: ParametersService
) {

    @GetMapping
    fun getAllParameters(): ResponseEntity<Any> {
        return try {
            val parameters = parametersService.findAll()
            if (parameters.isNotEmpty()) {
                ResponseEntity.ok(
                    SuccessResponse(
                        message = "Parámetros encontrados",
                        data = parameters
                    )
                )
            } else {
                ResponseEntity.status(404).body(
                    FailedResponse(
                        message = "No se encontraron parámetros",
                        reason = "La base de datos está vacía"
                    )
                )
            }
        } catch (e: Exception) {
            ResponseEntity.internalServerError().body(
                ErrorResponse(
                    message = "Error al obtener parámetros",
                    errorDetails = e.message ?: "Error desconocido"
                )
            )
        }
    }

    @PostMapping
    fun createParameter(@RequestBody parameter: Parameters): ResponseEntity<Any> {
        return try {
            val savedParameter = parametersService.save(parameter)
            ResponseEntity.status(201).body(
                SuccessResponse(
                    message = "Parámetro creado con éxito",
                    data = savedParameter
                )
            )
        } catch (e: Exception) {
            ResponseEntity.internalServerError().body(
                ErrorResponse(
                    message = "Error al crear el parámetro",
                    errorDetails = e.message ?: "Error desconocido"
                )
            )
        }
    }
}
