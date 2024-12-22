package ec.edu.sudamericano.Internship.service

import ec.edu.sudamericano.Internship.entity.CategoryStudentView
import ec.edu.sudamericano.Internship.repository.CategoryStudentViewRepository
import org.springframework.stereotype.Service

@Service
class CategoryStudentViewService(
    private val repository: CategoryStudentViewRepository
) {
    fun getAll(): List<CategoryStudentView> {
        return repository.findAll()
    }
}
