package ec.edu.sudamericano.Internship.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.LocalDateTime

@Entity
@Table(name = "student_practice_view") // Nombre de la vista en la base de datos
data class StudentPracticeView(
    @Id
    val practiceId: Int,                // ID de la práctica (clave primaria virtual)
    val studentId: Int,                 // ID del estudiante
    val studentName: String,            // Nombre del estudiante
    val assignDate: LocalDateTime?,     // Fecha de asignación
    val startDate: LocalDateTime?,      // Fecha de inicio
    val endDate: LocalDateTime?,        // Fecha de finalización
    val observations: String?           // Observaciones de la práctica
)
