package com.appspringbootstart.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {


    @ResponseBody
    @GetMapping(value = "/")
    public String homePage () {
            return "Hello World!!!";
    }


}
