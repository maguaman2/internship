package ec.edu.sudamericano.Internship.entity

import jakarta.persistence.*
import java.time.LocalDateTime


@Entity
@Table(name = "practice")
class Practice{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = false)
    var id: Long? = null

    @Column(name = "assign_date")
    var assignDate: LocalDateTime? = null

    @Column(name = "start_date")
    var startDate: LocalDateTime? = null

    @Column(name = "end_date")
    var endDate: LocalDateTime? = null

    @Column (nullable = false, length = 500)
    var observations: String? = null

    //@ManyToOne
    //@JoinColumn(name = "company_id", referencedColumnName = "id")
    //var company: Company? = null

    //@ManyToOne
    //@JoinColumn(name = "student_id", referencedColumnName = "id")
    //var student: Student? = null//

    //@ManyToOne
    //@JoinColumn(name = "academic_tutor_id", referencedColumnName = "id")
    //var academicTutor: AcademicTutor? = null

}