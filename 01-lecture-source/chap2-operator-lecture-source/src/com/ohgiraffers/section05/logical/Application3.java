package com.ohgiraffers.section05.logical;

public class Application3 {

    public static void main(String[] args) {

        /*
        수업목표. 논리연결연산자의 진리표
        AND 연산과 OR 연산의 특징
        논리식 && 논리식 : 앞에 결과가 false 뒤에 실행을 안함
        논리식 || 논리식 : 앞에 결과가 true이면 뒤를 실행 안함
         */

        // 1. 논리식 && 논리식 : 앞에 결과가 false면 뒤를 실행 안함
        /*
        조걱식 두개가 모두 만족되어야 true를 반환하지만 앞에 미리 false가 나오면
        뒤에 조건을 확인할 필요 없이 false 반환
        따라서 연산 횟수를 줄이기 위해서는 && 연산의 경우 앞에 false가 나올 가능성이 높은 조건을 작성
         */

        int num1 = 10;

        int result = (false && ++num1 > 0)? num1 : num1;

        System.out.println("&&실행 확인 : " + result);

        // 2. 논리식 || 논리식 : 앞에 결과가 true면 뒤를 실행 안함
        /* 조건식중 둘중 하나라고 true면 true 반환하기때문에 미리 true가 나오면
           뒤에 조건을 확인할 필요없이 true 반환
           따라서 연산의 횟수를 줄이기 위해서는 || 연산의 경우 true가 나올 가능성이 높은 조건을 작성
         */

        int num2 = 10;

        int result2 = (true || ++num2 > 0)? num2 : num2;

        System.out.println("||실행 확인 : " + result2);

    }
}
