package ec.edu.sudamericano.Internship.service

import ec.edu.sudamericano.Internship.entity.EngagementCoordinator
import ec.edu.sudamericano.Internship.repository.EngagementCoordinatorRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class EngagementCoordinatorService {
    @Autowired
    lateinit var engagementCoordinatorRepository: EngagementCoordinatorRepository

    fun getEngagementCoordinators(): List<EngagementCoordinator>{
        return engagementCoordinatorRepository.findAll()
    }

    fun save(engagementCoordinatorDto: EngagementCoordinatorDto): EngagementCoordinator{
        val engagementCoordinator = EngagementCoordinatorMapper.toEntity(engagementCoordinatorDto)
        return engagementCoordinatorRepository.save(engagementCoordinator)
    }

    fun getEngagementCoordinatorById(id: Long): EngagementCoordinator{
        return engagementCoordinatorRepository.findById(id).orElseThrow {
            throw RuntimeException("EngagementCoordinator not found with id: $id")
        }
    }

    fun updateEngagementCoordinator(id: Long, engagementCoordinatorDto: EngagementCoordinatorDto): EngagementCoordinator{
        val existingEngagementCoordinator = getEngagementCoordinatorById(id)
        val updateEngagementCoordinator = EngagementCoordinatorMapper.toEntity(engagementCoordinatorDto).apply {
            this.id = existingEngagementCoordinator.id
        }
        return engagementCoordinatorRepository.save(updateGuest) // Guarda el huésped actualizado en la base de datos
    }

    fun deleteGuest(id: Long){
        // Verifica si el huésped existe antes de intentar eliminarlo
        if (!guestRepository.existsById(id)){
            throw RuntimeException("Guest not found with id: $id")
        }
        guestRepository.deleteById(id) // Elimina el huésped de la base de datos
    }
}