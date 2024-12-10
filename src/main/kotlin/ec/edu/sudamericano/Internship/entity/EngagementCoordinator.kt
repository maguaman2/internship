package ec.edu.sudamericano.Internship.entity

import jakarta.persistence.*

@Entity
@Table(name = "engagement_coordinator")
class EngagementCoordinator {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null

    var fullName: String? = null
    var email: String? = null
    var telephone: String? = null
    var instituteId: Long? = null
}