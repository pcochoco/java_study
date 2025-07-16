package com.pcochoco.java_study;
//같은 package 안에 있는 경우 import문 생략 가능

import com.pcochoco.java_study.c_class.Person;

public class Application {
    public static void main(String[] args) {
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



    }
}
