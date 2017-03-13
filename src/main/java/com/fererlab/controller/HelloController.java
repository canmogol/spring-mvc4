package com.fererlab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping(value = "/greeting")
    public String sayHello(Model model) {
        model.addAttribute("greeting", "Hello World");
        return "hello";
    }

    @RequestMapping(value = "/")
    public String defaultPage(Model model) {
        return "forward:index.html";
    }

    @RequestMapping(value = "/index")
    public String index(Model model) {
        return "index";
    }

}
