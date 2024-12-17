package ec.edu.sudamericano.Internship.service


import ec.edu.sudamericano.Internship.dto.StudentDto
import ec.edu.sudamericano.Internship.entity.Student
import ec.edu.sudamericano.Internship.mapper.StudentMapper
import ec.edu.sudamericano.Internship.repository.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StudentService {

    @Autowired
    lateinit var studentRepository: StudentRepository
    fun getStudents(): List<Student> {
        return studentRepository.findAll()
    }


    fun getStudentById(id: Long): Student {
       return studentRepository.findById(id).orElseThrow {
           throw RuntimeException("student not found with id $id")
       }

    }

    fun updateStudent(id: Long, studentDto: StudentDto): Student {
        val existingStudent = getStudentById(id)
        val updatedStudent = StudentMapper.toEntity(studentDto).apply {
            this.id = existingStudent.id
        }
        return studentRepository.save(updatedStudent)
    }

    fun deleteStudent(id: Long) {
        if (!studentRepository.existsById(id)) {
            throw RuntimeException("Student not found with id: $id")
        }
        studentRepository.deleteById(id)
    }
}
