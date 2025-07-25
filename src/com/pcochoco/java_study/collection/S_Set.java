package com.pcochoco.java_study.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class S_Set {
    public void method() {
        Set<String> set = new HashSet<>();

        set.add("hi");
        //set.add("hi");
        set.add(null); //null 가능 - 중복되지는 않음

        set.add(new String("hi")); //String에 대해서도 중복 제거됨

        //idx 개념 x
        //set에 저장된 객체에 접근하기
        for(String str : set){
            System.out.println(str);
        }

        //내부 반복자 사용
        //실행시킬 코드를 람다식으로 줌 - Consumer 객체 전달
        set.forEach(System.out::println);
        set.forEach(s -> System.out.println(s));

        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());

        //HashSet의 내용을 ArrayList로
        List<String> list = new ArrayList<>(set);

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        //iterator의 사용
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        set.iterator().forEachRemaining(System.out::println);
        set.forEach(System.out::println);


    }

    public void method2(){
        Set<Music2> music = new  HashSet<>();

        music.add(new Music2("exile", "taylor", 1));
        music.add(new Music2("blank space", "tay", 2));
        music.add(new Music2("mean", "ty", 3));
        //중복되는 정보가 제거되지 않음
        //Music에 해시코드, equals가 정의되지 않기 때문인 것
        //다 다른 객체로 해시코드에 의해 판단됨
        //주소값이 같지 않으면 같지 않은 객체로 봄 - HashSet

        music.add(new Music2("exile", "taylor", 1));
        music.add(new Music2("blank space", "tay", 2));
        music.add(new Music2("mean", "ty", 3));

    }



}
