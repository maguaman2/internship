package ec.edu.sudamericano.Internship.mapper

import ec.edu.sudamericano.Internship.dto.PermissionDto
import ec.edu.sudamericano.Internship.entity.Permission


object PermissionMapper {

    fun toEntity(permissionDto: PermissionDto): Permission {

        val permission = Permission()
        permission.date= permissionDto.date
        permission.studentId = permissionDto.studentId
        permission.companyId = permissionDto.companyId
        permission.city = permissionDto.city
        permission.dateIni=permissionDto.dateIni
        permission.dateEnd=permissionDto.dateEnd
        permission.description=permissionDto.description

        return permission
    }
}