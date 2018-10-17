package com.ikeapp.systems.aspects;

import com.ikeapp.systems.DemoField;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 @author: wei.shen
 @date: 2018/10/16
 */
@Aspect
@Component
public aspect DempFieldAspect {

    @Pointcut(value = "execution(* com.ikeapp.*.*(..))")
    private void myPointCut() {
    }
    @Before("myPointCut() &&  @annotation(log)")
    public void myBefore(JoinPoint joinPoint, DemoField log) {
        System.out.println("前置通知 : " + joinPoint.getSignature().getName());
    }

    public void myAfterReturning(JoinPoint joinPoint, Object ret) {
        System.out.println("后置通知 : " + ret);
    }

    public Object myAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("前");
        // 手动执行目标类
        Object obj = joinPoint.proceed();

        System.out.println("后");
        return obj;
    }

    public void myAfterThrowing(JoinPoint joinPoint, Throwable e) {
        System.out.println("抛出异常 : " + e.getMessage());
    }

    //该表达式指定com/annotation目录下及其所有子目录下的所有带有@MyLog注解的方法体为切点。
    @After("myPointCut() &&  @annotation(log)")
    public void myAfter(JoinPoint joinPoint,DemoField log) throws NoSuchMethodException,
        SecurityException {
//		System.out.println(log.value());
        saveLog(log);
//		printLog(joinPoint);
    }

    private void printLog(JoinPoint joinPoint) throws NoSuchMethodException,
        SecurityException {
        DemoField log = null;
        Class targetClass = joinPoint.getTarget().getClass();
        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();

        Class[] parameterTypes = null;

        if (arguments != null) {
            int length = arguments.length;
            parameterTypes = new Class[length];

            for (int i = 0; i < length; ++i) {
                parameterTypes[i] = arguments[i].getClass();
            }
        }

        Method method = targetClass.getMethod(methodName, parameterTypes);
        if (method != null) {
            log = method.getAnnotation(DemoField.class);
        }
        if (log != null) {
            System.out.println("====log======" + log.value());
            if(log.value() == null){
                System.out.println("日志注解中的值是110");
            }
            saveLog(log);
        }
    }

    private void saveLog(DemoField log) {
        System.out.println("插入日志记录");
    }
}
