package pl.coderslab.jeespringmvc.controler.parameters;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Controller
@RequestMapping("/first")
public class Zad4 {

    @GetMapping("/form")
    public String showingForm(){
        return "/views/zad4.jsp";
    }

    @PostMapping("/form")
    @ResponseBody
    public String takingForm(@RequestParam(name = "paramName") String paramName, @RequestParam(name = "paramDate") String paramDate) throws ParseException {
        LocalDate today = LocalDate.parse(paramDate);

        return "Parameter: " + paramName + "Date: " + today;
    }




    /*Pierwsza akcja ma być przypisana do adresu /form i metody GET.
Utwórz formularz w pliku jsp z polami tekstowymi o nazwach:
paramName
paramDate
Pierwsza akcja ma wyświetlać ten formularz.
Druga akcja ma być przypisana do adresu /form i metody POST.
Określając adresy wykorzystaj adnotacje @GetMapping oraz @PostMapping.
W metodzie obsługiwanej metodą POST odbierz, a następnie wyświetl parametr paramName .
W metodzie obsługiwanej metodą POST odbierz, przekształć do typu LocalDate, a następnie wyświetl parametr paramName.
Data ma być podawana i wyświetlana w formacie yyyy-MM-dd
*/
}
