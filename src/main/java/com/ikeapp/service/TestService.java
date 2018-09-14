package com.ikeapp.service;

import com.ikeapp.entity.TTest;
import com.ikeapp.mapper.TTestDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: wei.shen
 * @date: 2018/9/14
 */
@Service
public class TestService {

    Logger log = LoggerFactory.getLogger(TestService.class);

    @Autowired
    private TTestDao testDa;

    @Autowired
    private TestService2 testService2;

    @Transactional( rollbackFor = Exception.class)
    public void testMethod(){

        TTest t1 = new TTest();
        t1.setIntroduce("1111111");
        t1.setMobile("111111111");
        t1.setRealName("1111111");

        testDa.insert(t1);


        testService2.testMethod(t1.getId());
        log.info("id:{}",t1.getId());
        try {
            Thread.sleep(1000);
        }catch(Exception e){
            log.error("Error",e);
        }
    }
}
