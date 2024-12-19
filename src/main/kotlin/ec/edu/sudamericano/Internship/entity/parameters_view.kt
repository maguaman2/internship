package ec.edu.sudamericano.Internship.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "parameters_view")
class ParameterView(
    @Id
    @Column(name = "parameter_value") // Usamos `parameter_value` como el identificador
    var parameterValue: String? = null,

    @Column(name = "career_name")
    var careerName: String? = null
)
