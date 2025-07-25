package com.pcochoco.java_study.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A_ArrayList{
    public void method1(){
        List list = new ArrayList<>(); //type parameter : Array에 어떤 type을 저장해줄 것인지에 대한 지정

        list.add("hello");

        //auto boxing의 적용

        System.out.println(list.size());

        //add(Object e)
        //String str = list.get(0); // String이라는 자식 type에 넣을 수 없음

        String str2 = (String) list.get(0); //강제 형변환 필요

        for(Object o : list){
            System.out.println(o);
        }

        //null 저장 허용

        //객체 중복 저장 허용

        list.set(2, true); //해당 index의 값 설정

        list.addLast("a");
        list.addFirst("b");

        //인덱스 기준
        list.remove(2);

        //Object을 삭제하는 용도(요소)
        list.remove(Integer.valueOf(2));

        //null 이 아니라 데이터가 들어있지 않은 상태
        //null 시 null pointer exception 발생
        System.out.println(list.isEmpty());

        list.clear(); //모두 지움

        //오름차순 정렬
        Collections.sort(list);

        //내림차순 정렬
        Collections.sort(list, Collections.reverseOrder());

    }

    public void method2(){
        List<Music> music = new ArrayList<>();
        //Music 객체를 넣는 List이므로
        music.add(new Music("cardigan", "taylor swift", 1));
        music.add(new Music("cardigan2", "taylor swift", 2));
        music.add(new Music("cardigan3", "taylor swift", 3));
        music.add(new Music("cardigan4", "taylor swift", 4));
        music.add(new Music("cardigan5", "taylor swift", 5));
        music.add(new Music("cardigan6", "taylor swift", 6));

        for(Music m : music){
            System.out.println(m);
        }

        Collections.sort(music);
        Collections.sort(music, new ArtistAscending());

        music.sort(new ArtistAscending());

        //오름차순으로 리스트 정렬(title 순)
        //1. 익명 구현 객체
        //new 연산자를 통해 객체 못만듦 -> 추상 메서드 실행할 수 없기 때문
        //-> 구현 클래스를 통해 객체를 생성
        /*
        Collections.sort(music, new Comparator<Music>() {
            //추상 메서드를 실제로 구현 클래스로 구현해줌을 통해 객체 생성 가능
            //원래는 implement하는 클래스를 별도로 만들어줘야 함
            //익명 구현 객체(클래스)를 가지게 되는 것
            //A_ArrayList 이외 A_ArrayList$와 같이 쓰여진 게 있음 -> compile 시

            @Override
            public int compare(Music o1, Music o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
         */
        //2. 람다식 사용
        //type 생략 가능
        Collections.sort(music, (o1, o2) -> o1.getTitle().compareTo(o2.getTitle()));
        //익명 클래스를 만들지 않음



    }

}
