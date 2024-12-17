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
    fun getPermission(): ResponseEntity<*> {
            val response = permissionService.getPermission()
             return ResponseEntity(SuccessResponse(data = response), HttpStatus.OK)
        }

    @GetMapping("/{id}")
    fun getPermissionById(@PathVariable id: Long): ResponseEntity<*> {
        val response = permissionService.getPermissionById(id)
        return ResponseEntity(SuccessResponse(data = response), HttpStatus.OK)
    }

    @PostMapping
    fun save(@RequestBody @Valid permissionDto: PermissionDto): ResponseEntity<*> {
        val response = permissionService.save(permissionDto)
        return ResponseEntity(SuccessResponse(data = response), HttpStatus.CREATED)
    }

}