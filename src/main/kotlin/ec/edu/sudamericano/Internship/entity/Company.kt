package ec.edu.sudamericano.Internship.entity

import jakarta.persistence.*

@Entity
@Table(name = "company")
class Company {

        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Id
        @Column(updatable = false)
        var id: Long? = null
        var company_name: String? = null
        var address: String? = null
        var lat: Double? = null
        var lon: Double? = null
        var telephone : String? = null
        var city: String? = null
        var province  : String? = null
        var ceo_name  : String? = null

}




