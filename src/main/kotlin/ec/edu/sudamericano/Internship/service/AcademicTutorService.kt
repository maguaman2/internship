package ec.edu.sudamericano.Internship.service

import ec.edu.sudamericano.Internship.entity.AcademicTutorEntity
import ec.edu.sudamericano.Internship.repository.AcademicTutorRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service


class AcademicTutorService {


    @Autowired
    private lateinit var academicTutorRepository: AcademicTutorRepository


    fun getAcademicTutor ( ) : List<AcademicTutor>{
        return academicTutorRepository.findAll()

    }

}