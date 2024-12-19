package ec.edu.sudamericano.Internship.entity

import jakarta.persistence.*


@Entity
@Table(name = "institute")
class Institute {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(updatable = false, unique = true)

    val id: Long? = null
    var fullName: String? = null
    var address: String? = null
    var phone: String? = null
    var city: String? = null
}
