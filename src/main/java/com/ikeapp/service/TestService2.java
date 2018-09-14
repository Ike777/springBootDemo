package com.ikeapp.service;

import com.ikeapp.entity.TTest;
import com.ikeapp.mapper.TTestDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: wei.shen
 * @date: 2018/9/14
 */
@Service
public class TestService2 {

    Logger log = LoggerFactory.getLogger(TestService2.class);

    @Autowired
    private TTestDao testDa;

    //@Async
    @Transactional(rollbackFor = Exception.class)
    public void testMethod(Long id){

        log.info("--- In test2");

        TTest tt = testDa.selectById(id);
        log.info("--- tt id:{}",tt.getId());

        TTest t1 = new TTest();
        t1.setIntroduce("33333333");
        t1.setMobile("333333333");
        t1.setRealName("33333333");

        testDa.insert(t1);

        throw new RuntimeException("2222");
    }
}
