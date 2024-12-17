package ec.edu.sudamericano.Internship.service

import ec.edu.sudamericano.Internship.controller.AcademicTutorController
import ec.edu.sudamericano.Internship.entity.AcademicTutorEntity
import ec.edu.sudamericano.Internship.repository.AcademicTutorRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service


class AcademicTutorService {


    @Autowired
    private lateinit var academicTutorController: AcademicTutorController

    @Autowired
    private lateinit var academicTutorRepository: AcademicTutorRepository


    fun findAll(): List<AcademicTutorEntity> {
        return academicTutorRepository.findAll()
    }
    fun findById(id: Long): AcademicTutorEntity {
        return academicTutorRepository.findAll(id)
    }
    fun save (academicTutor: AcademicTutorEntity{
        return academicTutor.save(academicTutor)
    }
}

