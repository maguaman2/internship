package ec.edu.sudamericano.Internship.entity

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "permission")
class Permission {
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Id
        @Column(updatable = false)
        var id: Long? = null
        var date: LocalDate? = null
        var studentId: Int? = null
        var companyId: Int? = null
        var city: String? = null
        var dateIni: LocalDate? = null
        var dateEnd: LocalDate? = null
        var description: String? = null


    }

