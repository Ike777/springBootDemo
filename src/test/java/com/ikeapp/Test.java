package com.ikeapp;

import com.ikeapp.entity.dto.DemoDto;
import com.ikeapp.systems.DemoFieldUtil;
import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.Data;
import org.apache.commons.lang3.ArrayUtils;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author: wei.shen
 * @date: 2018/8/27
 */
public class Test {

    public static void main(String[] args) {
        String[] test={"1","2","3",null,"4"};
        List<String> tt = Arrays.asList(test).stream().filter(item -> item !=null).collect(Collectors.toList());
        Set<String> tyt = Arrays.asList(test).stream().filter(item -> item !=null).collect(Collectors.toSet());

        Map<String,String> tMap =Arrays.asList(test).stream().filter(item -> item !=null).collect(Collectors.toMap(t->t,t->t));
        //System.out.println(tt.size());



        System.out.println("aaas".contains(""));

    }

    @Data
    static class Ta {
        private String t1;

        public Ta(String t1){
            this.t1=t1;
        }


        @Override
        public boolean equals(Object a) {
            if (((Ta) a).t1.equals(this.t1)) {
                return true;
            }
            return false;
        }


        @Override
        public int hashCode(){
            return 1;
        }

    }
}
