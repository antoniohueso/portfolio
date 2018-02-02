package es.corpme.sc.portfolio.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by ahg on 02/02/2018.
 */
@Controller
public class SolicitudPage {
    @RequestMapping("/")
    public String index(Map<String, Object> model) {
        model.put("name","Antoño1");
        return "index";
    }

}
