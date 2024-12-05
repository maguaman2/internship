package ec.edu.sudamericano.Internship.dto

import jakarta.validation.constraints.NotBlank
import org.jetbrains.annotations.NotNull


class AcademicTutorDto {

 @NotNull (message ="Full name is required" )
 @NotBlank (message ="Full name is required" )
 var   full_name: String? = null

 @NotNull (message = "Email is required" )
 @NotBlank (message ="Email is required" )
 var   email: String? = null

}