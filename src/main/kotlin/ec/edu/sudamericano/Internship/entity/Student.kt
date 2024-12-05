package ec.edu.sudamericano.Internship.entity

import jakarta.persistence.*

@Entity
@Table(name = "student")
class student {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var fullName: String? = null
    var nui: String? = null
    var telephone: String? = null
    var email: String? = null
    var cycle: String? = null
    var section: String? = null
    var address: String? = null
    var photo_url : String? = null
    var career_id: Long? = null
}


