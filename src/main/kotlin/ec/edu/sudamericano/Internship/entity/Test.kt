package ec.edu.sudamericano.Internship.entity

import jakarta.persistence.*

@Entity
@Table(name = "test")
class Test {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null

    var description: String? = null
    var grade: Double? = null
    var studentId: Int? = null
    var academicTutorId: Int? = null
    var companyTutorId: Int? = null

}