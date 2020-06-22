package pl.coderslab.jeespringmvc.controler.parameters;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Names {

    @RequestMapping("/{name}/{surname}")
    @ResponseBody
    String NameSurname(@PathVariable(name = "name") String name, @PathVariable(name = "surname") String surname){
        return name + " " + surname;
    }
}
