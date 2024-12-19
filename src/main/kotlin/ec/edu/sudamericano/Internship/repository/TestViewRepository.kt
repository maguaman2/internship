package ec.edu.sudamericano.Internship.repository

import ec.edu.sudamericano.Internship.entity.TestView
import org.springframework.data.jpa.repository.JpaRepository

interface TestViewRepository : JpaRepository<TestView, Int> {
}