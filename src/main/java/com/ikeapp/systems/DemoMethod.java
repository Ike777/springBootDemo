package com.ikeapp.systems;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author: wei.shen
 * @date: 2018/10/18
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface DemoMethod {

    String prefix() default "ME_";

    long start() default 0L;

    long end() default 0L;

    long cost() default 0L;
}
