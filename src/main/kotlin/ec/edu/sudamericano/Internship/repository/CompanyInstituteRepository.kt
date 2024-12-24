package ec.edu.sudamericano.Internship.repository


import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface CompanyInstituteView : JpaRepository<CompanyInstituteViewEntity, Long> {
    fun findById(id: Long?): CompanyInstituteViewEntity?
}
