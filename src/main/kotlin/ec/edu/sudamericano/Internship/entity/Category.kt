package ec.edu.sudamericano.Internship.entity

import jakarta.persistence.*

@Entity
@Table(name = "category")
class Category {
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Id
        @Column(updatable = false)
        var id: Long? = null

        var description: String? = null
        var signature: String? = null
        var careerId: Int? = null
}
