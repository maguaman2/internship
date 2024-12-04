package ec.edu.sudamericano.Internship.mapper

import ec.edu.sudamericano.Internship.dto.EngagementCoordinatorDto
import ec.edu.sudamericano.Internship.entity.EngagementCoordinator

object EngagementCoordinatorMapper {
    fun toEntity(dto: EngagementCoordinatorDto): EngagementCoordinator {
        val engagementCoordinator = EngagementCoordinatorMapper()
        engagementCoordinator.fullName = engagementCoordinatorDto.fullName
        engagementCoordinator.email = engagementCoordinatorDto.email
        return engagementCoordinator
    }
}