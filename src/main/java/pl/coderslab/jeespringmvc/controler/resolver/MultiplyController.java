package pl.coderslab.jeespringmvc.controler.resolver;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
public class MultiplyController {

    @GetMapping("/multiply")
    String multiply(@RequestParam(defaultValue = "10", name = "size") int size, Model model) {
        List<Integer> collect = IntStream.range(1, size + 1)
                .mapToObj(x -> (x))
                .collect(Collectors.toList());

        model.addAttribute("collect", collect);
        return "multiply";
    }

    @GetMapping("/multiply/{rows}/{cols}")
    String paramMultiply(@PathVariable(name = "rows") int rows, @PathVariable(name = "cols") int cols, Model model) {
        List<Integer> collect = IntStream.range(1, rows + 1)
                .mapToObj(x -> (x))
                .collect(Collectors.toList());
        List<Integer> collect2 = IntStream.range(1, cols + 1)
                .mapToObj(x -> (x))
                .collect(Collectors.toList());

        model.addAttribute("collect", collect);
        model.addAttribute("collect2", collect2);
        return "multiply2";

    }


    /*W kontrolerze MultiplyController utwórz akcję /paramMultiply/<rows>/<cols>,
Akcja ma przyjmować 2 parametry <rows> oraz <cols>.
Przekaż zmienne do widoku, a następnie wyświetl tabliczkę mnożenia w tabelce html w postaci:
Parametr rows = 10, cols =2.*/

}
