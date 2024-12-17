package ec.edu.sudamericano.Internship.entity

import jakarta.persistence.*


@Entity
@Table(name = "academic_tutor")

class AcademicTutorEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)


    @Id
    @Column(updatable = false)

    val id: Long? = null

    @Column(nullable = false, length = 100)
    val fullName: String ?= null

    @Column(nullable = false, length = 20)
    val phone: String ?= null

    @Column(nullable = false, unique = true, length = 100)
    val email: String ?= null

    @Column(nullable = false)
    val careerId: Int ?= null

}

/*
    var id: Long? = null
    var fullName: String? = null
    var phone: String? = null
    var email : String? = null
    var career_id : Int? = null
*/
