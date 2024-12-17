package ec.edu.sudamericano.Internship.mapper

import ec.edu.sudamericano.Internship.dto.CategoryDto
import ec.edu.sudamericano.Internship.entity.Category
import org.springframework.stereotype.Component

@Component
object CategoryMapper {

    fun toEntity(categoryDto: CategoryDto): Category {
        val category = Category()
        category.id = categoryDto.id
        category.description = categoryDto.description
        category.careerId = categoryDto.careerId
        category.signature = categoryDto.signature
        return category
    }

    fun toCategoryDto(category: Category): CategoryDto {
        val categoryDto = CategoryDto()
        categoryDto.id = category.id
        categoryDto.description = category.description
        categoryDto.careerId = category.careerId
        categoryDto.signature = category.signature
        return categoryDto
    }
}
