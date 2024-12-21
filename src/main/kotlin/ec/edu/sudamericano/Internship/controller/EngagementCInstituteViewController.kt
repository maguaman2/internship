package ec.edu.sudamericano.internship.controller

import ec.edu.sudamericano.internship.entity.EngagementCInstituteView
import ec.edu.sudamericano.internship.service.EngagementCInstituteServiceView
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("api//engagement-institutes")
class EngagementCInstituteViewController {

    @Autowired
    lateinit var engagementCInstituteServiceView: EngagementCInstituteServiceView
    @GetMapping() fun listView(): List<EngagementCInstituteView> {
        return engagementCInstituteServiceView.listView()
    }

    /*@GetMapping("/{id}")
    fun getById(@PathVariable id: String): EngagementCInstituteView? {
        return engagementCInstituteServiceView.getById(id)
    }*/
}