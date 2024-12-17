package ec.edu.sudamericano.Internship.controller

import ec.edu.sudamericano.Internship.dto.CompanyDto
import ec.edu.sudamericano.Internship.entity.Company
import ec.edu.sudamericano.Internship.response.SuccessResponse
import ec.edu.sudamericano.Internship.service.CompanyService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/company")
class CompanyController {

    @Autowired
    lateinit var companyService: CompanyService

    @GetMapping
    fun getCompanies(): ResponseEntity<*> {
        val response = companyService.getCompanies()
        return ResponseEntity(SuccessResponse(data = response), HttpStatus.OK)
    }

    @GetMapping("/{id}")
    fun getCompanyId(@PathVariable id: Long): ResponseEntity<*> {
        val response = companyService.getCompanyById(id)
        return ResponseEntity(SuccessResponse(data = response), HttpStatus.OK)
    }

    @PostMapping
    fun save(@RequestBody @Valid companyDto: CompanyDto): ResponseEntity<*> {
        val response = companyService.save(companyDto)
        return ResponseEntity(SuccessResponse(data = response), HttpStatus.CREATED)
    }

    @PutMapping("/{id}")
    fun updateCompany(
        @PathVariable id: Long,
        @RequestBody @Valid companyDto: CompanyDto
    ): ResponseEntity<*> {
        val response = companyService.updateCompany(id, companyDto)
        return ResponseEntity(SuccessResponse(data = response), HttpStatus.OK)
    }

    @DeleteMapping("/{id}")
    fun deleteCompany(@PathVariable id: Long): ResponseEntity<*> {
        companyService.deleteCompany(id)
        return ResponseEntity(SuccessResponse(data = "Company deleted"), HttpStatus.NO_CONTENT)
    }

}
