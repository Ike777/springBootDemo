package com.ikeapp.controller;


import com.ikeapp.util.ResponseJson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by wei.shen
 * 2018/4/24
 */

@RestController
@RequestMapping("/login")
@Slf4j
public class LoginController {




    @RequestMapping("/login")
    public ResponseJson login(final @ModelAttribute(value = "userName") String userName, final @ModelAttribute(value = "password") String password){
        log.error("wwwwww");
        ResponseJson model = new ResponseJson();
        if("admin".equals(userName) && "admin".equals(password)){

        }else{
            model.setSucc(true);

        }
        return model;

    }

}
