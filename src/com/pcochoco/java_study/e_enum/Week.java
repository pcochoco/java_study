package com.pcochoco.java_study.e_enum;

public enum Week {
    //열거 상수에 속성 추가 가능

    MONDAY("mon", 1),
    TUESDAY("tues", 2),
    WEDNESDAY("wedn", 3),
    THURSDAY("thur", 4),
    FRIDAY("fri", 5);

    private String name;
    private int num;

    private Week(String name, int num){
        this.name = name;
        this.num = num;
    }

    public String getName(){
        return this.name;
    }

    public int getNum(){
        return this.num;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setNum(int num){
        this.num = num;
    }
    
}
