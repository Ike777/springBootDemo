package com.ikeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by wei.shen
 * 2018/4/19
 */
@Controller
public class BaseController {



  /*  @RequestMapping("/main")
    public String first(){
        return "main";
    }*/
    @RequestMapping("/")
    public String first(){

        return "test";
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
