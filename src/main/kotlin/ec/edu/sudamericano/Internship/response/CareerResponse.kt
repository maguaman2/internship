package ec.edu.sudamericano.Internship.response

import ec.edu.sudamericano.Internship.dto.CareerDTO

data class CareerResponse(
    val success: Boolean,
    val message: String,
    val data: CareerDTO? = null
)
