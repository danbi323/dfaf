package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_while {
    public void testSimpleWhileStatement(){


        /* 수업목표 while문 단독 사용에 대한 흐름을 이해하고 적응할 수 있다. */
        /*
         * [while문 표현식]
         *  초기식;
         * while (조건식) {
         *       조건에 만족하는 경우 수행할 구문(반복할 구문);
         *           증감식;
         * }
         * */

        /* 1부터 10까지 1씩 증가시키면서 10만 i값을 출력하는 기본 반복문 */
        int i = 1;
        while(i<=10){

            System.out.println(i);
            i++;

        }
    }

    public void testWileExample(){

        /* 입력한 문자열의 인덱스를 활용하여 문자 하나씩 출력해보기 */
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = sc.nextLine();

        // 
    }
}