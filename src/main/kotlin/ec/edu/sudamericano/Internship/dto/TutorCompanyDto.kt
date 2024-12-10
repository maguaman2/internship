package ec.edu.sudamericano.Internship.dto

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

class TutorCompanyDto {
    @NotNull(message = "TutorCompany fullName cannot be null")
    @NotBlank(message = "TutorCompany fullName cannot be null")
    var fullName: String? = null

    @NotNull(message = "TutorCompany fullName cannot be null")
    @NotBlank(message = "TutorCompany fullName cannot be null")
    var roll : String? = null

    @NotNull(message = "TutorCompany fullName cannot be null")
    @NotBlank(message = "TutorCompany fullName cannot be null")
    var activity: String? = null

    @NotNull(message = "TutorCompany fullName cannot be null")
    @NotBlank(message = "TutorCompany fullName cannot be null")
    var observation: String? = null

    var companyId: Int? = null
}


