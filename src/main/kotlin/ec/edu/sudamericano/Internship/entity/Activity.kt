package ec.edu.sudamericano.Internship.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "activity")
class Activity {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(updatable = false)
    var id: Long? = null

    @Column(nullable = false, length = 200)
    var description: String? = null

    @Column(name = "created_at", nullable = false)
    var createdAt: LocalDateTime? = null

    @Column(nullable = false)
    var hours: Int? = 0

    @Column(length = 200)
    var resources: String? = null

    @Column(length = 500)
    var observations: String? = null
/*
    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    var studentId: Student? = null

    @ManyToOne
    @JoinColumn(name = "company_tutor_id", nullable = false)
    var companyTutorId: CompanyTutor? = null

    @ManyToOne
    @JoinColumn(name = "practice_id", nullable = false)
    var practiceId: Practice? = null

*/
}