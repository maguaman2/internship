package ec.edu.sudamericano.Internship.service

import ec.edu.sudamericano.Internship.dto.PermissionDto
import ec.edu.sudamericano.Internship.entity.Permission
import ec.edu.sudamericano.Internship.entity.PermissionView
import ec.edu.sudamericano.Internship.mapper.PermissionMapper
import ec.edu.sudamericano.Internship.repository.PermissionRepository
import ec.edu.sudamericano.Internship.repository.PermissionViewRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PermissionService {

    @Autowired
    private lateinit var permissionViewRepository: PermissionViewRepository

    @Autowired
    lateinit var permissionRepository: PermissionRepository

   fun getPermission():List<Permission> {
       return permissionRepository.findAll()
   }

    fun listView(): List<PermissionView> {
        return permissionViewRepository.findAll()
    }


    fun getPermissionById(id: Long): Permission? {
        return permissionRepository.getPermissionById(id)
    }

    fun save(permissionDto: PermissionDto): Permission {
        val permission: Permission = PermissionMapper.toEntity(permissionDto)
        return permissionRepository.save(permission)
    }


}
