package ec.edu.sudamericano.Internship.dto

 class ParametersDto {
     var id: Long? = null                  // ID del parámetro (opcional en caso de nuevo registro)
     var description: String? = null      // Descripción del parámetro
     var category: String? = null         // Categoría del parámetro
     var value: Double? = null            // Valor del parámetro
     var permissionId: Int? = null        // ID del permiso asociado al parámetro
 }
