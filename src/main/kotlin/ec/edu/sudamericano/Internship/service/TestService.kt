package ec.edu.sudamericano.Internship.service

import ec.edu.sudamericano.Internship.dto.TestDto
import ec.edu.sudamericano.Internship.entity.TestView
import ec.edu.sudamericano.Internship.mapper.TestMapper
import ec.edu.sudamericano.Internship.repository.TestRepository
import ec.edu.sudamericano.Internship.repository.TestViewRepository
import jakarta.persistence.EntityNotFoundException
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TestService {
    @Autowired
    lateinit var testRepository: TestRepository
    @Autowired
    lateinit var testMapper: TestMapper
    @Autowired
    lateinit var testViewRepository: TestViewRepository


    fun findAll(): List<TestDto> {
        val tests = testRepository.findAll()
        return tests.map {testMapper.toTestDto(it)}
    }


    fun findById(id: Long): TestDto {
        val test = testRepository.findById(id)
            .orElseThrow { EntityNotFoundException("Test with id $id not found") }
        return testMapper.toTestDto(test)
    }


    fun listView(): List<TestView>{
        return testViewRepository.findAll()
    }

    fun save(testDto: TestDto): TestDto {
        val test = testMapper.toEntity(testDto)
        val saveTest = testRepository.save(test)
        return testMapper.toTestDto(saveTest)
    }


    fun update(id: Long, testDto: TestDto): TestDto {
        val test = testRepository.findById(id)
            .orElseThrow{EntityNotFoundException("Test with id $id not found")}
        test.apply {
            description = testDto.description
            grade = testDto.grade
        }
        val updateTest = testRepository.save(test)
        return testMapper.toTestDto(updateTest)
    }


    fun delete(id: Long) {
        val test = testRepository.findById(id)
            .orElseThrow{EntityNotFoundException("Test with id $id not found")}
        testRepository.delete(test)
    }
}