package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class B_ifElse {

    public void simpleIfElseStatement(){
        // if-else문 단독 사용에 대한 흐름 이해
        /*
        [if-else표현식]
        if(조건식){
                조건식이 true면 실행할 명령문;
          } else {
                조건식이 false일때 실행할 명령문;
          }
         */

        /* if문은 조건식의 결과가 참이면 if{}안에 있는 코드를 실행
           조건식의 결과가 거짓이면 else{}안에있는 코드 실행
        * */

        /*
        정수 한개를 입력받아 그 수가 홀수면 "홀수입니다" 출력하고
        홀수가 아니면 "짝수입니다" 출력
        단, 조건과 상관없이 프로그램이 종료할때 "프로그램 종료합니다" 라고 출력
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력하쇼 : ");
        int num = sc.nextInt();

        if(num%2 != 0){
            // 참일때 출력
            System.out.println("홀수입니다");
        } else {
            // 거짓일때 출력
            System.out.println("짝수입니다");
        }
        // 프로그램 종료시 출력할 내용
        System.out.println("프로그램 종료");

    }

    public void testNeatedIfElseStatment() {
        /*
        중첩된 if-else 문의 흐름을 이해하고 적용

        숫자 하나를 입력받아 양수이면 "양수입니다" 출력하고
        음수면 "음수입니다" 출력
        단, 0이면 "0 입니다" 라고 출력
        조건과 상관없이 프로그램이 종료될때는 "종료됩니다" 출력
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("정수 하나 입력 : ");
        int num = sc.nextInt();

        if(num != 0){
            if (num > 0){
                System.out.println("양수임");
            } else {
                System.out.println("음수임");
            }

        }else {
            System.out.println("0입니다");
        }
        System.out.println("프로그램 종료");

    }
}
