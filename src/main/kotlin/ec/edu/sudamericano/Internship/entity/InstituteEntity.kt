package ec.edu.sudamericano.Internship.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table


@Entity
@Table(name = "institute")
class Institute {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null
    var fullName: String? = null
    var address: String? = null
    var phone: String? = null
    var city: String? = null
}
