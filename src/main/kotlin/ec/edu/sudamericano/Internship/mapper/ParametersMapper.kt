package ec.edu.sudamericano.Internship.mapper

import ec.edu.sudamericano.Internship.dto.ParametersDto
import ec.edu.sudamericano.Internship.entity.Parameters

object ParametersMapper {

    // Convierte de ParametersDto a Parameters (entidad)
    fun toEntity(dto: ParametersDto): Parameters {
        return Parameters().apply {
            id = dto.id
            description = dto.description
            category = dto.category
            value = dto.value
            // Aquí podrías manejar la relación con Permission si es necesario
            // permission = somePermissionRepository.findById(dto.permissionId).orElse(null)
        }
    }

    // Convierte de Parameters (entidad) a ParametersDto
    fun toDto(entity: Parameters): ParametersDto {
        return ParametersDto(
            id = entity.id,
            description = entity.description,
            category = entity.category,
            value = entity.value,
            permissionId = entity.permission?.id // Si tienes una relación con permission
        )
    }
}
