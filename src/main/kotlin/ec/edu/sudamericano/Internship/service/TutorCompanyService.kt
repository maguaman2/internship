package ec.edu.sudamericano.Internship.service

import ec.edu.sudamericano.Internship.dto.TutorCompanyDto
import ec.edu.sudamericano.Internship.entity.TutorCompanyEntity
import ec.edu.sudamericano.Internship.mapper.TutorCompanyMapper
import ec.edu.sudamericano.Internship.repository.TutorCompanyRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TutorCompanyService {
    @Autowired
    lateinit var  tutorCompanyRepository: TutorCompanyRepository

    fun list(): List<TutorCompanyEntity> {
        return tutorCompanyRepository.findAll()
    }

    fun save (tutorCompanyDto: TutorCompanyDto): TutorCompanyDto{
        val tutorCompanyEntity= TutorCompanyMapper.toEntity(tutorCompanyDto)
        val savedTutorCompany= tutorCompanyRepository.save(tutorCompanyEntity)
        return TutorCompanyMapper.toDto( savedTutorCompany)
    }
}