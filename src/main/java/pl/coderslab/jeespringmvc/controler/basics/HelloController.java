package pl.coderslab.jeespringmvc.controler.basics;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    //    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    @GetMapping("/hello")
//    GET MAPPING zwraca wartość widoku, związku z tym szuka nazwy widoku "Hello from First Controller dlatego dodajemy ResponseBody"
    @ResponseBody
    public String hello() {
        return "Hello from First Controller";
    }
}
