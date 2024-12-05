package ec.edu.sudamericano.Internship.entity

import jakarta.persistence.*


@Entity
@Table(name = "parameters")



class Parameters {

    val permission: Any
        get() {
            TODO()
        }

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

  // @ManyToOne
   // @JoinColumn(name = "permission_id")
   // var permission: Permission? = null
}