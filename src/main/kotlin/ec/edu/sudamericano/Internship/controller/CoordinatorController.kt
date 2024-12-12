package ec.edu.sudamericano.internship.controller

import ec.edu.sudamericano.internship.entity.Coordinator
import ec.edu.sudamericano.internship.service.CoordinatorService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

data class SuccessResponse(val data: Any?)

@RestController
@RequestMapping("/api/coordinators")
class CoordinatorController {

    @Autowired
    lateinit var coordinatorService: CoordinatorService

    // Endpoint GET: Obtener todos los coordinadores
    @GetMapping
    fun findAll(): ResponseEntity<*> {
        val response = coordinatorService.findAll()
        return ResponseEntity(SuccessResponse(data = response), HttpStatus.OK)
    }

    // Endpoint GET: Obtener un coordinador por ID
    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): ResponseEntity<*> {
        val response = coordinatorService.findById(id)
        return ResponseEntity(SuccessResponse(data = response), HttpStatus.OK)
    }

    // Endpoint PUT: Actualizar un coordinador
    @PutMapping("/{id}")
    fun update(
        @PathVariable id: Long,
        @RequestBody updatedCoordinator: Coordinator
    ): ResponseEntity<*> {
        val response = coordinatorService.update(id, updatedCoordinator)
        return ResponseEntity(SuccessResponse(data = response), HttpStatus.OK)
    }

    // Endpoint POST: Crear un coordinador
    @PostMapping
    fun create(@RequestBody coordinator: Coordinator): ResponseEntity<*> {
        val response = coordinatorService.create(coordinator)
        return ResponseEntity(SuccessResponse(data = response), HttpStatus.CREATED)
    }

    // Endpoint DELETE: Eliminar un coordinador
    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): ResponseEntity<*> {
        coordinatorService.delete(id)
        return ResponseEntity(SuccessResponse(data = null), HttpStatus.NO_CONTENT)
    }
}