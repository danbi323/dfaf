package com.ohgiraffers.section01.method;

public class Application4 {

    public static void main(String[] args) {

        // 여러개의 전달인자를 이용한 메소드를 호출

        // 1. 여러개의 매개변수를 가진 메소드 호출
        Application4 app4 = new Application4();

        app4.testMethod("박단비", 24, '여');
//        app4.testMethod(20, "유관순", '여'); 순서가 다르면 호출 불가능

        // 2. 변수에 저장된 값을 전달하여 호출
        String name = "부부부";
        int age = 100;
        char gender = '남';
        app4.testMethod(name, age, gender);

    }

    public void testMethod(String name, int age, final char gender){

        /*
        매개변수도 일종의 지역변수로 분류된다.
        매개변수도 final 키워드를 사용할수있음
        지역변수에서 final 키워드를 붙여 상수를 만드는것과 동일
        final의 매개변수는 상수 네이미 규칙을 선택적으로 따르는 경향이 있음
         */

        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "세 이며 성별은 " + gender + "입니다.");

    }

}
