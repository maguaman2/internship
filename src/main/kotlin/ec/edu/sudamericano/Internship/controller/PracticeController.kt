package ec.edu.sudamericano.Internship.controller

import ec.edu.sudamericano.Internship.entity.Practice
import ec.edu.sudamericano.Internship.service.PracticeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/practice")
class PracticeController {

    @Autowired
    lateinit var practiceService: PracticeService

    @GetMapping
    fun findAll(): List<Practice> {
        return practiceService.findAll()
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): Practice? {
        return practiceService.findById(id)
    }

    @PostMapping
    fun save(@RequestBody practice: Practice): Practice {
        return practiceService.save(practice)
    }
}
