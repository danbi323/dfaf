package com.ohgiraffers;

import java.util.Scanner;

public class test1 {

    public static void main(String[] args) {
//        double pie = 3.14;
//        System.out.println("입력 : ");
//        Scanner sc = new Scanner(System.in);
//        int r = sc.nextInt();
//
//        int a = (int) pie * r * r;
//        System.out.println(a);
//
//        System.out.println("입력 : ");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        if (a %2 == 0){
//            System.out.println("짝수입니다");
//        } else if (a %2 != 0) {
//            System.out.println("홀수입니다");
//        }



//        for (int i = 1; i <= 10; i++) {
//            if (i%2 != 0){
//                System.out.print(i + " ");
//            }
//        }
//
//        System.out.print("정수 두개 입력 : ");
//        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();
//        int i2 = sc.nextInt();
//
//        int sum = i + i2;
//        int minus = i - i2;
//        int multi = i * i2;
//        double divi = (double) i / i2;
//
//        System.out.println(sum);
//        System.out.println(minus);
//        System.out.println(multi);
//        System.out.println(divi);
//
//        int a = 1;
//
//        while (a <= 10){
//
//            if (a %2 == 0){
//                System.out.println(a);
//            }
//
//            a++;
//        }
//



//test1.a();
//test1.a2();
test1.a3();


    }

    public static void a(){

        System.out.println("1~10 숫자 입력 : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        switch (num){
            case 1 :
                System.out.println("월요일");
                break;
            case  2 :
                System.out.println("화요일");
                break;
            case 3 :
                System.out.println("수요일");
                break;
            case 4 :
                System.out.println("목요일");
                break;
            case 5  :
                System.out.println("금요일");
                break;
            case 6 :
                System.out.println("터욜");
                break;
            case 7 :
                System.out.println("일욜");
                break;
        }


    }

    public static void a2(){

        System.out.println("입력 : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int i = 1;
        int fac = 1;
        while (i <= num){


            fac *= i;
            i++;

        }
        System.out.println(fac);

    }

    public static void a3(){
        System.out.println("입력 : ");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        char grade;
        switch (score / 10){
            case 9 :
                System.out.println("A");
                break;
            case 8 :
                System.out.println("B");

                break;
            case 7 :
                System.out.println("C");

                break;

        }



    }



}
