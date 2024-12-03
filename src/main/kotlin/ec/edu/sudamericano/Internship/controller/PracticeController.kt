package ec.edu.sudamericano.Internship.controller

import ec.edu.sudamericano.Internship.entity.Practice
import ec.edu.sudamericano.Internship.service.PracticeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/controller")
class PracticeController {

    @Autowired
    private lateinit var practiceService: PracticeService

    @Autowired
    lateinit var practiceController: PracticeController

    @GetMapping
    fun finAll(): List<Practice>{
        return practiceService.finAll()
    }

    @GetMapping("/{id}")
    fun finById(@PathVariable id: Long): Practice?{
        return practiceService.finById(id)
    }

    @PostMapping
    fun save (@RequestBody practice: Practice): Practice{
        return practiceService.save(practice)
    }
}