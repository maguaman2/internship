import ec.edu.sudamericano.Internship.dto.AcademicTutorDto
import ec.edu.sudamericano.Internship.entity.AcademicTutorWithCareerEntity

object AcademicTutorMapper {


    fun toDto(entity: AcademicTutorWithCareerEntity): AcademicTutorDto {
        return AcademicTutorDto(
            id = entity.tutorId,
            fullName = entity.tutorFullName,
            phone = entity.tutorPhone,
            email = entity.tutorEmail,
            careerId = entity.careerId
        )
    }


}