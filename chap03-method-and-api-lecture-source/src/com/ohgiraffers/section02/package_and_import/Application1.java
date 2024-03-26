package com.ohgiraffers.section02.package_and_import;

public class Application1 {

    public static void main(String[] args) {

        // 패키지에 대해 이해
        /*
        패키지란?
        서로 관련된 클래스 또는 인터페이스 등을 모아 하나의 묶음(그룹)으로 단위를 구성
        같은 패키지 내에서는 동일한 이름의 클래스를 만들수 없지만 패키지가 다르면 동일한 이름 가능
        클래스명은 원래 패키지명을 포함 되어있기때문. 예:com.ohgiraffers.section02.packge_and_import;
        지금까지 클래스명에 패키지명을 함께 사용하지 않은 이유는 동일한 패키지 내에서 사용했기때문
        그렇기 때문에 서로 다른 패키지에 클래스를 사용하는 경우는 클래스명앞에 패키지명을 명시해서 풀 클래스 이름으로 해야됨
         */

        // 1. non-static 메소드의 경우
        com.ohgiraffers.section01.method.Calculator cal = new com.ohgiraffers.section01.method.Calculator();

        int min = cal.minNumberOf(30, 20);

        System.out.println("30과 20중에 더 작은 값은? " + min);

        // 2. static 메소드의 경우

        int max =  com.ohgiraffers.section01.method.Calculator.maxNumberOf(30,20);
        System.out.println("30과 20중에 더 큰 값은? " + max);

    }
}
