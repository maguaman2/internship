package ec.edu.sudamericano.Internship.controller

import ec.edu.sudamericano.Internship.dto.CompanyDto
import ec.edu.sudamericano.Internship.service.CompanyService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/company")
class CompanyController {

    @Autowired
    lateinit var companyService: CompanyService

    // Obtener todos los registros de compañías
    @GetMapping
    fun getCompanies(): ResponseEntity<*> {
        val response = companyService.getCompanies()
        return ResponseEntity(response, HttpStatus.OK)
    }

    // Obtener una compañía por su ID
    @GetMapping("/{id}")
    fun getCompanyById(@PathVariable id: Long): ResponseEntity<*> {
        val response = companyService.getCompanyById(id)
        return ResponseEntity(response, HttpStatus.OK)
    }

    // Crear una nueva compañía
    @PostMapping
    fun createCompany(@RequestBody companyDto: CompanyDto): ResponseEntity<*> {
        val response = companyService.save(companyDto)
        return ResponseEntity(response, HttpStatus.CREATED)
    }

    // Actualizar una compañía existente
    @PutMapping("/{id}")
    fun updateCompany(
        @PathVariable id: Long,
        @RequestBody companyDto: CompanyDto
    ): ResponseEntity<*> {
        val response = companyService.updateCompany(id, companyDto)
        return ResponseEntity(response, HttpStatus.OK)
    }

    // Eliminar una compañía por su ID
    @DeleteMapping("/{id}")
    fun deleteCompany(@PathVariable id: Long): ResponseEntity<*> {
        companyService.deleteCompany(id)
        return ResponseEntity("Company deleted", HttpStatus.NO_CONTENT)
    }
}
