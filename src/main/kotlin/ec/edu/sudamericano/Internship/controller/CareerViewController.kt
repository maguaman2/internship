package ec.edu.sudamericano.internship.controller

import ec.edu.sudamericano.internship.entity.CareerView
import ec.edu.sudamericano.internship.repository.CareerViewRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CareerViewController(private val careerViewRepository: CareerViewRepository) {

    @GetMapping("/careers-view")
    fun getCareerView(): List<CareerView> {
        return careerViewRepository.findAll()
    }
}
