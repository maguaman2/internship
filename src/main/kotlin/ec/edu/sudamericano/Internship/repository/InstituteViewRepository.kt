package ec.edu.sudamericano.Internship.repository

import ec.edu.sudamericano.Internship.entity.Institute
import org.springframework.data.jpa.repository.JpaRepository


interface InstituteViewRepository : JpaRepository<Institute, Long>
