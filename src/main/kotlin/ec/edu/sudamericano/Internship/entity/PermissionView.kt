package ec.edu.sudamericano.Internship.entity

import jakarta.persistence.*
import java.sql.Timestamp

@Entity
@Table(name = "permission_view")
class PermissionView {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null

    @Column(name = "permission_date")
    var date: Timestamp? = null

    @Column(name = "student_fullname")
    var studentFullName: String? = null

    @Column(name = "student_nui")
    var studentNui: String? = null
}
