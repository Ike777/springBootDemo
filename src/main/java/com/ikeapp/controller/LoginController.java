package com.ikeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by wei.shen
 * 2018/4/24
 */
@Controller
public class LoginController {
    @RequestMapping("/")
    public String first(){

        return "index";
    }

    @RequestMapping("/login1")
    public String login1(){

        return "login1";
    }

    @RequestMapping("/main2")
    public String main2(){
        return "main/main2";
    }
}
