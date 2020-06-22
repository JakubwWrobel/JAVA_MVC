package pl.coderslab.jeespringmvc.controler.basics;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.time.LocalTime;

@Controller
public class DateTime {

        @GetMapping("/showTime")
    @ResponseBody
    public String showActualTime(){
        LocalTime localTime = LocalTime.now();
        return localTime.toString();
    }

    @GetMapping("/showDate")
    @ResponseBody
    public String showDate(){
        LocalDate localDate = LocalDate.now();
        return localDate.toString();
    }
}
