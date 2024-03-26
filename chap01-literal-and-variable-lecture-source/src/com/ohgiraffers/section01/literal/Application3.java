package com.ohgiraffers.section01.literal;

public class Application3 {

    public static void main(String[] args){

        /* 수업 목표 문자열 합치기 결과를 예측하고 사용*/
        // 목차 1. 두 개의 문자열 합치기
        System.out.println("========두 개의 문자열 합치기=========");
        System.out.println(9 + 9); // 18
        System.out.println("9" + "9"); // 99
        System.out.println("9" + 9); // 99
        System.out.println(9 + "9"); // 99

        // 목차 2. 세 개의 문자열 합치기
        System.out.println("========세 개의 문자열 합치기=========");
        System.out.println("9" + 9 + 9); // 999
        System.out.println(9 + "9" + 9); // 999 // 왼쪽의 연산부터 수행하고 수행결과를 오른쪽과 연산함
        System.out.println(9 + 9 + "9"); // 189 // 연산방향은 왼쪽에서 오른쪽 (숫자부터 합침)

        System.out.println("9" + (9 + 9)); // 918 괄호사용

        // 목차 3. 문자열 합치기 응용
        // 10과 20의 사칙연산 결과 출력
        System.out.println("========10과 20의 사칙연산 결과=========");
        System.out.println(10 + 20);
        System.out.println(10 - 20);
        System.out.println(10 * 20);
        System.out.println(10 / 20);
        System.out.println(10 % 20);

        System.out.println("========10과 20의 사칙연산 결과 보기좋게 출력=========");
        System.out.println("10과 20의  : " + (10 + 20));
        System.out.println("10과 20의 : 차 " + (10 - 20));
        System.out.println("10과 20의 : 곱 " + (10 * 20));
        System.out.println("10과 20의 : 몫 " + (10 / 20));
        System.out.println("10과 20의 : 나머지 " + (10 % 20)); // 숫자 괄호사용


        System.out.println("기차");
        System.out.println("기차" + "칙칙폭폭");
        System.out.println("기차" + 123 + 45 + "칙칙폭폭"); // 기차12345칙칙폭폭
        System.out.println(123 + 45 + "기차" + "출발"); // 168기차출발



    }
}
