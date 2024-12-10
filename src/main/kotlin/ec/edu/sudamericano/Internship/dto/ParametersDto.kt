package ec.edu.sudamericano.Internship.dto

data class ParametersDto(
    val id: Long?,                  // ID del parámetro (opcional en caso de nuevo registro)
    val description: String?,       // Descripción del parámetro
    val category: String?,          // Categoría del parámetro
    val value: Double?,             // Valor del parámetro
    val permissionId: Long?         // ID del permiso asociado al parámetro
)
