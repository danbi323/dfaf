package com.ohgiraffers.section02.String;

import java.util.StringTokenizer;

public class Application3 {
    public static void main(String[] args) {

    /*
    문자열 분리
    문자열을 구분자로 하여 분리한 문자열을 반환하는 기능
    split() : 정규표현식을 이용해 문자열을 분리
            비정형화된 문자열을 분리할때 좋지만(공백퐇함)
            정규표현식을 이용하기 떄문에 속도가 느리다는 단점
            정규표현식은 자바스크립트에서 다룰 예정
    StringTokenizer : 문자열의 모든 문자들을 구분자로 하여 문자열 분리
                    정형화된 문자열 패턴을 분리할때 사용하기 좋은(공백 문자열 무시)
                    split()보다 속도면에서 더 빠름
                    구분자를 생략하는 경우 공백이 구분자이다.
     */
        /*
         *  split 시 이스케이프 문자를 사용해야 하는 특수문자도 존재한다.
         *  이스케이프 문자 사용 안하는 특수문자
         *  ~ ` ! @ # % & - _ = ; : ' \ " ,  < > /
         *  이스케이프 문자를 사용하는 특수문자(\\)
         *  $ ^ * ( ) + | { } [ ] . ?
         *
         *
         *  (앞에 \\ 붙여야 한다.
         *  정규표현식에서 사용되는 특수문자인 경우 \$가 정규표현식 문자와 겹치게 된다.
         *  따라서 $를 기준으로 split 을 하기 위해서는 정규표현식 문자가 아닌 $라는 구분자로 split 하겠다는 의미로 사용되려면
         *  구분문자를 \$로 표현해야 한다.
         *  하지만, 역슬래쉬가 위에서 배운 이스케이프 문자의 역슬래쉬와 곂친다.
         *  따라서 \\$로 해야 역슬래쉬 + $ 로 인식해서 정규표현식을 탈출하는 탈출문자가 된다.)
         * */

        String emp1 = "100/홍길동/서울/영업부"; // 모든 값 존재
        String emp2= "200/유관순//영업부";      // 주소 없음
        String emp3 = "300/이순신/경기도/";      // 부서 없음

        String[] empArray1 = emp1.split("/");
        String[] empArray2 = emp2.split("/");
        String[] empArray3 = emp3.split("/");

        for (int i = 0; i < empArray1.length; i++) {
            System.out.println("empArray1[" + i + "] : " + empArray1[i]);
        }
        for (int i = 0; i < empArray2.length; i++) {
            System.out.println("empArray2[" + i + "] : " + empArray2[i]);
        }
        for (int i = 0; i < empArray3.length; i++) {
            System.out.println("empArray3[" + i + "] : " + empArray3[i]);
        }


        String[] empArray4 = emp3.split("/", -1);

        for (int i = 0; i < empArray4.length; i++) {
            System.out.println("empArray4[" + i + "] : " + empArray4[i]);
        }

        StringTokenizer st1 = new StringTokenizer(emp1, "/");
        StringTokenizer st2 = new StringTokenizer(emp2, "/");
        StringTokenizer st3 = new StringTokenizer(emp3, "/");

        while (st1.hasMoreTokens()){
            System.out.println("st1 : " + st1.nextToken());
        }

        while (st2.hasMoreTokens()){
            System.out.println("st2 : " + st2.nextToken());
        }

        while (st3.hasMoreTokens()){
            System.out.println("st3 : " + st3.nextToken());
        }

        String colorStr = "red*orange#blue/yellow green";

//        String[] color = colorStr.split("*#/ ");

        String[] color = colorStr.split("[*#/ ]");

        for (int i = 0; i < color.length; i++) {
            System.out.println("color[" + i + "]" + color[i]);
        }

        StringTokenizer colorTokenizer = new StringTokenizer(colorStr, "*#/ ");

        while (colorTokenizer.hasMoreTokens()){
            System.out.println(colorTokenizer.nextToken());
        }

    }
}
