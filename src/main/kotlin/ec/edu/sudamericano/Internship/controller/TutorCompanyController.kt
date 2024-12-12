package ec.edu.sudamericano.Internship.controller



import ec.edu.sudamericano.Internship.dto.TutorCompanyDto

import ec.edu.sudamericano.Internship.response.SuccessResponse
import ec.edu.sudamericano.Internship.service.TutorCompanyService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/tutorCompanies")
class TutorCompanyController {
    @Autowired
    lateinit var tutorCompanyService: TutorCompanyService

    @GetMapping("/{id}")
        fun findAll(): ResponseEntity<*> {
            val response = tutorCompanyService.findAll()
            return ResponseEntity(SuccessResponse(data=response), HttpStatus.OK)
        }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): ResponseEntity<*> {
            val response = tutorCompanyService.findById(id)
            return ResponseEntity(SuccessResponse(data = response), HttpStatus.OK)
        }

    @PostMapping("/{id}")
    fun save(@RequestBody @Valid tutorCompanyDto: TutorCompanyDto): ResponseEntity<*> {
            val response= tutorCompanyService.save(tutorCompanyDto)
            return ResponseEntity(SuccessResponse(data = response), HttpStatus.CREATED)
        }

    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @RequestBody @Valid tutorCompanyDto: TutorCompanyDto): ResponseEntity<*> {
            val response = tutorCompanyService.update(id, tutorCompanyDto)

        return ResponseEntity(SuccessResponse(data = response), HttpStatus.OK)

        }
    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): ResponseEntity<Any> {
            val response = tutorCompanyService.delete(id)
            return ResponseEntity(SuccessResponse(data = response), HttpStatus.OK)
        }
}



