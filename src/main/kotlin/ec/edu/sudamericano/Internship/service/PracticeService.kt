package ec.edu.sudamericano.Internship.service

import ec.edu.sudamericano.Internship.dto.PracticeDto
import ec.edu.sudamericano.Internship.entity.Practice
import ec.edu.sudamericano.Internship.mapper.PracticeMapper
import ec.edu.sudamericano.Internship.repository.PracticeRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PracticeService {

    @Autowired
    lateinit var practiceRepository: PracticeRepository


    fun getPractices(): List<Practice> {
        return practiceRepository.findAll()
    }


    fun getPracticeById(id: Long): Practice {
        return practiceRepository.findById(id).orElseThrow {
            throw RuntimeException("Practice not found with id: $id")
        }
    }


    fun save(practiceDto: PracticeDto): Practice {
        val practice = PracticeMapper.toEntity(practiceDto)
        return practiceRepository.save(practice)
    }


    fun updatePractice(id: Long, practiceDto: PracticeDto): Practice {
        val existingPractice = getPracticeById(id)
        val updatedPractice = PracticeMapper.toEntity(practiceDto).apply {
            this.id = existingPractice.id
        }
        return practiceRepository.save(updatedPractice)
    }


    fun deletePractice(id: Long) {
        if (!practiceRepository.existsById(id)) {
            throw RuntimeException("Practice not found with id: $id")
        }
        practiceRepository.deleteById(id)
    }
}
