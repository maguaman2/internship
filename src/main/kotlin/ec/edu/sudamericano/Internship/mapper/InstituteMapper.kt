package ec.edu.sudamericano.Internship.mapper

import ec.edu.sudamericano.Internship.dto.InstituteDto
import ec.edu.sudamericano.Internship.entity.Institute
import org.springframework.stereotype.Component

@Component
object InstituteMapper {

    fun toEntity(instituteDto: InstituteDto): Institute {
        val institute = Institute()
        institute.fullName = instituteDto.fullName
        institute.address = instituteDto.address
        institute.phone = instituteDto.phone
        institute.city = instituteDto.city
        return institute
    }
}

