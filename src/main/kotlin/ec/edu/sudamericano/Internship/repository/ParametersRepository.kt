package ec.edu.sudamericano.Internship.repository

import ec.edu.sudamericano.Internship.entity.Parameters
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ParametersRepository : JpaRepository<Parameters, Long>
