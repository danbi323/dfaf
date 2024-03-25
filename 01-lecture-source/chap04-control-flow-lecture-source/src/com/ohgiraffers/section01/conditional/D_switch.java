package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {



    public void test(){

        /*
    switch문 단독 사용
    switch(비교할변수) {
    case 비교값1 : 비교값1과 일치할 경우 실행할 구문; break;
    case 비교값2 : 비교값2과 일치할 경우 실행할 구문; break;
    default : case에 모두 해당하지 않을 경우 실행할 구문; break;
     */

    /*
    여러개의 비교값 중 일치하는 조건에 해당하는 로직 실행하는것은 else if와 유사
    따라서 일부 호환이 가능
    하지만 switch문으로 비교 가능한 값은 정수, 문자, 문자열 형태의 값
    실수와 논리는 비교할 수 없음
    또한 정확하게 일치하는 경우만 비교할 수 있으며 대소 비교를 할 수 없다는 것이 차이점임
    case절에는 변수를 사용하지 못함
    또란, 문자열 비교는 jdk1.7 이상부터 가능
     */

    /*
    정수 두개와 연신 기호 문자를 입력 받아서 두숫자의 연산 결과를 출력해보는 간단한 계산기 만들기
     */

        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 정수 입력 : ");
        int fnum = sc.nextInt();
        System.out.println("두 번째 정수 입력");
        int snum = sc.nextInt();
        System.out.println("연산 기호 입력 (+, -, /, %) : ");
        char op = sc.nextLine().charAt(0);
    }
}
