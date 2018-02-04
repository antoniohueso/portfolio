package es.corpme.sc.portfolio.web;

import es.corpme.sc.portfolio.entity.Desarrollo;
import es.corpme.sc.portfolio.repository.DesarrolloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by ahg on 02/02/2018.
 */
@Controller
public class SolicitudPage {

    @Autowired
    DesarrolloRepository desarrolloRepository;

    @RequestMapping("/solicitud")
    public String index(Model model) {
        return "solicitud";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/solicitud")
    public String add(@Valid Desarrollo desarrollo, BindingResult bindingResult, Model model) {

        System.out.println(desarrollo.fechaCambioNormativo);

        desarrolloRepository.insert(desarrollo);


        if(bindingResult.hasErrors()) {
            System.out.println("Pollas: " + bindingResult.getFieldErrors());
            model.addAttribute("error","Mierda");
            //return "solicitud";
        }



        return "redirect:/solicitud";
    }

}
