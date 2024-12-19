package ec.edu.sudamericano.Internship.service

import ec.edu.sudamericano.Internship.entity.student
import ec.edu.sudamericano.Internship.repository.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StudentService {
    @Autowired
    lateinit var studentRepository: StudentRepository

    fun getstudentcompany (companyId:Long): List <student>{
        return  studentRepository.findAllStudentCompany (companyId)

    }
}