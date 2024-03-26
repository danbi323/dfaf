package com.ohgiraffers.section03.matn;

public class Application1 {

    public static void main(String[] args) {

        // Math 클래스에서 제공하는 static 메소드 호출
        /*
        API란?
        Application programing Interface는 응용프로그램에서 사용할 수 있도록
        운영체제나 프로그래밍 언어가 제공하는 기능을 제어할수있도록 만든 인터페이스
        쉽게 말해 우리가 구현할수없거나 구현하기 번거로운 기능들을 JDK를 설치하면 사용할수있게
        제공해놓은 소스코드(클래스나 인터페이스)등을 의미함
        더 쉽게 말해 누가 작성해논 소스 코드이니 가져다 쓰는 방법을 본다는 말
        모든 코드를 우리가 다 외울수없으니 API문서를 별도로 제공해주고있음
         */

        /*
        java.long.Math
        Math 클래스는 수학에서 자주 사용하는 상수들과 합수들을 미리 구현해놓은 클래스
        모든 메소드는 static 메소드로 작성되어있음
        (객체의 상태를 관리하지않고 기능만을 제공하는 경우 메모리를 효율적으로 사용하기 위해 자주 사용되는 기법임
         */

        /*
        1. 절대값 출력
        1-1. 클래스의 풀네임을 다 적은 경우
         */
        System.out.println("-7의 절대값 : " + (java.lang.Math.abs(-7)));

        // 1-2. import를 해서 사용
        System.out.println("1.25의 절대값 : " + (Math.abs(1.25)));

        // 2. 최대값,최대값 구하기
        System.out.println("10, 20중 더 작은 것은? " + Math.min(10,20));
        System.out.println("20, 30중 더 큰것은? " + Math.max(20,30));

        System.out.println("원주율 : " + Math.PI);

        // 3. 난수 출력
        System.out.println("난수 발생 " + Math.random());
        // 난수 발생 랜덤 0.6057384231922642
    }
}
