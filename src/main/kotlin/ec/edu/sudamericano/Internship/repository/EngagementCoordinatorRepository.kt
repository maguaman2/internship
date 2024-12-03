package ec.edu.sudamericano.Internship.repository

import ec.edu.sudamericano.Internship.entity.EngagementCoordinator
import org.springframework.data.jpa.repository.JpaRepository

interface EngagementCoordinatorRepository: JpaRepository<EngagementCoordinator, Long> {
}