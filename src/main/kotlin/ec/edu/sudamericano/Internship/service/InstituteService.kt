package ec.edu.sudamericano.Internship.service

import ec.edu.sudamericano.Internship.entity.InstituteEngagementView
import ec.edu.sudamericano.Internship.repository.InstituteViewRepository
+import ec.edu.sudamericano.Internship.dto.InstituteDto
import ec.edu.sudamericano.Internship.entity.Institute
import ec.edu.sudamericano.Internship.mapper.InstituteMapper
import ec.edu.sudamericano.Internship.repository.InstituteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class InstituteService {

    @Autowired
    lateinit var instituteMapper: InstituteMapper

    @Autowired
    lateinit var instituteRepository: InstituteRepository

    @Autowired
    lateinit var instituteViewRepository: InstituteViewRepository
    fun getActivities(): MutableList<Institute?> {
        return instituteRepository.findAll()
    }


    fun listView(): List<InstituteEngagementView> {
        return instituteViewRepository.findAll()
    }

    fun save(instituteDto: InstituteDto): Institute {
        val institute = instituteMapper.toEntity(instituteDto)
        return instituteRepository.save(institute)
    }
}

