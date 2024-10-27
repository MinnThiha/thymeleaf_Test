package com.payplus.thymeleafData.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorld_controller {
    //handle method to handle helloworld
    @GetMapping("/helloWorld")
    public String helloWorld(Model model){
        model.addAttribute("message","Hello World");
        return "helloWorld";
    }
}
