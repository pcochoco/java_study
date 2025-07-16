package com.pcochoco.java_study.c_class;

//접근 제어자 생략 시 default가 됨
//default라고 써주지 않음
//동일 패키지 이내 사용 가능
class Phone {
    //field 정의
    private String name;

    private String color;

    private String brand;

    //생성자 정의

    //인자 없는 기본 생성자
    public Phone(){
    }

    //메서드 정의
    //private field들에 대한 getter, setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
