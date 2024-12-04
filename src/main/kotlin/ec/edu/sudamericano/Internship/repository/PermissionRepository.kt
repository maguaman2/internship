package ec.edu.sudamericano.Internship.repository

import ec.edu.sudamericano.Internship.entity.Permission
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PermissionRepository: JpaRepository<Permission, Long> {
    fun getPermissionById(id: Long?): Permission

}


