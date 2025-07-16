package com.pcochoco.java_study.m_method;

public class M_Method {
    //signature
    //자바에서 함수 오버라이딩이 되는 기준은 함수이름, 매개변수
    //따라서 public, static, void는 포함하지 않음
    //함수이름 + 매개변수 타입(순서 포함)

    //array를 인자로 받는 경우

    public int method1(int[] numbers){
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }

        for(int num : numbers){
            sum += num;
        }
        return sum;
    }

    //가변인자 제공된 method 형태
    //정수형 데이터 0~여럿 가능
    //가변인자를 설정한 것이지만 배열을 넘겨줘 배열처럼 쓸 수 있는 것
    //printf가 가변인자를 활용하는 예
    //object - 모든 객체의 최상위에 있는 객체
    //format가 여럿 있을 수 있음 -> 사용할 때까지 예측 못함
    public int method2(int... numbers){
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }

        return sum;
    }
}
