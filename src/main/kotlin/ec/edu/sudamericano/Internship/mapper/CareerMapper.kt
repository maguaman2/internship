package ec.edu.sudamericano.Internship.mapper

import ec.edu.sudamericano.Internship.dto.CareerDTO
import ec.edu.sudamericano.Internship.entity.Career

@Mapper
interface CareerMapper {
    companion object {
        val INSTANCE: CareerMapper = Mappers.getMapper(CareerMapper::class.java)
    }

    fun toDTO(career: Career): CareerDTO
    fun toEntity(careerDTO: CareerDTO): Career
}
