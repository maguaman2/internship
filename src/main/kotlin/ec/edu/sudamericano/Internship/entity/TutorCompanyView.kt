package ec.edu.sudamericano.Internship.entity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.springframework.web.bind.annotation.RestController

@Entity
@Table(name = "company_tutor_view")
class TutorCompanyView {
    @Id
    @Column(updatable = false)
    var TutorCompanyEntityId: Int? = null
    var companyId: Int? = null
    var companyName: String? = null
    var tutorCompanyFullname: String? = null
}
