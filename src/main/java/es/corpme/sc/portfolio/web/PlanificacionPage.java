package es.corpme.sc.portfolio.web;

import es.corpme.sc.portfolio.entity.Actividad;
import es.corpme.sc.portfolio.entity.Desarrollo;
import es.corpme.sc.portfolio.entity.Planificacion;
import es.corpme.sc.portfolio.repository.DesarrolloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import utils.Utils;

import javax.validation.Valid;

/**
 * Created by ahg on 02/02/2018.
 */
@Controller
public class PlanificacionPage {

    @Autowired
    DesarrolloRepository desarrolloRepository;

    @RequestMapping("/planificacion/{id}")
    public String index(@PathVariable String id, Model model) {

        Desarrollo desarrollo = desarrolloRepository.findOne(id);

        if(desarrollo.planificacion == null) {
            desarrollo.planificacion = new Planificacion();
        }

        model.addAttribute("id",desarrollo.id);
        model.addAttribute("plan",desarrollo.planificacion);

        return "planificacion";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/planificacion/{id}/add")
    public String add(@PathVariable String id, Model model) {

        Desarrollo desarrollo = desarrolloRepository.findOne(id);

        if(desarrollo.planificacion == null) {
            desarrollo.planificacion = new Planificacion();
        }

        Actividad actividad = new Actividad(desarrollo.planificacion.nextPlanificacionId());

        desarrollo.planificacion.actividades.add(actividad);
        desarrolloRepository.save(desarrollo);

        model.addAttribute("id",desarrollo.id);
        model.addAttribute("plan",desarrollo.planificacion);


        return "redirect:/planificacion/".concat(desarrollo.id);
    }

}
