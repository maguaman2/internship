package ec.edu.sudamericano.Internship.dto

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

class ActivityDto {

    @NotNull(message = "is required")
    @NotBlank(message = "is required")
    var description: String? = null

    @NotNull(message = "is required")
    var hours: Int? = null

    var resources: String? = null
    var observations: String? = null

    /*
    @NotNull(message = "is required")
    var studentId: Int? = null

    @NotNull(message = "is required")
    var companyTutorId: Int? = null

    @NotNull(message = "is required")
    var practiceId: Int? = null

     */


}