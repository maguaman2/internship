package ec.edu.sudamericano.Internship.dto

data class CompanyDto(
    var companyName: String,
    var address: String,
    var lat: Double?,
    var lon: Double?,
    var telephone: String?,
    var city: String?,
    var province: String?,
    var ceoName: String?
)
