package com.ikeapp.systems;

import java.lang.reflect.Field;

/**
 * @author: wei.shen
 * @date: 2018/10/17
 */
public class DemoFieldUtil {
    public static void getFruitInfo(Class<?> clazz){
        Field[] fields = clazz.getDeclaredFields();
        for(Field field :fields){
            if(field.isAnnotationPresent(DemoField.class)){
                DemoField fld = (DemoField) field.getAnnotation(DemoField.class);
                System.out.println(fld.format());
                //修改属性的权限
                field.setAccessible(true);
            }
        }
    }
}
