package ec.edu.sudamericano.Internship.repository

import ec.edu.sudamericano.Internship.entity.PermissionView
import org.springframework.data.jpa.repository.JpaRepository

interface PermissionViewRepository: JpaRepository<PermissionView, Long> {
    fun findAll(id: Long?):PermissionView
}