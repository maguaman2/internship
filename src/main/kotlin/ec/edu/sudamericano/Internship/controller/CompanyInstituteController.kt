package ec.edu.sudamericano.Internship.controller

import ec.edu.sudamericano.Internship.dto.CompanyInstituteDTO
import ec.edu.sudamericano.Internship.repository.CompanyInstituteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/company-institute")
class CompanyInstituteController {
    @Autowired
    private val companyInstituteRepository: CompanyInstituteRepository? = null

    @get:GetMapping
    val allCompanyInstitute: List<CompanyInstituteDTO?>?
        get() = companyInstituteRepository!!.findAllCompanyInstitute()
}
