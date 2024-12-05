package ec.edu.sudamericano.Internship.mapper

import ec.edu.sudamericano.Internship.dto.InstituteDto
import ec.edu.sudamericano.Internship.entity.Institute
import org.apache.catalina.mapper.Mapper
import org.mapstruct.factory.Mappers

@Mapper
interface InstituteMapper {
    fun instituteToInstituteDTO(institute: Institute?): InstituteDto?
    fun instituteDTOToInstitute(instituteDTO: InstituteDto?): Institute?

    companion object {
        val INSTANCE: InstituteMapper = Mappers.getMapper(InstituteMapper::class.java)
    }
}