package ec.edu.sudamericano.Internship.controller

import ec.edu.sudamericano.Internship.dto.CompanyDto
import ec.edu.sudamericano.Internship.entity.Company
import ec.edu.sudamericano.Internship.service.CompanyService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/company")
class CompanyController {

    @Autowired
    lateinit var companyService: CompanyService

    @GetMapping
    fun getCompanies(): List<Company> {
        return companyService.getCompanies()
    }

    @GetMapping("/{id}")
    fun getCompanyId(@PathVariable id: Long): Company {
        return companyService.getCompanyById(id)
    }

    @PostMapping
    fun save(@RequestBody @Valid companyDto: CompanyDto): Company {
        return companyService.save(companyDto)
    }

    @PutMapping("/{id}")
    fun updateCompany(@PathVariable id: Long, @RequestBody @Valid companyDto: CompanyDto): Company {
        return companyService.updateCompany(id, companyDto)
    }

    @DeleteMapping("/{id}")
    fun deleteCompany(@PathVariable id: Long) {
        companyService.deleteCompany(id)
    }

}