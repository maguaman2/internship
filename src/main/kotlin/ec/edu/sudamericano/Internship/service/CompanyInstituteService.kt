package ec.edu.sudamericano.Internship.service

import ec.edu.sudamericano.Internship.entity.CompanyInstituteEntity
import ec.edu.sudamericano.Internship.repository.CompanyInstituteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class CompanyInstituteService {

    @Autowired
    private lateinit var companyInstituteRepository: CompanyInstituteRepository

    fun getAllCompanyInstituteData(): List<CompanyInstituteEntity> {
        return companyInstituteRepository.findAll()
    }

    fun getCompanyInstituteById(id: Long): Optional<CompanyInstituteEntity> {
        return companyInstituteRepository.findById(id)
    }
}
