package ec.edu.sudamericano.Internship.mapper

import ec.edu.sudamericano.Internship.dto.CompanyDto
import ec.edu.sudamericano.Internship.entity.Company

object CompanyMapper {
    fun toEntity(dto: CompanyDto): Company {
        return Company().apply {
            company_name = dto.companyName
            address = dto.address
            lat = dto.lat
            lon = dto.lon
            telephone = dto.telephone
            city = dto.city
            province = dto.province
            ceo_name = dto.ceoName
        }
    }
}
