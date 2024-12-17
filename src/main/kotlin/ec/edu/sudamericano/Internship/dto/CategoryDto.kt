package ec.edu.sudamericano.Internship.dto
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

class CategoryDto {
    var id: Long? = null

    @NotNull(message = "Description cannot be null")
    @NotBlank(message = "Description cannot be blank")
    var description: String? = null

    var signature: String? = null

    var careerId: Int? = null
}
