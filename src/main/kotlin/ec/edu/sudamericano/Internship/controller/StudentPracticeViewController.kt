package ec.edu.sudamericano.Internship.controller

import ec.edu.sudamericano.Internship.entity.StudentPracticeView
import ec.edu.sudamericano.Internship.service.StudentPracticeViewService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class StudentPracticeViewController(
    private val service: StudentPracticeViewService
) {
    @GetMapping("/api/student-practice")
    fun getStudentPracticeData(): List<StudentPracticeView> {
        return service.getAll()
    }
}







