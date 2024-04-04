package com.ohgiraffers.section02.String;

public class Application4 {

    public static void main(String[] args) {
        // 이스케이프(escape) 문자
        /*
        이스케이프 문자란?
        문자열 내에서 사용하는 문자중 특수문자를 표현하거나 특수기능을 사용할때 사용하는 무낮
        이스케이프 문자 의미
                \n      개행(줄바꿈)
                \t      탭
                \'      작은따옴표
                \"      큰따옴표
                \\      역슬러시
         */



        System.out.println("안녕하세요\n 저는 홍길동입니다");

        System.out.println("안녕하세요\t 저는 홍길동입니다");

        System.out.println("안녕하세요 저는 '홍길동'입니다");
//        System.out.println(''''); // 홀따옴표 문자와 리터럴 기호가 중복
        System.out.println('\'');

//        System.out.println("안녕하세요 저는 "홍길동"입니다"); // 문자열 리터럴과 중복되어 에러
        System.out.println("안녕하세요 저는 \"홍길동\"입니다");

//        System.out.println("안녕하세요 저는 \홍길동\입니다"); 사용 못함
        System.out.println("안녕하세요 저는 \\홍길동\\입니다");
    }
}
