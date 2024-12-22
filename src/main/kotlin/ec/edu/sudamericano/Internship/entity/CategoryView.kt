package ec.edu.sudamericano.Internship.entity

import jakarta.persistence.*

@Entity
@Table(name = "category_student_view") // Nombre de la vista en la base de datos
data class CategoryStudentView(
    @Id
    val categoryId: Int,                 // ID virtual, basado en category_id
    val categoryDescription: String,     // Descripción de la categoría
    val studentId: Int,                  // ID del estudiante
    val studentName: String              // Nombre completo del estudiante
)