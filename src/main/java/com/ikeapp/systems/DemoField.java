package com.ikeapp.systems;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * 本例只打印字段Value
 * @author: wei.shen
 * @date: 2018/10/16
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface DemoField {

    String value() default "";

    String print() default "";

    String format() default "yyyy-MM-dd hh:mm:ss";
}
