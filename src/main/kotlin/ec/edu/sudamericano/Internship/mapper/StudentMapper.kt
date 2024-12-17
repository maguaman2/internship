package ec.edu.sudamericano.Internship.mapper
package ec.edu.sudamericano.Internship.mapper

import ec.edu.sudamericano.Internship.dto.StudentDto
import ec.edu.sudamericano.Internship.entity.Student

object StudentMapper {
    fun toEntity(studentDto: StudentDto): Student {
        val student = Student()
        student.id = studentDto.id
        student.fullName = studentDto.fullName
        student.nui = studentDto.nui
        student.telephone = studentDto.telephone
        student.email = studentDto.email
        student.cycle = studentDto.cycle
        student.section = studentDto.section
        student.address = studentDto.address
        student.photo_url = studentDto.photoUrl
        student.career_id = studentDto.careerId
        return student
    }

    fun toStudentDto(student: Student) {
        val studentDto = StudentDto()
       studentDto.id = student.id
        studentDto.fullName = student.fullName
        studentDto.nui = student.nui
        studentDto.telephone = student.telephone
        studentDto.email = student.email
        studentDto.cycle = student.cycle
        studentDto.section = student.section
        studentDto.address = student.address
        studentDto.photoUrl = student.photo_url
        studentDto.careerId = student.career_id

    }
}

