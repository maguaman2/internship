package ec.edu.sudamericano.Internship.repository

import ec.edu.sudamericano.Internship.entity.ParameterView
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ParameterViewRepository : JpaRepository<ParameterView, String> {

}
