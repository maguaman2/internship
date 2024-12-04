package ec.edu.sudamericano.Internship.controller
import ec.edu.sudamericano.Internship.dto.CareerDTO
import ec.edu.sudamericano.Internship.response.CareerResponse
import ec.edu.sudamericano.Internship.service.CareerService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/careers")
class CareerController(private val careerService: CareerService) {

    @PostMapping
    fun createCareer(@RequestBody careerDTO: CareerDTO): ResponseEntity<CareerResponse> {
        val createdCareer = careerService.createCareer(careerDTO)
        return ResponseEntity.ok(CareerResponse(true, "Career created successfully", createdCareer))
    }

    @GetMapping("/{id}")
    fun getCareer(@PathVariable id: Long): ResponseEntity<CareerResponse> {
        val careerDTO = careerService.getCareer(id)
        return ResponseEntity.ok(CareerResponse(true, "Career retrieved successfully", careerDTO))
    }



    @PutMapping("/{id}")
    fun updateCareer(@PathVariable id: Long, @RequestBody careerDTO: CareerDTO): ResponseEntity<CareerResponse> {
        val updatedCareer = careerService.updateCareer(id, careerDTO)
        return ResponseEntity.ok(CareerResponse(true, "Career updated successfully", updatedCareer))
    }

    @DeleteMapping("/{id}")
    fun deleteCareer(@PathVariable id: Long): ResponseEntity<CareerResponse> {
        careerService.deleteCareer(id)
        return ResponseEntity.ok(CareerResponse(true, "Career deleted successfully"))
    }
}
