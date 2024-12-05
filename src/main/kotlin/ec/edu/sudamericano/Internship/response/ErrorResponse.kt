package ec.edu.sudamericano.Internship.response

data class ErrorResponse(
    val status: String = "error",
    val message: String? = null,
    val code: Int? = null
)

