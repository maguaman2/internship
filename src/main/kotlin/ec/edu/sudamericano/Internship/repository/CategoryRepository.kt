package ec.edu.sudamericano.Internship.repository

import ec.edu.sudamericano.Internship.entity.CompanyInstituteEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CompanyInstituteRepository : JpaRepository<CompanyInstituteEntity, Long> {
}
