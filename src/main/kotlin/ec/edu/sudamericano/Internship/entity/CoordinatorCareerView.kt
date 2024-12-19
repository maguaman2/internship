package ec.edu.sudamericano.internship.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
data class CoordinatorCareerView(
    @Id
    @Column(name = "coordinator_id")
    val coordinatorId: Long,

    @Column(name = "coordinator_name")
    val coordinatorName: String,

    @Column(name = "coordinator_nui")
    val coordinatorNui: String,

    @Column(name = "coordinator_telephone")
    val coordinatorTelephone: String? = null,

    @Column(name = "coordinator_email")
    val coordinatorEmail: String,

    @Column(name = "career_id")
    val careerId: Long? = null,

    @Column(name = "career_name")
    val careerName: String? = null
)
