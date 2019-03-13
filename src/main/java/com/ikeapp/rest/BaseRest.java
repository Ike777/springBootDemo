package com.ikeapp.rest;

import com.ikeapp.entity.TTest;
import com.ikeapp.entity.domain.UserDomain;
import com.ikeapp.entity.view.FirstView;
import com.ikeapp.service.FirstService;
import com.ikeapp.service.ITTestService;
import com.ikeapp.service.TestService;
import com.ikeapp.util.ResponseJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

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

    @Autowired
    private ITTestService itTestService;

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

    @GetMapping("/test/insert")
    public ResponseEntity<TTest> testInsert(){
        TTest obj = new TTest();
        obj.setId(1L);
        obj.setMobile("3333");
        obj.setRealName("3333");
        obj.setIntroduce("33333");
        obj.setCreatedDate(new Date());
        obj.setCreatedBy("33333");
        itTestService.updateById(obj);

        return  ResponseEntity.ok(itTestService.queryById(1L));
    }

}
