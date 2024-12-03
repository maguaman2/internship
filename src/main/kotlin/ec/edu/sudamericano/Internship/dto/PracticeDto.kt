package ec.edu.sudamericano.Internship.dto

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import java.time.LocalDateTime

class PracticeDto {

    var id: Long? = null

    var assignDate: LocalDateTime? = null

    var startDate: LocalDateTime? = null

    var endDate: LocalDateTime? = null

    @NotNull(message = "Observations are required")
    @NotBlank(message = "Observations cannot be blank")
    var observations: String? = null

    var companyId: Int? = null

    var studentId: Int? = null

    var academicTutorId: Int? = null
}