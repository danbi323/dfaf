package com.ohgiraffers.section01.array;

public class Application1 {

    public static void main(String[] args) {

        /*
        배열이란?
        동일한 자료형의 묶음9연속된 메모리 공간에 값을 저장하고 사용하기 위한 용도)
        배열은 heap영역에  new연산자를 이용하여할당
         */

        /*
        배열 사용 이유
        만약 배열을 사용하지 않는다면 변수를 여러개 사용해야함
        1. 연속된 메모리 공간으로 관리할수있음
        2. 반복문을 이용한 연속처리 불가능
         */

        int num = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        int num5 = 50;

        int sum = 0;
        sum += num;
        sum += num2;
        sum += num3;
        sum += num4;
        sum += num5;

        System.out.println("sum = " + sum);

        // 배열의 선언 및 할당
        int[] arr = new int[5];

        // 하나의 이름으로 관리되는 연속된 메모리 공간이고, 공간마다 찾아갈 수 있는 번호(인데스)를 이용해 접근
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // 값을 대입할때도 반복문으로 사용할수있다.
        for (int i = 0, value = 0; i < arr.length; i++) {

            arr[i] = value += 10;

        }

        // 배열의 값을 누적해서 담을 변수 선언
        int sum2 = 0;

        // 일반적인 변수처럼 사용가능

        sum2 += arr[0];
        sum2 += arr[1];
        sum2 += arr[2];
        sum2 += arr[3];
        sum2 += arr[4];
        System.out.println("sum2 = " + sum2);

        int sum3 = 0;

        for (int i=0; i<arr.length; i++){

            sum3 += arr[i];
        }


        System.out.println("sum3 = " + sum3);





    }
}
