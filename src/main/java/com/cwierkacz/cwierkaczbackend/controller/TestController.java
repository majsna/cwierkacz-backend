package com.cwierkacz.cwierkaczbackend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping("/")
    @ResponseBody
    public String test(){
        return "Oto ćwierkacz - pogromca Tweetera!";
    }
}
