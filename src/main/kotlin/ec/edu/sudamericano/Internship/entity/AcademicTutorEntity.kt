package ec.edu.sudamericano.Internship.entity

import jakarta.persistence.*


@Entity
@Table(name = "academic_tutor")

class AcademicTutorEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var fullName: String? = null
    var phone: String? = null
    var email : String? = null
    var career_id : Int? = null

}

