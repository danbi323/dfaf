package com.ohgiraffers.section02.variable;

public class Application2 {

    public static void main(String[] args) {

        /* 변수를 선언하고 값을 할당하여 사용*/
        /* 변수를 사용하는 방법
           1. 변수를 준비한다(선언)
           3. 변수의 값을 대입( 값 대입 및 초기화)
           3. 변수를 사용한다.
         */

        /* 자료형이란?
            다양한 값의 형태별로 어느 정도의 크기를 하나의 값으로 취갑할건지 미리 Compiler와 익숙한 키워드이다
        예) 앞에서 사용한 int 자료형은 정수를 4byte만큼 읽어서 하나의 값으로 취급
            이러한 자료형은 기본자료형(Primary type) 과 참조형(Reference type)로 나눠짐
            그 중 기본자료형 8가지부터 살펴보기
         */

        // 목차 1-1-1 숫자를 취급하는 자료형
        // 정수를 취급하는 자료형에는 4가지가 있다

        byte bnum;      // 1byte
        short snum;     // 2byte
        int inum;       // 4byte
        long lnum;      // 8byte

        // 실수를 취급하는 자료형은 2가지가 있다.
        float fnum;
        double dnum;

        // 목차 1-1-2 문자를 취급하는 자료형
        // 문자를 취급하는 자료형은 한가지
        char ch;        // 2byte
        char ch2;

        // 목차 1-1-3 논리값을 취급하는 자료형
        // 논리값을 취급하는 자료형은 한가지
        boolean isTrue;     // 1byte

        // 이상 8가지를 기본자료형이라고 한다.

        // 1-1-4 문자열을 취급하는 자료형
        String str;     // 4byte

        // 2. 변수에 값을 대입한다. (값 대입 및 초기화)

        // 목차 2-1. 정수를 취급하는 자료형에 값 대입
        bnum = 1; // -128~ +127
        snum = 2; // -32768 ~ +32767
        inum = 3; // -2147483648 ~ +2147483647
        lnum = 8L; // 아무 문제 없을것 같지만 뒤에 대문자 L을 붙여야됨. 형변환에서 알려줌

        // 2-2. 실수를 취급하는 자료형 값 대입
        fnum = 7.0f; // 뒤에 F를 붙여야됨
        dnum = 8.0;

        // 2-3 문자를 취급하는 자료형 값 대입
        ch = 'a'; // 문자 형태의 값을 저장
        ch2 =  97; // 'a' 는 '97' 이라는 숫자. 그래서 숫자로도 저장 가능

        // 2-4 논리를 취급하는 자료형에 값 대입
        isTrue = true;
        isTrue = false;

        // 2-5 문자열 취급하는 자료형에 값 대입
        str = "우에에 에엥";

        /* 일반적으로 사용하는 독특한 형태가 아닌 일반적인 형태로 사용할 수 있는 자료형을 대표자료형이라고함
           정수는 int 실수는 double이 대표 자료형
        */

        // 3.변수를 사용한다.
        // 변수에 저장한 값을 출력
        System.out.println("===========변수에 저장한 값 출력============");
        System.out.println("bnum의 값 출력 : " + bnum);
        System.out.println("snum의 값 출력 : " + snum);
        System.out.println("inum의 값 출력 : " + inum);
        System.out.println("lnum의 값 출력 : " + lnum);

        System.out.println("fnum의 값 출력 : " + fnum);
        System.out.println("dnum의 값 출력 : " + dnum);

        System.out.println("ch의 값 출력 : " + ch);
        System.out.println("ch2의 값 출력 : " + ch2);

        System.out.println("isTrue의 값 출력 : " + isTrue);

        System.out.println("str의 값 출력 : " + str);


    }
}
