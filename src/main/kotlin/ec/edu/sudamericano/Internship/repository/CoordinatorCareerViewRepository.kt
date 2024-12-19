package ec.edu.sudamericano.internship.repository

import ec.edu.sudamericano.internship.entity.CoordinatorCareerView
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CoordinatorCareerViewRepository : JpaRepository<CoordinatorCareerView, Long>
