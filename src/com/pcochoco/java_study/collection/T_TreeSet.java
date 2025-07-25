package com.pcochoco.java_study.collection;

import java.util.Set;
import java.util.TreeSet;

public class T_TreeSet {
    public void method(){
        Set<String> set = new TreeSet<>();

        //중복 제거, 정렬
        set.add("A"); //순서대로 저장
        set.add("B");
        set.add("C");
        set.add("C"); //중복 제거
        set.add(null);

        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());


    }
}
