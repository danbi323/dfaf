package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section01.method.Calculator;

import static com.ohgiraffers.section01.method.Calculator.maxNumberOf;

public class Application2 {

    public static void main(String[] args) {
        // 임포트에 대해 이해
        /*
        임포트란?
        서로 다른 패키지에 존재하는 클래스를 사용하는 경우 패키지명을 포함한 풀 클래스 이름을 사용해야됨
        하지만 매번 다른 클래스의 패키지명까지 기술하기에는 번거로움
        그래서 패키지명을 생략하고 사용할수있도록 한 구문이 import문임
        import는 package 선언문과 class선언문 사이에 작성하며
        어떠한 패키지 내에 클래스를 사용할것인지 선언하는 효과를 가짐
       */

        Calculator cal = new Calculator();


        // 1. non-static의 경우
        int min = cal.minNumberOf(10, 50);
        System.out.println("10과 50의 최소값 : " + min);

        // 2. static의 경우
        int max = maxNumberOf(10, 50);
        System.out.println("10과 50의 최대값 : " +  max);

        // 3. static 메소드 수동추가

        int max2 = maxNumberOf(100,200);
        System.out.println("100과 200중에 더 큰 값은? " + max2);


    }
}
