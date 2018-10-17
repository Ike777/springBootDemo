package com.ikeapp;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: wei.shen
 * @date: 2018/8/27
 */
public class Test {

    public static void main(String[] args) {
        BigDecimal aa = BigDecimal.valueOf(11.12145d).add(BigDecimal.valueOf(21.123456d)).setScale(0,BigDecimal.ROUND_HALF_UP);
        System.out.println(aa);

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
