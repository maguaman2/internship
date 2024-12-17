package ec.edu.sudamericano.Internship.controller
import ec.edu.sudamericano.Internship.dto.ActivityDto
import ec.edu.sudamericano.Internship.repository.AcademicTutorRepository
import ec.edu.sudamericano.Internship.response.ErrorResponse
import ec.edu.sudamericano.Internship.response.FailedResponse
import ec.edu.sudamericano.Internship.response.SuccessResponse
import ec.edu.sudamericano.Internship.service.AcademicTutorService
import ec.edu.sudamericano.Internship.service.activityService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api/academic_tutor")

class AcademicTutorController {


   @Autowired
   private lateinit var academicTutorService: AcademicTutorService

   @GetMapping
   fun findAll():ResponseEntity<*>{
      val response = academicTutorService.findAll()
   return ResponseEntity(SuccessResponse(data =response),HttpStatus.OK)

   }
}







