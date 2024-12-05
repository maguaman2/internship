package ec.edu.sudamericano.Internship.entity

import jakarta.persistence.*


@Entity
@Table(name = "institute")
class Institute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null

    @Column(name = "full_name", nullable = false)
    val fullName: String? = null
    val address: String? = null
    val phone: String? = null
    val city: String? = null
}