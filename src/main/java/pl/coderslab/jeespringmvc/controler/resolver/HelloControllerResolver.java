package pl.coderslab.jeespringmvc.controler.resolver;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalTime;

@Controller
public class HelloControllerResolver {

    @GetMapping("/helloView")
    String helloView(Model model){
        LocalTime ldt = LocalTime.now();
        if(ldt.getHour() > 8 && ldt.getHour() < 20){
            model.addAttribute("color", "black");
            model.addAttribute("backgroundColor", "white");
        }else {
            model.addAttribute("color", "white");
            model.addAttribute("backgroundColor", "black");
        }
        return "home";
    }
//    W kontrolerze HelloController utwórz akcję helloView, dostępną pod adresem /helloView, która wyświetli ten widok.
    /*W akcji sprawdzaj aktualną godzinę i jeśli jest między 8:00 a 20:00 podmieniał tekst color i backgroundColor odpowiednio na black i white.
Gdy godzina wypada między 20:00 a 8:00, podmień wartości właściwości odwrotnie.
Uruchom stronę i zobacz efekt. Tekst powinien być czarny, a strona biała.
Zmodyfikuj program tak, aby nie brał pod uwagę aktualnej godziny, tylko na sztywno wpisz godzinę 1:00 w nocy.
Wyświetl stronę i zobacz efekt. Tekst powinien być biały, a strona czarna.*/
}
