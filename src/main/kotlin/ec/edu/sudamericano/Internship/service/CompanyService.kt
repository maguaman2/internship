package ec.edu.sudamericano.Internship.service

import ec.edu.sudamericano.Internship.dto.CompanyDto
import ec.edu.sudamericano.Internship.entity.Company
import ec.edu.sudamericano.Internship.mapper.CompanyMapper
import ec.edu.sudamericano.Internship.repository.CompanyRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.Optional

@Service
class CompanyService {

    @Autowired
    lateinit var companyRepository: CompanyRepository

    // Obtener todas las compañías
    fun getCompanies(): List<Company> {
        return companyRepository.findAll()
    }


    fun save(companyDto: CompanyDto): Company {
        val company = CompanyMapper.toEntity(companyDto)
        return companyRepository.save(company)
    }


    fun getCompanyById(id: Long): Company {
        return companyRepository.findById(id).orElseThrow {
            throw RuntimeException("Company not found with id: $id")
        }
    }

    fun updateCompany(id: Long, companyDto: CompanyDto): Company {
        val existingCompany = getCompanyById(id)
        val updatedCompany = CompanyMapper.toEntity(companyDto).apply {
            this.id = existingCompany.id
        }
        return companyRepository.save(updatedCompany)
    }


    fun deleteCompany(id: Long) {
        if (!companyRepository.existsById(id)) {
            throw RuntimeException("Company not found with id: $id")
        }
        companyRepository.deleteById(id)
    }
}
