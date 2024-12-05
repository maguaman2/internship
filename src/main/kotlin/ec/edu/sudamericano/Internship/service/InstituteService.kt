package ec.edu.sudamericano.Internship.service

import ec.edu.sudamericano.Internship.dto.InstituteDto
import ec.edu.sudamericano.Internship.entity.Institute
import ec.edu.sudamericano.Internship.mapper.InstituteMapper
import ec.edu.sudamericano.Internship.repository.InstituteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*


@Service
class InstituteService {
    @Autowired
    val instituteRepository: InstituteRepository? = null

    fun findAll(): List<InstituteDto> {
        return instituteRepository!!.findAll().stream()
            .map<Any>(InstituteMapper.INSTANCE::instituteToInstituteDTO)
            .toList()
    }

    fun findById(id: Long): Optional<InstituteDto> {
        return instituteRepository!!.findById(id)
            .map<InstituteDto>(InstituteMapper.INSTANCE::instituteToInstituteDTO)
    }

    fun save(instituteDTO: InstituteDto?): InstituteDto? {
        val institute: Institute? = InstituteMapper.INSTANCE.instituteDTOToInstitute(instituteDTO)
        return InstituteMapper.INSTANCE.instituteToInstituteDTO(instituteRepository.save<S>(institute))
    }

    fun delete(id: Long) {
        instituteRepository!!.deleteById(id)
    }
}