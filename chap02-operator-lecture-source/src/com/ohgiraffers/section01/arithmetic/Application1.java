package com.ohgiraffers.section01.arithmetic;

public class Application1 {

    public static void main(String[] args) {

        // 산술연산자에 대해 이해하고 활용
        // 산술연산자
        /*
        산술연산자는 주로 사칙연산과 관련된 연산자로 가장 기본적이면서 많이 사용되는 연산자이다
        연산의 실행이 가능하기 위해 필요한 값이나 변수가 두 개인 이항 연산자로 분류되며
        피연산자들의 연산 방향은 왼쪽에서 오른쪽이다.
         */

        /*
        산술연산의 종류
        + : 왼쪽의 피연산자에서 오른쪽의 피연산자를 더함
        - : 왼쪽의 피연산자에서 오른쪽의 피연산자를 뺌
        * : 왼쪽의 피연산자에서 오른쪽의 피연산자를 곱함
        / : 왼쪽의 피연산자에서 오른쪽의 피연산자를 나눔
        % : 왼쪽의 피연산자에서 오른쪽의 피연산자의 나머지 구함
         */

        /*
        산술연산자의 우선순위
        수학개념과 유사 곱하기 나누기 연산이 우선
        우선순위가 같은경우 연산자의 결합방향에의해 순서 경정
         */

        int num1 = 20;
        int num2 = 7;

        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 * num2 = " + (num1 * num2));
        System.out.println("num1 / num2 = " + (num1 / num2));
        System.out.println("num1 % num2 = " + (num1 % num2));

    }
}
