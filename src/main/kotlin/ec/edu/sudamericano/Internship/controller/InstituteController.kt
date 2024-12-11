package ec.edu.sudamericano.Internship.controller

import ec.edu.sudamericano.Internship.dto.InstituteDto
import ec.edu.sudamericano.Internship.service.InstituteService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api/institute")
class InstituteController {
    @Autowired
    val instituteService: InstituteService? = null

    @GetMapping("/{id}")
    fun getInstituteById(@PathVariable id: Long?): ResponseEntity<InstituteDto> {
        return instituteService!!.findById(id!!)
            .map { body: InstituteDto? -> ResponseEntity.ok(body) }
            .orElse(ResponseEntity.notFound().build())
    }

    @PostMapping
    fun createInstitute(@RequestBody instituteDTO: InstituteDto?): InstituteDto? {
        return instituteService!!.save(instituteDTO)
    }

    @DeleteMapping("/{id}")
    fun deleteInstitute(@PathVariable id: Long?): ResponseEntity<Void> {
        instituteService!!.delete(id!!)
        return ResponseEntity.noContent().build()
    }
}