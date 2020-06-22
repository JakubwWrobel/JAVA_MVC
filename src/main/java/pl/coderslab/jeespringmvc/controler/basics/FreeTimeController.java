package pl.coderslab.jeespringmvc.controler.basics;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

@Controller
public class FreeTimeController {

    @RequestMapping("/calcWeek")
    @ResponseBody
    public static String calcWeek() {
        LocalDateTime ld = LocalDateTime.now();
        DayOfWeek dayOfWeek = ld.getDayOfWeek();
        System.out.println(dayOfWeek);
        int hour = ld.getHour();
        System.out.println(hour);

        if (dayOfWeek.equals("SATURDAY") || dayOfWeek.equals("SUNDAY")) {
            return "Wolne";
        } else if (hour < 17 && hour > 9) {
            return "Pracuje, nie dzwoń..";
        } else {
            return "Po Pracy.";
        }
    }

}
