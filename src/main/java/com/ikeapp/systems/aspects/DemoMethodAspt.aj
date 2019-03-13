package com.ikeapp.systems.aspects;

import com.ikeapp.systems.DemoField;
import com.ikeapp.systems.DemoMethod;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Date;

/**
 @author: wei.shen
 @date: 2018/10/18
 */
@Aspect
@Component
@Slf4j
public aspect DemoMethodAspt {

    @Pointcut(value = "execution(* com.ikeapp.service.impl.*.*(..))")
    private void methodPointCut() {
    }

    @Before("methodPointCut() &&  @annotation(demoMethod)")
    public void myBefore(JoinPoint joinPoint, DemoMethod demoMethod) {
        log.info("-- start --"+joinPoint.getTarget());
        log.info("-- start -- JP:{}",joinPoint);
    }

    @Around("methodPointCut() &&  @annotation(demoMethod)")
    public void myAround(ProceedingJoinPoint joinPoint, DemoMethod demoMethod) throws Throwable {
        long st = new Date().getTime();
        joinPoint.proceed();
        long cost = new Date().getTime() - st;
        if(st > 1000){
            log.info("Method,{},cost:{}",joinPoint.getSignature().getDeclaringType(),cost);
        }
    }


}
