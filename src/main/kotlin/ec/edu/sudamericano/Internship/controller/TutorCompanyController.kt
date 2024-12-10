package ec.edu.sudamericano.Internship.controller

import ec.edu.sudamericano.Internship.dto.TutorCompanyDto
import ec.edu.sudamericano.Internship.entity.TutorCompanyEntity
import ec.edu.sudamericano.Internship.service.TutorCompanyService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/tutorCompanies")
class TutorCompanyController {
    @Autowired
    lateinit var tutorCompanyService: TutorCompanyService

    @GetMapping
    fun list(): List<TutorCompanyEntity>{
        return tutorCompanyService.list()
    }

    @PostMapping
    fun save (@RequestBody @Valid tutorCompanyDto: TutorCompanyDto): TutorCompanyDto {
        return tutorCompanyService.save(tutorCompanyDto)
    }
}