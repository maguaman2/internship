package ec.edu.sudamericano.Internship.mapper

import ec.edu.sudamericano.Internship.dto.ParametersDto
import ec.edu.sudamericano.Internship.entity.Parameters
import org.springframework.stereotype.Component

@Component
object ParametersMapper {

    // Convierte de ParametersDto a Parameters (entidad)
    fun toEntity(parametersDto: ParametersDto): Parameters {
        val parameters = Parameters()

        parameters.description = parametersDto.description
        parameters.category = parametersDto.category
        parameters.value = parametersDto.value
        parameters.permissionId = parametersDto.permissionId

        return parameters

    }


    fun toDto(parameters: Parameters): ParametersDto {
        val parametersDto = ParametersDto()
        parametersDto.id = parameters.id
        parametersDto.description = parameters.description
        parametersDto.category = parameters.category
        parametersDto.permissionId = parameters.permissionId

        return parametersDto

    }
}
