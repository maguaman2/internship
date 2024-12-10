package ec.edu.sudamericano.Internship.mapper

import ec.edu.sudamericano.Internship.dto.InstituteDto
import ec.edu.sudamericano.Internship.entity.Institute
import org.springframework.stereotype.Component

@Component
class InstituteMapper {

    fun toDto(institute: Institute): InstituteDto {
        return InstituteDto(
            id = institute.id,
            fullName = institute.fullName,
            address = institute.address,
            phone = institute.phone,
            city = institute.city
        )
    }

    fun toEntity(instituteDto: InstituteDto): Institute {
        val institute = Institute()
        institute.fullName = instituteDto.fullName
        institute.address = instituteDto.address
        institute.phone = instituteDto.phone
        institute.city = instituteDto.city
        return institute
    }


    fun toDtoList(institutes: List<Institute>): List<InstituteDto> {
        return institutes.map { toDto(it) }
    }

    fun toEntityList(instituteDtos: List<InstituteDto>): List<Institute> {
        return instituteDtos.map { toEntity(it) }
    }
}