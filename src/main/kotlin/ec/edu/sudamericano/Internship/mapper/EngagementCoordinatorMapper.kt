package ec.edu.sudamericano.Internship.mapper

import ec.edu.sudamericano.Internship.dto.EngagementCoordinatorDto
import ec.edu.sudamericano.Internship.entity.EngagementCoordinator

object EngagementCoordinatorMapper {
    fun toEntity(engagementCoordinatorDto: EngagementCoordinatorDto): EngagementCoordinator {
        val engagementCoordinator = EngagementCoordinator()
        engagementCoordinator.fullName = engagementCoordinatorDto.fullName
        engagementCoordinator.email = engagementCoordinatorDto.email
        return engagementCoordinator
    }
}