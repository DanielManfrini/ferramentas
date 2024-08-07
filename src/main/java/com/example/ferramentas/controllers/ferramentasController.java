package com.example.ferramentas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ferramentasController {

    @GetMapping("/")
    public String home(Model model) {
       return "main";
    }
}
