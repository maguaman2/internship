package ec.edu.sudamericano.Internship.controller

import ec.edu.sudamericano.Internship.dto.PermissionDto
import ec.edu.sudamericano.Internship.entity.Permission
import ec.edu.sudamericano.Internship.response.ErrorResponse
import ec.edu.sudamericano.Internship.response.SuccessResponse
import ec.edu.sudamericano.Internship.service.PermissionService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/permissions")
class PermissionController {

    @Autowired
    lateinit var permissionService: PermissionService

    @GetMapping()
    fun getPermission(): ResponseEntity<Any> {
        return try {
            val permission = permissionService.getPermission()
            ResponseEntity(SuccessResponse(data = permission), HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity(ErrorResponse(message = "Error al obterner a los artistas", code = 500), HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }


    @GetMapping("/{id}")
    fun getPermissionById(@PathVariable id: Long): ResponseEntity<Any> {
        return try {
            val permission = permissionService.getPermissionById(id)
            if (permission != null) {
                ResponseEntity(SuccessResponse(data = permission), HttpStatus.OK)
            } else {
                ResponseEntity(ErrorResponse(message = "Cliente no encontrado", code = 404), HttpStatus.NOT_FOUND)
            }
        } catch (e: Exception) {
            ResponseEntity(ErrorResponse(message = "Error al obtener el cliente", code = 500), HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }

    @PostMapping
    fun save (@RequestBody @Valid permissionDto: PermissionDto): Permission{
        return permissionService.save(permissionDto)
    }

}