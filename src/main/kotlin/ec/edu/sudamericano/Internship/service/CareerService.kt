package ec.edu.sudamericano.Internship.service
import ec.edu.sudamericano.Internship.dto.CareerDTO
import ec.edu.sudamericano.Internship.entity.Career
import ec.edu.sudamericano.Internship.mapper.CareerMapper
import ec.edu.sudamericano.Internship.repository.CareerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CareerService {
    @Autowired
    lateinit var careerRepository: CareerRepository


    fun getCareers(): List<Career> {
        return careerRepository.findAll()
    }

    fun createCareer(careerDTO: CareerDTO): CareerDTO {
        val careerEntity = CareerMapper.toEntity(careerDTO)
        val savedCareer = careerRepository.save(careerEntity)
        return CareerMapper.toDTO(savedCareer)
    }

    fun getCareer(id: Long): CareerDTO {
        val career = careerRepository.findById(id).orElseThrow { RuntimeException("Career not found") }
        return CareerMapper.toDTO(career)
    }

    fun getAllCareers(): List<CareerDTO> {
        return careerRepository.findAll().map { CareerMapper.toDTO(it) }
    }

    fun updateCareer(id: Long, careerDTO: CareerDTO): CareerDTO {
        val existingCareer = careerRepository.findById(id).orElseThrow { RuntimeException("Career not found") }
        val updatedCareer = existingCareer.copy(
            fullName = careerDTO.fullName,
            coordinatorId = careerDTO.coordinatorId
        )
        val savedCareer = careerRepository.save(updatedCareer)
        return CareerMapper.toDTO(savedCareer)
    }

    fun deleteCareer(id: Long) {
        if (!careerRepository.existsById(id)) {
            throw RuntimeException("Career not found")
        }
        careerRepository.deleteById(id)
    }
}