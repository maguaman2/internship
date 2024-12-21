package ec.edu.sudamericano.internship.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "engagement_institute_view")
class EngagementCInstituteView {
    @Id
    @Column(name = "coordinator_full_name")
    val coordinatorFullName: String? = null

    @Column(name = "coordinator_email")
    val coordinatorEmail: String? = null

    @Column(name = "institute_full_name")
    val instituteFullName: String? = null
}