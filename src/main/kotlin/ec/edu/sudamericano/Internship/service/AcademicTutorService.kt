package ec.edu.sudamericano.Internship.service

import ec.edu.sudamericano.Internship.entity.AcademicTutorWithCareerEntity

import ec.edu.sudamericano.Internship.repository.AcademicTutorRepository
import ec.edu.sudamericano.Internship.repository.CareerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AcademicTutorService {

    @Autowired
    private lateinit var academicTutorRepository: AcademicTutorRepository

    @Autowired
    private lateinit var careerRepository: CareerRepository


    fun findAll(): List<AcademicTutorWithCareerEntity> {
        return academicTutorRepository.findAll()
    }


    fun findById(id: Long): AcademicTutorWithCareerEntity? {
        return academicTutorRepository.findById(id).orElse(null)
    }


    fun findByCareerId(careerId: Int): List<AcademicTutorWithCareerEntity> {
        return academicTutorRepository.findByCareerId(careerId)
    }


    fun findCareerForTutor(id: Long): AcademicTutorWithCareerEntity? {
        val tutor = findById(id)
        return tutor?.careerId
    }
}
