package ec.edu.sudamericano.Internship.service

import ec.edu.sudamericano.Internship.dto.InstituteDto
import org.springframework.stereotype.Service
import java.util.Optional

@Service
class InstituteService {

    val institutes = mutableListOf<InstituteDto>()

    fun getAllInstitutes(): List<InstituteDto> {
        return institutes
    }

    fun getInstituteById(id: Long): Optional<InstituteDto> {
        return institutes.stream().filter { it.id == id }.findFirst()
    }

    fun createInstitute(instituteDto: InstituteDto): InstituteDto {
        val newInstitute = instituteDto.copy(id = (institutes.size + 1).toLong())
        institutes.add(newInstitute)
        return newInstitute
    }

    fun updateInstitute(id: Long, updatedInstituteDto: InstituteDto): InstituteDto {
        val index = institutes.indexOfFirst { it.id == id }
        if (index != -1) {
            val updatedInstitute = updatedInstituteDto.copy(id = id)
            institutes[index] = updatedInstitute
            return updatedInstitute
        } else {
            throw NoSuchElementException("Institute with ID $id not found")
        }
    }

    fun deleteInstitute(id: Long) {
        val index = institutes.indexOfFirst { it.id == id }
        if (index != -1) {
            institutes.removeAt(index)
        } else {
            throw NoSuchElementException("Institute with ID $id not found")
        }
    }

    fun findAll(): List<InstituteDto> {
        return getAllInstitutes()
    }

    fun findById(id: Long): Optional<InstituteDto> {
        return getInstituteById(id)
    }

    fun save(instituteDto: InstituteDto?): InstituteDto? {
        return if (instituteDto != null) createInstitute(instituteDto) else null
    }

    fun delete(id: Long) {
        deleteInstitute(id)
    }
}