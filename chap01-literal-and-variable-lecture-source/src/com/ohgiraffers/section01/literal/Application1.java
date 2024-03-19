package com.ohgiraffers.section01.literal;

public class Application1 {

    public static void main(String[] args){

        /* 수업목표. 여러 가지의 값의 형태를 출력할 수 있다. */

        // 1. 숫자 형태의 값
        // 1-1. 정수 형태의 값
        System.out.println(123);

        // 1-2. 실수 형태의 값
        System.out.println(1.123);

        // 2. 문자 형태의 값 출력
        System.out.println('a'); // 문자 형태의 값은 '' 홀따움표(single-quotation)
//        System.out.println('ab'); 두개 이상은 문자로 취급 x 에러
//        System.out.println(''); 아무 문자도 없어서 에러
        System.out.println('1'); // 숫자지만 홀따옴표하면 문자'1'로 판단
        System.out.println('멤');
        System.out.println('ㅁ');


        // 3. 문자열 형태의 값 출력
        System.out.println("안녕하세요"); // 문자열은 문자 여러개 "" 쌍따움표(double-quotation)
        System.out.println("123"); // 정수이지만 쌍따옴표니까 문자열로 판단
        System.out.println(" "); // 빈쌍따움표로 문자열로 취급
        System.out.println("a"); // 한개의 문자도 쌍따옴표로 하면 문자열

        // 4. 논리 형태의 값 출력
        // 참이냐 거짓이냐
        System.out.println(true); // 뱀은 파충류인가요? 참
        System.out.println(false); // 뱀은 식물인가요? 거짓





    }
}
