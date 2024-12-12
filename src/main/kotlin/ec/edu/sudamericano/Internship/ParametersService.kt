package ec.edu.sudamericano.Internship.service

import ec.edu.sudamericano.Internship.dto.ParametersDto
import ec.edu.sudamericano.Internship.entity.Parameters
import ec.edu.sudamericano.Internship.mapper.ParametersMapper
import ec.edu.sudamericano.Internship.repository.ParametersRepository
import jakarta.persistence.EntityNotFoundException
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class ParametersService {


    @Autowired
    lateinit var parametersRepository: ParametersRepository


    @Autowired
    lateinit var parametersMapper: ParametersMapper

    // Obtener todos los parámetros
    fun findAll(): List<Parameters> {
        return parametersRepository.findAll()
    }

    // Obtener un parámetro por ID
    fun findById(id: Long): Optional<Parameters> {
        return parametersRepository.findById(id)
    }

    // Guardar o actualizar un parámetro
    fun save(parametersDto: ParametersDto): ParametersDto {
        val parameter = parametersMapper.toEntity(parametersDto)
        val saveParameters = parametersRepository.save(parameter)
        return parametersMapper.toDto(saveParameters)
    }

    // Eliminar un parámetro por ID
    fun deleteById(id: Long) {
        val parameter = parametersRepository.findById(id)
            .orElseThrow { EntityNotFoundException("Parameter Not Found") }
        parametersRepository.delete(parameter)
    }
}
