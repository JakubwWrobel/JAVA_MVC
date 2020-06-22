package pl.coderslab.jeespringmvc.controler.basics;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RandomController {

    @GetMapping("/random")
    @ResponseBody
    String showRandom() {
        int random = (int)(Math.random() * 100) + 1;
        return String.valueOf(random);
    }
}
