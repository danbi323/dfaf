package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class C_doWhile {

    public void test(){
        // do-while문 단독 사용에 대한 흐름을 이해
        /*
        do-while문 표현식
        초기식;
            do{
                1회차에는 무조건 실행하고 이후에는 조건식을 확인하여 조건을 만족하는경ㅇ  실행
                증감식;
             } while(조건식);
         */

        do{

            System.out.println("최초 한번 동작////");
        }while (false);
        System.out.println("반복문 종료 확인...");
    }

    public void testDoWhileExample(){

        /*
        do-while문의 흐름을 이해하고 적용
        키보드로 문자열 입력을 받아 반복적으로 출력
        단 exit가 입력되면 반복문 종료
         */
        Scanner sc = new Scanner(System.in);
        String str = "";

        do {

            System.out.println("문자열을 입력하세요 : ");
            str = sc.nextLine();
            System.out.println(str);


            // equals : 문자열이 같은지 비교
        }while (!str.equals("exit"));

        System.out.println("프로그램을 종료합니다");
    }
}
