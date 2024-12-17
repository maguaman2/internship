package ec.edu.sudamericano.Internship.dto

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

class StudentDto {

    var id : Long? = null

    @NotNull(message = "Descrption is required")
    @NotBlank(message = "Descrption is required")
    var fullName : String = null.toString()
    var nui : String? = null
    var telephone : String? = null
    var email : String? = null
    var cycle : String? = null
    var section : String? = null
    var address : String? = null
    var photoUrl : String? = null
    var careerId : Long? = null
}




