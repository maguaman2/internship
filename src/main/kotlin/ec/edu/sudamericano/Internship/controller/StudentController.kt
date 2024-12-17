package ec.edu.sudamericano.Internship.controller


import ec.edu.sudamericano.Internship.dto.StudentDto
import ec.edu.sudamericano.Internship.response.SuccessResponse
import ec.edu.sudamericano.Internship.service.StudentService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api/students")
class StudentController {

    @Autowired
    lateinit var studentService: StudentService

    @GetMapping
    fun getStudents(): ResponseEntity<*> {
        val response = studentService.getStudents()
        return ResponseEntity(SuccessResponse(data = response), HttpStatus.OK)
    }

    @GetMapping("/{id}")
    fun getStudentById(@PathVariable id: Long): ResponseEntity<*> {
        val response = studentService.getStudentById(id)
        return ResponseEntity(SuccessResponse(data = response), HttpStatus.OK)
    }

    @PostMapping
    fun save(@RequestBody @Valid studentDto: StudentDto): ResponseEntity<*> {
        val response = studentService.save(studentDto)
        return ResponseEntity(SuccessResponse(data = response), HttpStatus.CREATED)
    }

    @PutMapping("/{id}")
    fun updateStudent(@PathVariable id: Long, @RequestBody @Valid studentDto: StudentDto): ResponseEntity<*> {
        val response = studentService.updateStudent(id, studentDto)
        return ResponseEntity(SuccessResponse(data = response), HttpStatus.OK)
    }

    @DeleteMapping("/{id}")
    fun deleteStudent(@PathVariable id: Long): ResponseEntity<*> {
        studentService.deleteStudent(id)
        return ResponseEntity(SuccessResponse(data = "Student deleted"), HttpStatus.NO_CONTENT)
    }
}
