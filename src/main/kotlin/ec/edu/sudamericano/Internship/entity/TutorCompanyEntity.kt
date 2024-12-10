package ec.edu.sudamericano.Internship.entity

import jakarta.persistence.*

@Entity
@Table(name="company_tutor")
class TutorCompanyEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null

    var fullName: String? = null
    var roll: String? = null
    var activity: String? = null
    var observation: String? = null
    var companyId: Int? = null
}


