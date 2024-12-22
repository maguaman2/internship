package ec.edu.sudamericano.Internship.controller

import ec.edu.sudamericano.Internship.entity.AcademicTutorEntity
import ec.edu.sudamericano.Internship.entity.CareerEntity
import ec.edu.sudamericano.Internship.response.SuccessResponse
import ec.edu.sudamericano.Internship.service.AcademicTutorService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/academic-tutor")
class AcademicTutorController {

   @Autowired
   private lateinit var academicTutorService: AcademicTutorService


   @GetMapping
   fun getAllTutors(): ResponseEntity<SuccessResponse> {
      val tutors = academicTutorService.findAll()
      return ResponseEntity(SuccessResponse(data = tutors), HttpStatus.OK)
   }

   @GetMapping("/{id}")
   fun getTutorById(@PathVariable id: Long): ResponseEntity<SuccessResponse> {
      val tutor = academicTutorService.findById(id)
      return if (tutor != null) {
         ResponseEntity(SuccessResponse(data = tutor), HttpStatus.OK)
      } else {
         ResponseEntity(SuccessResponse(message = "Tutor not found"), HttpStatus.NOT_FOUND)
      }
   }

  // aqui obtenermos los tutores por cada carrera

   @GetMapping("/career/{careerId}")
   fun getTutorsByCareer(@PathVariable careerId: Int): ResponseEntity<SuccessResponse> {
      val tutors = academicTutorService.findByCareerId(careerId)
      return if (tutors.isNotEmpty()) {
         ResponseEntity(SuccessResponse(data = tutors), HttpStatus.OK)
      } else {
         ResponseEntity(SuccessResponse(message = "No tutors found for this career"), HttpStatus.NOT_FOUND)
      }
   }

   // Obtener la carrera asociada a un tutor por ID
   @GetMapping("/{id}/career")
   fun getTutorCareer(@PathVariable id: Long): ResponseEntity<SuccessResponse> {
      val career = academicTutorService.findCareerForTutor(id)
      return if (career != null) {
         ResponseEntity(SuccessResponse(data = career), HttpStatus.OK)
      } else {
         ResponseEntity(SuccessResponse(message = "Career not found for this tutor"), HttpStatus.NOT_FOUND)
      }
   }
}
