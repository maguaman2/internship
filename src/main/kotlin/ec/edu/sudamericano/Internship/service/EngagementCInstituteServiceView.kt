package ec.edu.sudamericano.internship.service

import ec.edu.sudamericano.Internship.repository.EngagementCoordinatorRepository
import ec.edu.sudamericano.internship.entity.EngagementCInstituteView
import ec.edu.sudamericano.internship.repository.EngagementCInstituteRepositoryView
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class EngagementCInstituteServiceView {

    @Autowired
    lateinit var engagementCoordinatorRepository: EngagementCoordinatorRepository

    @Autowired
    lateinit var engagementCInstituteRepositoryView: EngagementCInstituteRepositoryView

    fun listView(): List<EngagementCInstituteView> {
        return engagementCInstituteRepositoryView.findAll() }
    /*fun getById(id: String?): EngagementCInstituteView? {
        return engagementCInstituteRepositoryView.findById(id).orElse(null)
    }*/
}