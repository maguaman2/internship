package ec.edu.sudamericano.Internship.dto

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

class EngagementCoordinatorDto {
    @NotNull(message = "The full name is required")
    @NotBlank(message = "The full name cannot be blank")
    var fullName: String? = null

    @NotNull(message = "The email is required")
    @NotBlank(message = "The email cannot be blank")
    var email: String? = null
}