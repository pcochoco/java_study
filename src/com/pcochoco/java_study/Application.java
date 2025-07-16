package com.pcochoco.java_study;
//같은 package 안에 있는 경우 import문 생략 가능

import com.pcochoco.java_study.c_class.Person;
import com.pcochoco.java_study.e_enum.Week;
import com.pcochoco.java_study.m_method.M_Method;
import com.pcochoco.java_study.variable.A_Variable;

public class Application {
    public static void main(String[] args) {
        //Enum
        //열거 타입의 변수에 열거 상수를 저장
        Week today = Week.MONDAY;

        //열거 타입 메서드
        //열거 상수가 가지고 있는 문자열
        System.out.println(today.name());

        //열거 상수 중 몇번째인지 반환
        System.out.println(today.ordinal());

        //정적 메서드 - 객체 생성 없이 class로 호출 -> 이와 상관없이 제공하고자 하는 기능에 대한 용도
        //동일한지 비교
        System.out.println(today.equals(Week.MONDAY));

        //해당하는 수보다 today가 앞쪽에 있음 = 음수
        //뒤쪽에 있음 = 양수
        System.out.println(today.compareTo(Week.MONDAY));

        //실행할 메서드가 있는 class 생성(new)

        //class명 var명 = new class명();
        //package을 import 없이 사용하면 package까지 선언 시 써줘야 함
        A_Variable a = new A_Variable();

        a.variableTest();


        Person person = new  Person();
        person.setName("A");
        person.setAge(30);
        person.getName();

        //현 Application 이 있는 것은 c_class 내가 아님
        //따라서 해당 package와 다르기 때문에 접근이 불가능해지는 것
        //Person 안에서는 생성 가능
        //Phone phone = new Phone();

        //배열
        int[] nums = {1, 2, 3};

        M_Method m = new M_Method();

        System.out.println(m.method1(nums));

        //불가능 - 메서드 호출 시 정수형 배열임을 알려줘야함
        //System.out.println({1, 2, 3}); //불가
        System.out.println(m.method1(new int[] {1, 2, 3}));

        //가변인자 메서드 활용
        System.out.println(m.method2(1, 2, 3));




    }
}
