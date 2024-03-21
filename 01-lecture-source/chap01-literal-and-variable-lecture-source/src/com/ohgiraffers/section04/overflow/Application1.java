package com.ohgiraffers.section04.overflow;

import java.sql.SQLOutput;

public class Application1 {

    public static void main(String[] args) {
        /*
        수업목표. 오버플로우에 대해 이해
        자료형의 값의 최대 범위를 벗어나는 경우
        발생한 carry를 버림 처리하고 sign bit를 반전시켜 최소값으로 순환시킴
         */

        // 1. 오버플로우
        byte num1 = 127;

        System.out.println("num1 : " + num1);

        num1++;

        System.out.println("num1 오버플로우 : " + num1);


        // 2. 언더플로우
        byte num2 = -128;

        System.out.println("num2 : " + num2);

        num2--;

        System.out.println("num2 언더플로우 : " + num2);

        int firstNum = 1000000;     // 100만
        int secondNum = 700000;     // 70aks

        int multi = firstNum * secondNum;       // 7천억 나와야됨

        System.out.println("firstNum + secondNum = " + multi);

        // 3. 해결방법
        // 오버플로우를 예측하고 더 큰 자료형으로 결과값 받아서 처리
        long longMulti = firstNum * secondNum;
        System.out.println("firstNum + secondNum = " + multi); // 이것도안됨

        long result = (long)firstNum * secondNum;
        System.out.println("result : " + result);




    }
}
