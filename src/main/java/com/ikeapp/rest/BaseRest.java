package com.ikeapp.rest;

import com.ikeapp.entity.domain.UserDomain;
import com.ikeapp.entity.view.FirstView;
import com.ikeapp.service.FirstService;
import com.ikeapp.service.TestService;
import com.ikeapp.util.ResponseJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by wei.shen
 * 2018/4/19
 */
@RestController
@RequestMapping("/api")
public class BaseRest {

    @Autowired
    private FirstService firstService;

    @Autowired
    private TestService testService;

    @GetMapping("/main")
    public FirstView first(){
        FirstView v1 = new FirstView();
        v1.setId("ID");
        v1.setData("DATA");
        return v1;
    }

    @GetMapping("/addUser")
    public UserDomain addUser(){

        return firstService.saveUser();
    }

    @GetMapping("/test1")
    public ResponseJson test(){
        testService.testMethod();
        return new ResponseJson();
    }
}
