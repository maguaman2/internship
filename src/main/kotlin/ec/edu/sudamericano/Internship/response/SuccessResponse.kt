package ec.edu.sudamericano.Internship.response

data class SuccessResponse(
    val status: String = "success",
    val data: Any? = null
)