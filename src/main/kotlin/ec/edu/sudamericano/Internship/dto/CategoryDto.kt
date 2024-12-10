package ec.edu.sudamericano.Internship.dto

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

class CategoryDto {
    @NotNull(message = "Internship cannot be null")
    @NotBlank(message = "Internship cannot be blank")
    var description: String? = null

}