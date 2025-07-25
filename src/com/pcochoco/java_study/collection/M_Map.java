package com.pcochoco.java_study.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class M_Map {

    public void method() {
        Map<String, Snack> map = new HashMap<>();

        map.put("빼빼로", new Snack("빼빼로", 1000));
        map.put("컵라면", new Snack("컵라면", 1100));
        map.put("네모스낵", new Snack("네모스낵", 500));
        map.put("너겟", new Snack("너겟", 3000));
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());

        map.get("빼빼로");
        map.remove("빼빼로");

        map.clear(); //null x
        map.size();
        map.isEmpty();

        //map은 index의 개념이 없어 반복문을 사용할 수 없음
        //for 문 사용 불가
        //map 과 list는 다르기 때문에 ArrayList에 담아 사용 불가
        //new ArrayList<>();

        //keySet 메서드 이용
        Set<String> set = map.keySet();

        for(String key : set){
            System.out.printf("key : %s value : %s\n", key, map.get(key));
        }

        //Map collection에 있는 entry 객체를 Set collection에 담아 반환

        Set<Map.Entry<String, Snack>> entries = map.entrySet();

        for(Map.Entry<String, Snack> entry : entries){
            System.out.printf("key : %s value : %s\n", entry.getKey(), entry.getValue());
        }

        entries.forEach(entry -> System.out.printf("key : %s value : %s\n", entry.getKey(), entry.getValue()));




    }

}





