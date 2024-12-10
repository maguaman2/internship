package ec.edu.sudamericano.Internship.dto

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

class TestDto {

    var id : Long? = null

    @NotNull(message = "Descrption is required")
    @NotBlank(message = "Descrption is required")
    var description: String? = null

    var grade: Double? = null

    var studentId: Int? = null

    var academicTutorId: Int? = null

    var companyTutorId: Int? = null
}