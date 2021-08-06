package com.codegate.aula1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String HomeApp(Model model) {
        model.addAttribute("mensagem","Esta foi uma mensagem foi injetada através do modelo");
        model.addAttribute("msg","Podemos fazer com Thymeleaf isso");
        return "index";
    }
}
