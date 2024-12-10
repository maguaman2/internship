package ec.edu.sudamericano.Internship.dto

import jakarta.validation.constraints.NotNull
import java.time.LocalDate

class PermissionDto {

    @NotNull(message = "Date can't be null")
    var date: LocalDate? = null

    @NotNull( message =  "StudentId can't be null")
    val studentId: Int = 0

    @NotNull( message =  "CompanyId can't be null")
    val companyId: Int = 0

    @NotNull(message = "City can't be null")
    var city: String = ""

    @NotNull(message = "DateIni can't be null")
    var dateIni: LocalDate? = null

    @NotNull(message = "Dateend can't be null")
    var dateEnd: LocalDate? = null

    @NotNull(message = "Description can't be null")
    var description: String? = null


}