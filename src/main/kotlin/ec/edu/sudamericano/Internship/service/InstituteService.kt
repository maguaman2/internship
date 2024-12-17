package ec.edu.sudamericano.Internship.service

import ec.edu.sudamericano.Internship.dto.InstituteDto
import ec.edu.sudamericano.Internship.entity.Activity
import ec.edu.sudamericano.Internship.entity.Institute
import ec.edu.sudamericano.Internship.mapper.InstituteMapper
import ec.edu.sudamericano.Internship.repository.ActivityRepository
import ec.edu.sudamericano.Internship.repository.InstituteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.Optional
@Service
class InstituteService {

    @Autowired
    private lateinit var instituteMapper: InstituteMapper

    @Autowired
    lateinit var instituteRepository: InstituteRepository

    fun getActivities(): MutableList<Institute?> {
    return instituteRepository.findAll()
    }
    fun save(instituteDto: InstituteDto): Institute {
        val institute = instituteMapper.toEntity(instituteDto)
        return instituteRepository.save(institute)
    }
}
