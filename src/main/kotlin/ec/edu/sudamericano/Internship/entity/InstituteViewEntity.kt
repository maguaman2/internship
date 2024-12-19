package ec.edu.sudamericano.Internship.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class ListView {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    var id: Int? = null
    var full_name: String? = null
    var email: String? = null
    var phone_number: String? = null
}