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

@RestController
@RequestMapping("/api/institutes")
class InstituteController {

    @Autowired
    private lateinit var testService: TestService

    @Autowired
    lateinit var instituteService: InstituteService

    /**
     * Endpoint para obtener todas las actividades de la tabla Institute.
     */
    @GetMapping("/activities")
    fun getActivities(): ResponseEntity<*> {
        val response = instituteService.getActivities()
        return ResponseEntity(SuccessResponse(data = response), HttpStatus.OK)
    }

    /**
     * Endpoint para obtener los registros del VIEW `institute_test_view`.
     */
    @GetMapping("/view-institute")
    fun listView(): ResponseEntity<*> {
        val response = instituteService.listView() // Usamos la función del servicio para obtener el View
        return ResponseEntity(SuccessResponse(data = response), HttpStatus.OK)
    }

    /**
     * Endpoint para guardar un Institute. Usa el DTO `InstituteDto` para recibir los datos.
     */
    @PostMapping
    fun save(@RequestBody @Valid instituteDto: InstituteDto): ResponseEntity<*> {
        val response = instituteService.save(instituteDto) // Usamos el DTO recibido para guardar la entidad
        return ResponseEntity(SuccessResponse(data = response), HttpStatus.CREATED)
    }
}
