package ec.edu.sudamericano.internship.service

import ec.edu.sudamericano.internship.entity.Coordinator
import ec.edu.sudamericano.internship.repository.CoordinatorRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import ec.edu.sudamericano.internship.entity.CoordinatorCareerView
import ec.edu.sudamericano.internship.repository.CoordinatorCareerViewRepository

@Service
class CoordinatorService {

    @Autowired
    lateinit var coordinatorRepository: CoordinatorRepository

    @Autowired
    lateinit var coordinatorCareerViewRepository: CoordinatorCareerViewRepository

    fun listView(): List<CoordinatorCareerView> {
        return coordinatorCareerViewRepository.findAll()
    }

    fun findAll(): List<Coordinator> {
        return coordinatorRepository.findAll()
    }

    fun findById(id: Long?): Coordinator? {
        return coordinatorRepository.findById(id)
    }

    fun save(coordinator: Coordinator): Coordinator {
        return coordinatorRepository.save(coordinator)
    }

    fun update(id: Long?, updatedCoordinator: Coordinator): Coordinator? {
        val existingCoordinator = coordinatorRepository.findById(id)
            ?: throw IllegalArgumentException("Coordinator with ID $id not found")

        existingCoordinator.fullName = updatedCoordinator.fullName
        existingCoordinator.nui = updatedCoordinator.nui
        existingCoordinator.telephone = updatedCoordinator.telephone
        existingCoordinator.email = updatedCoordinator.email

        return coordinatorRepository.save(existingCoordinator)
    }

    fun create(coordinator: Coordinator): Coordinator {
        return coordinatorRepository.save(coordinator)
    }

    fun delete(id: Long) {
        val coordinator = coordinatorRepository.findById(id)
            .orElseThrow { IllegalArgumentException("Coordinator with ID $id not found") }
        coordinatorRepository.delete(coordinator)
    }

}
