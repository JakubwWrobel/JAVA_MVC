package pl.coderslab.jeespringmvc.controler.parameters;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MaxGet {

    @RequestMapping("/random2")
    @ResponseBody
    String random(@RequestParam(name = "max") int str){
        long random = (long) (Math.random() * str) + 1;
        return String.valueOf(random);
    }

//  Przekazywanie przez
    @RequestMapping("/random3/{max}/{min}")
    @ResponseBody
    String random3(@PathVariable("max") int max, @PathVariable("min") int min){
        long random = (long) (Math.random() * max) + min;
        return "User gave following numbers" + max + " " + min + " " + "Wylosowano liczbę: " + String.valueOf(random);
    }

    /*Zmodyfikuj poprzednią akcję aby przyjmowała dodatkowo wartość minimalną <min>.
Wylosuj wartość od min do max.
Wyświetl w przeglądarce dane w następujący sposób: Użytkownik podał wartości <min> i <max>. Wylosowano liczbę: <wylosowana liczba>.*/


}
