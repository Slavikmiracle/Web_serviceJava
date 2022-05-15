package org.example.config.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Calculator {
    @GetMapping("/calc")
    public String helloPage(@RequestParam(value = "a", required = false) int a,
                            @RequestParam(value = "b", required = false) int b,
                            @RequestParam(value = "operation",required = false) String operation,
                            Model model){

        // System.out.println("Its work " +  name + "  " +surname);
        model.addAttribute("summa", "Сумма равна = "+a + b);
        model.addAttribute("proisv", "Произведение равна = "+ a * b);
        model.addAttribute("delen", "Деление равна = "+(double)( a / (double)b));
        model.addAttribute("razn", "Разность равна = " +  (a - b));


        return "calc";
    }

}
