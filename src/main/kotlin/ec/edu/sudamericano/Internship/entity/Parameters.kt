package ec.edu.sudamericano.Internship.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "parameters")
class Parameters {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    var id: Long? = null

    @Column(name = "description", length = 250)
    var description: String? = null

    @Column(name = "category", length = 250)
    var category: String? = null

    @Column(name = "value", precision = 9, scale = 2)
    var value: Double? = null

    var permissionId: Int? = null

  // @ManyToOne
   // @JoinColumn(name = "permission_id")
   // var permission: Permission? = null
}