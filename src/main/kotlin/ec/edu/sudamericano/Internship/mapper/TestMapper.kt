package ec.edu.sudamericano.Internship.mapper

import ec.edu.sudamericano.Internship.dto.TestDto
import ec.edu.sudamericano.Internship.entity.Test
import org.springframework.stereotype.Component

@Component
object TestMapper {

    fun toEntity(testDto: TestDto): Test {
        val test = Test()
        test.description = testDto.description
        test.grade = testDto.grade
        //test.studentId = testDto.studentId
       // test.academicTutorId = testDto.academicTutorId
        //test.companyTutorId = testDto.companyTutorId
        return test
    }

    fun toTestDto(test: Test): TestDto {
        val testDto = TestDto()
        testDto.id = test.id
        testDto.description = test.description
        testDto.grade = test.grade
        //testDto.studentId = test.studentId
       // testDto.academicTutorId = test.academicTutorId
        //testDto.companyTutorId = test.companyTutorId
        return testDto
    }
}