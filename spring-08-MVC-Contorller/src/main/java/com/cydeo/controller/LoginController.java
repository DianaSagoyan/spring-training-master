package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String getLoginPage(){
        return "login.html";
    }

    @RequestMapping("/login2")
    public String getLoginPage2(){
        return "login.html";
    }

}
