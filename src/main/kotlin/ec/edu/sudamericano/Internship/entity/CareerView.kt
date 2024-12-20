package ec.edu.sudamericano.internship.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "v3_career_view") // Nombre exacto de la vista en la base de datos
data class CareerView(
    @Id
    val careerId: Long,
    val careerName: String,
    val coordinatorId: Long?,
    val coordinatorName: String?,
    val coordinatorEmail: String?
)
