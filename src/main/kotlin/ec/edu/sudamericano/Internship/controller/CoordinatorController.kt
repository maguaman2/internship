package ec.edu.sudamericano.internship.controller

import ec.edu.sudamericano.internship.entity.Coordinator
import ec.edu.sudamericano.internship.service.CoordinatorService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/coordinators")
class CoordinatorController {

    @Autowired
    lateinit var coordinatorService: CoordinatorService

    // Endpoint GET: Obtener todos los coordinadores
    @GetMapping
    fun findAll(): List<Coordinator> {
        return coordinatorService.findAll()
    }

    // Endpoint GET: Obtener un coordinador por ID
    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): ResponseEntity<Coordinator> {
        val coordinator = coordinatorService.findById(id)
            ?: return ResponseEntity(HttpStatus.NOT_FOUND)
        return ResponseEntity.ok(coordinator)
    }

    // Endpoint PUT: Actualizar un coordinador
    @PutMapping("/{id}")
    fun update(
        @PathVariable id: Long,
        @RequestBody updatedCoordinator: Coordinator
    ): ResponseEntity<Coordinator> {
        return try {
            val updated = coordinatorService.update(id, updatedCoordinator)
            ResponseEntity.ok(updated)
        } catch (e: IllegalArgumentException) {
            ResponseEntity(HttpStatus.NOT_FOUND)
        }
    }
}
