package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {


    public void test(){

        // if 단독 사용에 대한 흐름을 이해하고 적용할 수 있다.
    /*
    [if문 표현식]
    if(조건식) {
            조건식이 true일때 실행할 명령문;
    }
     */

    /*
    조건식 : true or false가 나오는 연산식을 조건식이라고 함
    if문은 조건식 결과 값이 true이면 {}안에 코드 실행
    조건식의 결과 값이 거짓(false) 이면 {}안에 코드를 무시하고 넘어감
     */

    /*
    정수 한개를 입력받아 그 수가 짝수이면 입력한 숫자는 짝수입니다 라고 출력하고
    짝수가 아니면 출력하지 않는 구문
    단 조건과 관련없이 프로그램이 종료될때 프로그램을 종료합니다 라고 출력되도록하자
     */
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 한개를 입력하세요 : ");
        int num = sc.nextInt();
        if (num%2 == 0){
            System.out.println("입력한 숫자는 짝수입니다"); // true면 이게 출력
        }

        System.out.println("프로그램이 종료합니다.");


    }

    public  void testNestedIfStatment(){

        // 중첩된 if문의 흐름을 이해하고 적용할수 있다.
        /*
        정수 한개를 입력받아 그 수가 양수인 경우만 짝수인지 확인
        짝수이면 "짝수입니다" 출력하고
        해당하지 않으면 아무 내용도 출력하지 않는 구문 작성
        단, 조건과 상관없이 프로그램이 종료될때 "종료합니다" 라고 출력되도록
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요 : ");
        int num = sc.nextInt();

        if(num > 0){

            if(num%2 == 0){
                System.out.println("입력하신 숫자는 양수이면서 짝수입니다");

            }
        }

        System.out.println("프로그램을 종료합니다");
    }
}
