package ec.edu.sudamericano.internship.entity

import jakarta.persistence.*

@Entity
@Table(name = "coordinator")
class Coordinator {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(updatable = false)
   var id: Long? = null

   @Column(name = "full_name", nullable = false)
   var fullName: String? = null

   @Column(name = "nui", unique = true, nullable = false, length = 10)
   var nui: String? = null

   @Column(name = "telephone")
   var telephone: String? = null

   @Column(name = "email", unique = true, nullable = false)
   var email: String? = null
}
