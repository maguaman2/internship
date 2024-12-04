package ec.edu.sudamericano.Internship.service
import ec.edu.sudamericano.Internship.dto.CareerDTO
import ec.edu.sudamericano.Internship.mapper.CareerMapper
import ec.edu.sudamericano.Internship.repository.CareerRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class CareerService(private val careerRepository: CareerRepository, private val careerMapper: CareerMapper) {

    fun createCareer(careerDTO: CareerDTO): CareerDTO {
        val career = careerMapper.toEntity(careerDTO)
        val savedCareer = careerRepository.save(career)
        return careerMapper.toDTO(savedCareer)
    }

    fun getCareer(id: Long): CareerDTO {
        val career = careerRepository.findById(id).orElseThrow { RuntimeException("Career not found") }
        return careerMapper.toDTO(career)
    }

    fun getAllCareers(): List<CareerDTO> {
        return careerRepository.findAll().map { careerMapper.toDTO(it) }
    }

    fun updateCareer(id: Long, careerDTO: CareerDTO): CareerDTO {
        val career = careerRepository.findById(id).orElseThrow { RuntimeException("Career not found") }
        val updatedCareer = career.copy(fullName = careerDTO.fullName, coordinator = Coordinator(careerDTO.coordinatorId))
        val savedCareer = careerRepository.save(updatedCareer)
        return careerMapper.toDTO(savedCareer)
    }

    fun deleteCareer(id: Long) {
        careerRepository.deleteById(id)
    }
}
