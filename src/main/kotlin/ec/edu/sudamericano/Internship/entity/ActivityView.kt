package ec.edu.sudamericano.Internship.entity

import jakarta.persistence.*

@Entity
@Table(name = "activity_view")
class ActivityView {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    var id: Long? = null

    var description: String? = null

    var hours: Int? = null

    @Column(name = "fullname")
    var fullname: String? = null

    @Column(name = "carrer_id")
    var carrerId: Long? = null
}
