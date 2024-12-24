package ec.edu.sudamericano.Internship.controller
import ec.edu.sudamericano.Internship.service.CompanyInstituteService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/company-institute")
class CompanyInstituteController {

    @Autowired
    lateinit var companyInstituteService: CompanyInstituteService

    // Obtener todos los registros de la vista company_institute_view
    @GetMapping
    fun getCompanyInstituteData(): ResponseEntity<*> {
        val response = companyInstituteService.getAllCompanyInstituteData()
        return ResponseEntity(response, HttpStatus.OK)
    }

    // Obtener un registro específico de la vista company_institute_view por ID
    @GetMapping("/{id}")
    fun getCompanyInstituteById(@PathVariable id: Long): ResponseEntity<*> {
        val response = companyInstituteService.getCompanyInstituteById(id)
        return if (response != null) {
            ResponseEntity(response, HttpStatus.OK)
        } else {
            ResponseEntity("Company Institute not found", HttpStatus.NOT_FOUND)
        }
    }
}
