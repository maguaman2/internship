package ec.edu.sudamericano.Internship.entity
import jakarta.persistence.*

@Entity
data class Career(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(nullable = false, length = 255)
    val fullName: String,

    @Column(name = "coordinator_id")
    val coordinatorId: Long? = null
)
