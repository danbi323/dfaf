package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class dong {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("입력하세요 : ");

        int num = in.nextInt();

        System.out.println("뇨뇨뇨 " + num);

        in.nextLine();
        System.out.println("입력 ");
        char ch = in.nextLine().charAt(5);
        System.out.println(ch);

    }




}
