package com.ikeapp;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.Data;

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
        List<Ta> la = Arrays.asList(new Ta("a"), new Ta("v"), new Ta("c"),new Ta("a"));
        List<Ta> a = new ArrayList(la);
        HashSet sa = new HashSet(a);
        a.clear();
        a.addAll(sa);

        System.out.println(a.size());

        System.out.println(la.size());
        List<String> re = new ArrayList<>();
        List<Ta> cc = la.stream().filter(item -> {
            if(re.contains(item.getT1())){
                return false;//去重
            }
            re.add(item.getT1());
            return true;
        }).collect(Collectors.toList());


        System.out.println(cc.size());


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
