package com.ohgiraffers.section03.constant;

public class Application2 {

    public static void main(String[] args) {

        // 수업목표. 상수의 명명규칙에 대해 이해
        /*
        상수의 명명 규칙은 변수의 명명규칙과 컴파일에러를 발생시키는 규칙은 동일
        단, 개발자까지 암묵적 규칙
        1. 모든 문자는 영문자 대문자 혹은 숫자만 사용
        2. 단어와 단어의 연결 사이에는 언더스코어(_)를 사용
         */

        // 1. 모든 문자는 영문자 대문자 혹은 숫자만 사용
        final  int AGE1 = 20;
        final  int AGE2 = 30;
        final  int age3 = 40;   // 소문자 가능하긴함

        // 2. 단어와 단어의 연결은 언더스코어(_) 사용
        final int MAX_AGE = 60;
        final int MIN_AGE = 20;
        final int minAge = 30;  // camel case의 사용 가능하지만 변수와 구분 힘듦




    }
}
