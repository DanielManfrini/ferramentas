package com.example.ferramentas.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ferramentas.models.FormData;

@RestController
public class userController {

    @PostMapping("/user/save")
    public String save(@RequestBody FormData formData) {

        return formData.toString();

    }

}
