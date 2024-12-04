package ec.edu.sudamericano.Internship.repository

import ec.edu.sudamericano.Internship.entity.Company
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CompanyRepository : JpaRepository<Company, Long> // Extiende de JpaRepository
