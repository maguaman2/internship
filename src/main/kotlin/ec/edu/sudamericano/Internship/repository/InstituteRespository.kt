package ec.edu.sudamericano.Internship.repository

import ec.edu.sudamericano.Internship.entity.Institute
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface InstituteRepository : JpaRepository<Institute?, Long?>

