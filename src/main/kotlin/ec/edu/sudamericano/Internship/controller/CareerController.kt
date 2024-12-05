package ec.edu.sudamericano.Internship.controller

import ec.edu.sudamericano.Internship.dto.CareerDTO
import ec.edu.sudamericano.Internship.response.CareerResponse
import ec.edu.sudamericano.Internship.service.CareerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/careers")
class CareerController {

    @Autowired
    lateinit var careerService: CareerService

    @GetMapping
    fun getAllCareers(): ResponseEntity<CareerResponse> {
        val careerDTOs = careerService.findAll() // Devuelve una lista de CareerDTO
        return ResponseEntity.ok(CareerResponse(true, "All careers retrieved successfully", careerDTOs))
    }

    @PostMapping
    fun createCareer(@RequestBody careerDTO: CareerDTO): ResponseEntity<CareerResponse> {
        val createdCareer = careerService.createCareer(careerDTO)
        return ResponseEntity.ok(CareerResponse(true, "Career created successfully", listOf(createdCareer))) // Asegúrate de envolverlo en una lista
    }

    @GetMapping("/{id}")
    fun getCareer(@PathVariable id: Long): ResponseEntity<CareerResponse> {
        val careerDTO = careerService.getCareer(id) // Devuelve un solo CareerDTO
        return ResponseEntity.ok(CareerResponse(true, "Career retrieved successfully", listOf(careerDTO))) // Retorna como lista de un solo elemento
    }

    @PutMapping("/{id}")
    fun updateCareer(@PathVariable id: Long, @RequestBody careerDTO: CareerDTO): ResponseEntity<CareerResponse> {
        val updatedCareer = careerService.updateCareer(id, careerDTO)
        return ResponseEntity.ok(CareerResponse(true, "Career updated successfully", listOf(updatedCareer))) // Asegúrate de envolverlo en una lista
    }

    @DeleteMapping("/{id}")
    fun deleteCareer(@PathVariable id: Long): ResponseEntity<CareerResponse> {
        // Llama al servicio para eliminar la carrera por su ID
        careerService.deleteCareer(id)
        // Devuelve una respuesta exitosa
        return ResponseEntity.ok(CareerResponse(true, "Career deleted successfully", emptyList())) // Se envía una lista vacía como data
    }
}
