package ec.edu.sudamericano.Internship.service


import ec.edu.sudamericano.Internship.dto.TutorCompanyDto
import ec.edu.sudamericano.Internship.entity.TutorCompanyEntity
import ec.edu.sudamericano.Internship.mapper.TutorCompanyMapper

import ec.edu.sudamericano.Internship.repository.TutorCompanyRepository

import jakarta.persistence.EntityNotFoundException
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TutorCompanyService {

        @Autowired
        lateinit var tutorCompanyRepository: TutorCompanyRepository


        fun findAll(): List<TutorCompanyDto> {
            val TutorCompanys = tutorCompanyRepository.findAll()
            return TutorCompanys.map {TutorCompanyMapper.toDto(it)}
        }


        fun findById(id: Long): TutorCompanyEntity {
            val tutorCompany = tutorCompanyRepository.findById(id)
                .orElseThrow{ EntityNotFoundException("TutorCompany with id $id not found") }
            return tutorCompany
        }


        fun save(tutorCompanyDto: TutorCompanyDto): TutorCompanyEntity {
            val tutorCompany = TutorCompanyMapper.toEntity(tutorCompanyDto)
            val saveTutorCompany = tutorCompanyRepository.save(tutorCompany)
            return saveTutorCompany
        }


        fun update(id: Long, tutorCompanyDto: TutorCompanyDto): TutorCompanyEntity {
            val tutorCompany = tutorCompanyRepository.findById(id)
                .orElseThrow{ EntityNotFoundException("TutorCompany with id $id not found") }
            tutorCompany.apply {
                fullName = tutorCompanyDto.fullName
                roll = tutorCompanyDto.roll
                activity = tutorCompanyDto.activity
                observation = tutorCompanyDto.observation
                companyId= tutorCompanyDto.companyId
            }
            val updateTutorCompany = tutorCompanyRepository.save(tutorCompany)
            return updateTutorCompany
        }


        fun delete(id: Long) {
            val tutorCompany = tutorCompanyRepository.findById(id)
                .orElseThrow{ EntityNotFoundException("TutorCompany with id $id not found") }
            tutorCompanyRepository.delete(tutorCompany)
        }
    }