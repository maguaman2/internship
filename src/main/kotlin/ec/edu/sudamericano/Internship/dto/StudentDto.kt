package ec.edu.sudamericano.Internship.dto

import jakarta.validation.constraints.NotBlank
import org.jetbrains.annotations.NotNull


class StudentDto {
    @NotNull(message = "Internship cannot be null")
    @NotBlank(message = "Internship cannot be blank")
 var
}
