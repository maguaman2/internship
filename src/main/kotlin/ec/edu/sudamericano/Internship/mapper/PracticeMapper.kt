package ec.edu.sudamericano.Internship.mapper

import ec.edu.sudamericano.Internship.dto.PracticeDto
import ec.edu.sudamericano.Internship.entity.Practice
import org.springframework.stereotype.Component


@Component
object PracticeMapper {

    fun toEntity(practiceDto: PracticeDto): Practice {
        val practice = Practice()
        practice.id = practiceDto.id
        practice.assingDate = practiceDto.assignDate
        practice.startDate = practiceDto.startDate
        practice.endDate = practiceDto.endDate
        practice.observations = practiceDto.observations

        //Relación con las claves foráneas
        practice.company = practiceDto.companyId?.let { companyId ->
            val company = Company()
            company.id = companyId.toLong()
            company

        }
        practice.student = practiceDto.studentId?.let { studentId ->
            val student = Student()
            student.id = studentId.toLong()
            student
        }

        practice.academicTutor = practiceDto.academicTutorId?.let { academicTutorId ->
            val tutor = AcademicTutor()
            tutor.id = academicTutorId.toLong()
            tutor
        }
        return practice
    }
    fun toDto(practiceDto: PracticeDto): Practice {
        val practice = Practice()
        practice.id = practiceDto.id
        practice.assingDate = practiceDto.assignDate
        practice.startDate = practiceDto.startDate
        practice.endDate = practiceDto.endDate
        practice.observations = practiceDto.observations

        //Relacion con las claves forasneas

        practiceDto.companyId = practice.company?.id?.toInt()
        practiceDto.studentId = practice.student?.id?.toInt()
        practiceDto.academicTutorId = practice.academicTutor?.id?.toInt()
        return practiceDto
    }


}