package ec.edu.sudamericano.Internship.mapper

object EngagementCoordinatorMapper {
    fun toEntity(engagementCoordinatorDto: EngagementCoordinatorDto): EngagementCoordinator {
        val engagementCoordinator = EngagementCoordinatorMapper()
        engagementCoordinator.fullName = engagementCoordinatorDto.fullName
        engagementCoordinator.email = engagementCoordinatorDto.email
        engagementCoordinator.telephone = engagementCoordinatorDto.telephone
        engagementCoordinator.instituteId = engagementCoordinatorDto.instituteId
        return engagementCoordinator
    }
}