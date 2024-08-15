package com.example.ferramentas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ferramentasController {

    @GetMapping("/")
    public String main(Model model) {
        return "main";
    }

    @GetMapping("/home")
    public String home(Model model) {
        return "home/home";
    }

    @GetMapping("/user")
    public String user(Model model) {
        return "user/userForm";
    }

}