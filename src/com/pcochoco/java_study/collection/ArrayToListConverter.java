package com.pcochoco.java_study.collection;

import java.util.ArrayList;
import java.util.List;

//type parameter 정의를 통해 generics로 변경
//String과 같이 동일하게 쓰였던 자료형을 모두 T로 변경
//객체를 생성하는 시점에 T 로 쓰여진 type이 결정 됨
//넘겨주지 않는 경우 기본 object로 변경됨
//대문자 할파벳 한 글자로 표현 (ex) T)
/*
E - element
K - key
V - value
T - type
N - number
R - result
 */

//Number 이라는 interface를 Integer, Double 등이 상속하고 있음
//type parameter에는 Number + Number을 상속하는 자식들만 올 수 있음
//super은 method generic에서 가능
//Collection implements Iterable
//? : 와일드 카드
//generic method

public class ArrayToListConverter<T extends Number> {
    private final T[] values;

    public ArrayToListConverter(T[] values) {
        this.values = values;
    }

    public void print(){
        for(T value : values){
            System.out.println(value);
        }
    }

    public List<T> toList(){
        List<T> list = new ArrayList<>();

        for(T value : values){
            list.add(value);
        }
        return list;
    }

}
