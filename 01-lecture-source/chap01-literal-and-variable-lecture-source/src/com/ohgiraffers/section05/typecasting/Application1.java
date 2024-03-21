package com.ohgiraffers.section05.typecasting;

public class Application1 {

    // 자동형변환 규칙에 대해 이해

    /*
    데이터의 형변환이 필요한 이유
    - 자바에서 다른타입끼리의 연산은 피연산자들이 모두 같은 타입인 경우 실행가능
    - 즉, 같은 데이터 타입끼리만 연산 수행 가능
     */
    /*
    형변환의 종류와 규칙
    1. 자동형변환(묵시적 형변환) : 컴파일러가 자동으로 수행해주는 타입 변환
        1-1. 작은 자료형에서 큰 자료형으로 자동 형변환
        1-2. 정수는 실수로 자동 형변환이 됨
        1-3. 문자형은 int형으로 자동형변환
        1-4. 논리형은 형변환 규칙에서 제외
    2. 강제형변환(명시적 형변환) : 형변환(cast) 연산자를 이용한 강제적으로 수행하는 형변환
        2-1. 자동형변환이 적용되지 않는 경우 강제 형변환이 필요하다.

     */

    // 자동형변환 규칙테스트
    // 1-1. 작은 자료형에서 큰 자료형으로 자동형변환
    // 작은 자료형에서 큰 자료형으로 공간만 옮기는경우 자동처리

    public static void main(String[] args) {

        byte bnum = 1;
        short snum = bnum;
        int inum = snum;
        long lnum = inum;

        int num1 = 10;
        long num2 = 20;

//        int result = num1 + num2; long타입으로 변경후에 계산하기때문에 int형 변수에 값 담을수 x

        long result1 = num1 + num2;
        System.out.println("result1 : " + result1);    // int + long은 다른 자료형이라 int > long으로 자동 변환

        // 1-1-2 실수끼리의 자동 형변환
        float fnum = 3.0f;
        double dnum = fnum;

        double result2 = fnum + dnum;
        System.out.println("result2 : " + result2);

        // 1-2 정수는 실수로 자동 형변환
        // 정수를 실수로 변경할때 소수점자리가 없어도 실수형태로 표현 가능

        // 1-3 문자형은 int로 자동 형변환
        char ch1 = 'a';
        int num11 = ch1;

        System.out.println(num11); // 97

        // 1-4 논리형은 어떤자료형이든 형변환 x
        boolean isTrue = true;
//        byte b = isTrue;  오류




    }
}
