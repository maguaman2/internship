package ec.edu.sudamericano.Internship.controller

import ec.edu.sudamericano.Internship.dto.EngagementCoordinatorDto
import ec.edu.sudamericano.Internship.entity.EngagementCoordinator
import ec.edu.sudamericano.Internship.service.EngagementCoordinatorService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api/engagementCoordinators")
class EngagementCoordinatorController {

    @Autowired
    lateinit var engagementCoordinatorService: EngagementCoordinatorService

    @GetMapping
    fun getEngagementCoordinators() = engagementCoordinatorService.getEngagementCoordinators()

    @GetMapping("/{id}")
    fun getEngagementCoordinatorById(@PathVariable id: Long): EngagementCoordinator {
        return engagementCoordinatorService.getEngagementCoordinatorById(id)
    }

    @PostMapping
    fun save(@RequestBody @Valid engagementCoordinatorDto: EngagementCoordinatorDto): EngagementCoordinator{
        return engagementCoordinatorService.save(engagementCoordinatorDto)
    }

    @PutMapping("/{id}")
    fun updateEngagementCoordinator(@PathVariable id: Long, @RequestBody @Valid engagementCoordinatorDto: EngagementCoordinatorDto): EngagementCoordinator{
        return engagementCoordinatorService.updateEngagementCoordinator(id, engagementCoordinatorDto)
    }

    @DeleteMapping("/{id}")
    fun deleteEngagementCoordinator(@PathVariable id: Long) {
        engagementCoordinatorService.deleteEngagementCoordinator(id)
    }
}