package ec.edu.sudamericano.Internship.controller

import ec.edu.sudamericano.Internship.dto.CareerDTO
import ec.edu.sudamericano.Internship.response.SuccessResponse
import ec.edu.sudamericano.Internship.service.CareerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/careers")
class CareerController {

    @Autowired
    lateinit var careerService: CareerService

    @GetMapping
    fun getCareers(): ResponseEntity<*> {
        val response = careerService.getCareers()
        return ResponseEntity(SuccessResponse(data = response), HttpStatus.OK)
    }

    @PostMapping
    fun createCareer(@RequestBody careerDTO: CareerDTO): ResponseEntity<*> {
        val createdCareer = careerService.createCareer(careerDTO)
        return ResponseEntity(SuccessResponse(data = createdCareer), HttpStatus.CREATED)
    }

    @GetMapping("/{id}")
    fun getCareer(@PathVariable id: Long): ResponseEntity<*> {
        val careerDTO = careerService.getCareer(id) // Devuelve un solo CareerDTO
        return ResponseEntity(SuccessResponse(data = careerDTO), HttpStatus.OK)
    }

    @PutMapping("/{id}")
    fun updateCareer(@PathVariable id: Long, @RequestBody careerDTO: CareerDTO): ResponseEntity<*> {
        val updatedCareer = careerService.updateCareer(id, careerDTO)
        return ResponseEntity(SuccessResponse(data = updatedCareer), HttpStatus.OK)
    }
    @DeleteMapping("/{id}")
    fun deleteCareer(@PathVariable id: Long): ResponseEntity<*> {
    careerService.deleteCareer(id)
        return ResponseEntity(SuccessResponse(data = null), HttpStatus.NO_CONTENT)
    }
}
