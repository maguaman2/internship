package ec.edu.sudamericano.Internship.mapper

import ec.edu.sudamericano.Internship.dto.CompanyDto
import ec.edu.sudamericano.Internship.entity.Company

object CompanyMapper {
    fun toEntity(companyDto: CompanyDto): Company {
        return Company().apply {
            val company = Company()
            company.company_name = companyDto.companyName
            company.address = companyDto.address

            /*company.lat = companyDto.lat
            company.lon = companyDto.lon
            company.telephone = companyDto.telephone
            company.city = companyDto.city
            company.province = companyDto.province
            company.ceo_name = companyDto.ceoName*/
        }
    }
