package com.ohgiraffers.section03.matn;

import java.util.Random;

public class Application3 {

    public static void main(String[] args) {
        /*
        java.util.Random 클래스를 활용해 사용자 범위 내 난수 발생
        java.util.Random 클래스 nextInt()메소드를 이용한 난수 발생
        nextInt(int bound) : 0부터 매개변수로 전달받은 정수범위까지의 난수 발생시켜 정수로 반환
         */

        // random.nextInt(구하려는 난수의 갯수) + 구하려는 난수의 최솟값

        Random random = new Random();

        // 1. 0부터 9까지 난수발생
        int randomNum = random.nextInt(10);

        System.out.println("0부터 9까지의 난수? : " + randomNum);

        // 2. 1부터 10까지 난수발생
        int randomNum1 = random.nextInt(10) + 1;
        System.out.println("1부터 10까지의 난수? : " + randomNum1);

        // 3. 20부터 45까지 난수발생
        int randomNum2 = random.nextInt(26) + 20;
        System.out.println("20부터 45까지 난수? : " + randomNum2);

        // 4. -128~127까지의 난수발생
//        int randomNum3 = random.nextInt(256) - 128;
        int randomNum4 = new Random().nextInt(256) - 128;
        System.out.println("-128~127 : " + randomNum4);
    }
}
