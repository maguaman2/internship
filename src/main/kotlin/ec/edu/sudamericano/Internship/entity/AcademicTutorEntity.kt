package ec.edu.sudamericano.Internship.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "academic_tutor_view")
class AcademicTutorWithCareerEntity(

    @Id
    @Column(name = "tutor_id")
    val tutorId: Long? = null,

    @Column(name = "tutor_full_name")
    val tutorFullName: String? = null,

    @Column(name = "tutor_phone")
    val tutorPhone: String? = null,

    @Column(name = "tutor_email")
    val tutorEmail: String? = null,

    @Column(name = "career_id")
    val careerId: Int? = null,

    @Column(name = "career_name")  // Nombre de la carrera
    val careerName: String? = null
)
