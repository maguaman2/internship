package ec.edu.sudamericano.Internship.controller

import ec.edu.sudamericano.Internship.dto.CategoryDto
import ec.edu.sudamericano.Internship.mapper.CategoryMapper
import ec.edu.sudamericano.Internship.service.CategoryService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/categories")
class CategoryController(private val categoryService: CategoryService) {

    @GetMapping
    fun getAllCategories(): ResponseEntity<List<CategoryDto>> {
        val categories = categoryService.getAllCategories()
        val categoryDtos = categories.map { CategoryMapper.toCategoryDto(it) }
        return ResponseEntity.ok(categoryDtos)
    }

    @GetMapping("/{id}")
    fun getCategoryById(@PathVariable id: Long): ResponseEntity<CategoryDto> {
        val category = categoryService.getCategoryById(id)
        return ResponseEntity.ok(CategoryMapper.toCategoryDto(category))
    }

    @PostMapping
    fun saveCategory(@RequestBody categoryDto: CategoryDto): ResponseEntity<CategoryDto> {
        val category = CategoryMapper.toEntity(categoryDto)
        val savedCategory = categoryService.saveCategory(category)
        return ResponseEntity.ok(CategoryMapper.toCategoryDto(savedCategory))
    }

    @PutMapping("/{id}")
    fun updateCategory(
        @PathVariable id: Long,
        @RequestBody categoryDto: CategoryDto
    ): ResponseEntity<CategoryDto> {
        val category = CategoryMapper.toEntity(categoryDto)
        val updatedCategory = categoryService.updateCategory(id, category)
        return ResponseEntity.ok(CategoryMapper.toCategoryDto(updatedCategory))
    }

    @DeleteMapping("/{id}")
    fun deleteCategory(@PathVariable id: Long): ResponseEntity<Void> {
        categoryService.deleteCategory(id)
        return ResponseEntity.noContent().build()
    }
}
