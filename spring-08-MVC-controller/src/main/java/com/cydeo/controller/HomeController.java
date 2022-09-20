package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// @component is coming with @Controller
public class HomeController {

     @RequestMapping("/home")// which end point
    public String home(){
        return "home.html";
    }
}
