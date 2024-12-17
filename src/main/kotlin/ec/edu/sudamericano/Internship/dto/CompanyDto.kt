package ec.edu.sudamericano.Internship.dto

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull


data class CompanyDto(
@NotNull(message = "Company name is required")
@NotBlank(message = "Company name cannot be blank")
var companyName: String,


@NotNull(message = "Address is required")
@NotBlank(message = "Address cannot be blank")
var address: String,

var lat: Double?,
var lon: Double?,

var telephone: String?,

var city: String?,
var province: String?,

@NotNull(message = "CEO name is required")
@NotBlank(message = "CEO name cannot be blank")
var ceoName: String?
)