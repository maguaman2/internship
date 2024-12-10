package ec.edu.sudamericano.Internship.mapper

import ec.edu.sudamericano.Internship.dto.TutorCompanyDto
import ec.edu.sudamericano.Internship.entity.TutorCompanyEntity

object TutorCompanyMapper {
    fun toEntity(tutorCompanyDto: TutorCompanyDto): TutorCompanyEntity {
        val tutorCompany = TutorCompanyEntity()
        tutorCompany.fullName = tutorCompanyDto.fullName
        tutorCompany.roll = tutorCompanyDto.roll
        tutorCompany.activity = tutorCompanyDto.activity
        tutorCompany.observation = tutorCompanyDto.observation
        tutorCompany.companyId= tutorCompanyDto.companyId

        return tutorCompany
}

    fun toDto (tutorCompany:TutorCompanyEntity): TutorCompanyDto {
        val tutorCompanyDto = TutorCompanyDto()
        tutorCompanyDto.fullName = tutorCompany.fullName
        tutorCompanyDto.roll = tutorCompany.roll
        tutorCompanyDto.activity = tutorCompany.activity
        tutorCompanyDto.observation = tutorCompany.observation
        tutorCompanyDto.companyId= tutorCompany.companyId


        return tutorCompanyDto

    }
}