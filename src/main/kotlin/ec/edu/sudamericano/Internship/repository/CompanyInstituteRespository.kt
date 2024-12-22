package ec.edu.sudamericano.Internship.repository

import ec.edu.sudamericano.Internship.dto.CompanyInstituteDTO
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository


@Repository
interface CompanyInstituteRepository : JpaRepository<CompanyInstituteDTO?, Long?> {
    @Query(
        "SELECT new com.example.dto.CompanyInstituteDTO(c.id, c.companyName, c.address, c.city, i.id, i.fullName, i.address, i.telephone) " +
                "FROM Company c INNER JOIN Institute i ON c.city = i.city"
    )
    fun findAllCompanyInstitute(): List<CompanyInstituteDTO?>?
}
