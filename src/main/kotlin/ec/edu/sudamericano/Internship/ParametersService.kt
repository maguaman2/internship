package ec.edu.sudamericano.Internship.service

import ec.edu.sudamericano.Internship.entity.Parameters
import ec.edu.sudamericano.Internship.repository.ParametersRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class ParametersService @Autowired constructor(
    private val parametersRepository: ParametersRepository
) {

    // Obtener todos los parámetros
    fun findAll(): List<Parameters> {
        return parametersRepository.findAll()
    }

    // Obtener un parámetro por ID
    fun findById(id: Long): Optional<Parameters> {
        return parametersRepository.findById(id)
    }

    // Guardar o actualizar un parámetro
    fun save(parameters: Parameters): Parameters {
        return parametersRepository.save(parameters)
    }

    // Eliminar un parámetro por ID
    fun deleteById(id: Long) {
        if (parametersRepository.existsById(id)) {
            parametersRepository.deleteById(id)
        } else {
            throw NoSuchElementException("No se encontró un parámetro con el ID $id")
        }
    }
}
