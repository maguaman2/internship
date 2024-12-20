package ec.edu.sudamericano.internship.repository

import ec.edu.sudamericano.internship.entity.CareerView
import org.springframework.data.jpa.repository.JpaRepository

interface CareerViewRepository : JpaRepository<CareerView, Long>
