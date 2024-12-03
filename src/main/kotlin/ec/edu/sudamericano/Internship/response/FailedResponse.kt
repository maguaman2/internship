package ec.edu.sudamericano.Internship.response

data class FailedResponse(
    val status: String = "fail",
    val data: Any? = null
)