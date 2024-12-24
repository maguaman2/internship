package ec.edu.sudamericano.Internship.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "institute_engagement_view")
class InstituteEngagementView {

    @Id
    @Column(name = "institute_name")
    var fullName: String? = null

    @Column(name = "coordinator_name")
    var email: String? = null

    @Column(name = "coordinator_email")
    var telephone: String? = null
}
