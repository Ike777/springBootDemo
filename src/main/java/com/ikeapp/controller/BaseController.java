package com.ikeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by wei.shen
 * 2018/4/19
 */
@Controller
public class BaseController {

    @RequestMapping("/main")
    public String first(){
        return "main";
    }
}
