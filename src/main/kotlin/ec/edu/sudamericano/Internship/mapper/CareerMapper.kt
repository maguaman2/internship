package ec.edu.sudamericano.Internship.mapper

import ec.edu.sudamericano.Internship.dto.CareerDTO
import ec.edu.sudamericano.Internship.entity.Career

object CareerMapper {

    fun toEntity(careerDTO: CareerDTO): Career {
        return Career(
            id = careerDTO.id,
            fullName = careerDTO.fullName,
            coordinatorId = careerDTO.coordinatorId
        )
    }

    fun toDTO(career: Career): CareerDTO {
        return CareerDTO(
            id = career.id,
            fullName = career.fullName,
            coordinatorId = career.coordinatorId
        )
    }
}
