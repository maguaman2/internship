package ec.edu.sudamericano.Internship.controller


import ec.edu.sudamericano.Internship.entity.CategoryStudentView
import ec.edu.sudamericano.Internship.service.CategoryStudentViewService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CategoryStudentViewController(
    private val service: CategoryStudentViewService
) {
    @GetMapping("/api/category-student")
    fun getCategoryStudentData(): List<CategoryStudentView> {
        return service.getAll()
    }
}