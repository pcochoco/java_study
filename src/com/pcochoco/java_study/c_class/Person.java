package com.pcochoco.java_study.c_class;
//class = 사용자 정의형 자료형

public class Person {
    //Class에서 사용 가능한 접근 제어자
    //public  - 모든 곳에서 사용
    //default - 동일한 패키지에서 아무런 제약 없이 사용 가능

    //멤버 = 속성, 생성자, 메서드
    //캡슐화 - 속성, 메서드를 안에 넣음 -> 메서드를 통한 간접 접근만 가능하도록

    //1. field(속성) = 멤버 변수 정의
    //추상화 - 필요한 속성만 추출해 만들어냄
    private String name; //변수가 아닌 필드로 표현(혹은 멤버 변수, 객체 변수)
    private int age;


    //2. 생성자 정의 - 클래스의 이름과 동일
    //반환타입을 적을 필요가 없음
    //Person person = new Person(); 에서의 생성자가 됨

    public Person(){
        this("Name", 10);
    }

    public Person(String name){
    }

    public Person(String name, int age){
        this("User");
        //class 내에서 문자열 매개변수 3개를 가지는 생성자를 호출함
        //생성자 첫번째에 써줘야함
        //this를 메서드 내부에서 생성자로 호출하는 것은 불가능함


        this.name = name;
        this.age = age;
    }

    //3. 메서드(기능) 정의
    //field를 직접 변경하지 못하고 메서드를 통해 제한적 허용
    //alt Fn insert key를 통해 getter, setter 생성 가능

    //Getter - 가공해 외부로 전달
    //this = 객체 자기 자신
    //boolean return 시 isName() 으로 반환하는 것이 관례
    public String getName() {
        return name;
    }

    //Setter - 검증된 값만 데이터로 저장
    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    //동일 패키지 안이므로 import 없이 바로 생성 가능
    //다른 객체를 참조할 수 있는 클래스 
    private Phone phone = new Phone();

    public void setPhone(String name, String brand, String color){
        //직접 Phone을 객체화해 받지는 못함 private이므로
        //인자를 만들어 넣음

        phone.setName(name);
        phone.setBrand(brand);
        phone.setColor(color);

        //this.name = name;
        //을 하게 되면 Person의 값에 대한 조작이 됨


    }


}
