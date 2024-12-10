package ec.edu.sudamericano.Internship.service


import ec.edu.sudamericano.Internship.entity.Practice
import ec.edu.sudamericano.Internship.repository.PracticeRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service

class PracticeService {

    @Autowired
    lateinit var practiceRepository: PracticeRepository

     fun findAll(): List<Practice> {
         return practiceRepository.findAll()
     }

    fun findById(id: Long?): Practice? {
        return  practiceRepository.findById(id)
    }


    fun save(practice: Practice): Practice{

        return practiceRepository.save(practice)
    }

}