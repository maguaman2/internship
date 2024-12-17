package ec.edu.sudamericano.Internship.service

import ec.edu.sudamericano.Internship.entity.Category
import ec.edu.sudamericano.Internship.repository.CategoryRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class CategoryService(private val categoryRepository: CategoryRepository) {

    fun getAllCategories(): List<Category> = categoryRepository.findAll()

    fun getCategoryById(id: Long): Category =
        categoryRepository.findById(id).orElseThrow { NoSuchElementException("Category not found with id: $id") }

    fun saveCategory(category: Category): Category = categoryRepository.save(category)

    fun updateCategory(id: Long, category: Category): Category {
        if (!categoryRepository.existsById(id)) {
            throw NoSuchElementException("Category not found with id: $id")
        }
        category.id = id
        return categoryRepository.save(category)
    }

    fun deleteCategory(id: Long) {
        if (!categoryRepository.existsById(id)) {
            throw NoSuchElementException("Category not found with id: $id")
        }
        categoryRepository.deleteById(id)
    }
}
