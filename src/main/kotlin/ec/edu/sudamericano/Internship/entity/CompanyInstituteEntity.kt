package ec.edu.sudamericano.Internship.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "company_institute_view")
class CompanyInstituteEntity {

    @Id
    @Column(name = "company_id")
    var companyId: Long? = null

    @Column(name = "company_name")
    var companyName: String? = null

    @Column(name = "company_address")
    var companyAddress: String? = null

    @Column(name = "company_city")
    var companyCity: String? = null

    @Column(name = "institute_id")
    var instituteId: Long? = null

    @Column(name = "institute_name")
    var instituteName: String? = null

    @Column(name = "institute_address")
    var instituteAddress: String? = null

    @Column(name = "institute_telephone")
    var instituteTelephone: String? = null
}
