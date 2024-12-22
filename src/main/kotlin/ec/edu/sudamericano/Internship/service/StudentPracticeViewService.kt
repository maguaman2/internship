package ec.edu.sudamericano.Internship.service

import ec.edu.sudamericano.Internship.entity.StudentPracticeView
import ec.edu.sudamericano.Internship.repository.StudentPracticeViewRepository
import org.springframework.stereotype.Service


@Service
class StudentPracticeViewService(
    private val repository: StudentPracticeViewRepository
) {
    fun getAll(): List<StudentPracticeView> {
        return repository.findAll()
    }
}
