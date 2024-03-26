package com.ohgiraffers.section01.literal;

public class Application2 {

    public static void main(String[] args){
        /* 수업목표. 값 직접 연산하여 출력하기 */
        // 값의 형태에 따라 사용할 수 있는 연산자의 종류와 연산의 결과가 달라짐

       // 1. 숫자와 숫자의 연산
       // 1-1 정수와 정수의 연산
       // 수학적으로 사용하는 사칙연산에 추가로 나머지를 구하는 연산
        System.out.println("=========정수와 정수의 연산=========");
        System.out.println(123 + 456); // 579
        System.out.println(123 - 23); // 100
        System.out.println(123 * 10); // 1230
        System.out.println(123 / 10); // 12
        System.out.println(123 % 10); // 3 나머지 구하기
        System.out.println(3 / 2);
        System.out.println(3 % 2);

        // 1-3 실수와 실수의 연산
        // 실수끼리의 연산도 수학에서 사용하는 사직연산에 나머지를 구하는 연산을 사용
        System.out.println("=========실수와 실수의 연산=========");
        System.out.println(1.23 + 1.23); // 2.46
        System.out.println(1.23 - 0.23); // 1.0
        System.out.println(1.23 * 10.0); // 12.3
        System.out.println(1.23 / 10.0); // 0.123
        System.out.println(1.23 % 1.0); // 0.22999999999999998 약간의 오차

        // 1-3 정수와 실수의 연산
        // 정수와 실수의 연산도 수학에서 사용하는 사칙연산에 나머지를 구하는 연산을 사용
        // 정수와 실수의 연산엔 항상 실수만 나옴
        System.out.println("=========정수와 실수의 연산=========");
        System.out.println(123 + 1.0); // 124.0
        System.out.println(123 - 1.0); // 122.0
        System.out.println(123 * 10.0); // 1230.0
        System.out.println(123 / 0.7); // 실수와 정수엔 오차 없음
        System.out.println(123 % 0.7); // 약간의 오차

        /* 2. 문자의 연산 */
        // 2-1 문자와 문자의 연산
        // 문자끼리의 연산도 사칙연산에 나머지를 구하는 연산
        // 지금은 계산 결과가 왜 이렇게 나왔는지보다 연산이 가능한거에 집중
        System.out.println("=========문자와 문자의 연산=========");
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');

        // 2-2 문자와 정수의 연산
        // 문자에 정수를 연산하는 것도 가능

        /*
           이쯤되면 'a'는 97과 같다라는것을 알 수 있다
           컴퓨터는 문자를 인식하지 못하고 숫자로만 인식할 수 있기때문에 문자에 대응되는 숫자들이 매칭되어있음
           아스키코드와 유니코드
         */

        System.out.println("=========문자와 정수의 연산=========");
        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 2);
        System.out.println('a' % 2);

        // 2-3 문자와 실수와의 연산
        // 실수도 숫자이기 때문에 정수의 연산처럼 모든 연산이 가능
        // 단, 결과는 실수형태로 나옴(아까 했던 정수와 실수 연산을 생각해보자)
        System.out.println("=========문자와 실수의 연산=========");
        System.out.println('a' + 1.0);
        System.out.println('a' - 1.0);
        System.out.println('a' * 2.0);
        System.out.println('a' / 2.0);
        System.out.println('a' % 2.0);

        /* 3. 문자열의 연산 */
        // 3-1 문자열과 문자열의 연산
        // 문자열과 문자열의 "+" 연산과는 문자열 합치기(이어붙이기)
        // 문자열은 "+" 연산 외에 다른 연산을 사용하지 못함
        System.out.println("=========문자열과 문자열의 연산=========");
        System.out.println("Hello" + "World");
//        System.out.println("Hello" - "World"); 에러남
//        System.out.println("Hello" * "World"); 에러남
//        System.out.println("Hello" / "World"); 에러남
//        System.out.println("Hello" % "World"); 에러남

        // 3-2 문자열과 다른 형태의 값 연산
        // 문자열과 다른형태 연산도 '+' 연산만 가능하다
        // 연산 결과는 다른형태의 값들도 문자열로 취급해서 문자열 합치기 결과가 나옴
        System.out.println("=========문자열과 다른형태의 값 연산=========");
        // 3-2-1 문자열과 정수의 연산
        System.out.println("HelloWorld" + 123); // HelloWorld123
        // 3-2-2 문자열과 실수의 연산
        System.out.println("HelloWorld" + 1.23); // HelloWorld1.23
        // 3-2-3 문자열과 문자의 연산
        System.out.println("HelloWorld" + 'a'); // HelloWorlda
        // 3-2-4 문자열과 논리값의 연산
        System.out.println("HelloWorld" + true); // HelloWorldtrue

        // 주의사항. 숫자로 된 문자열의 형태의 값은 '+' 연산의 결과가 문자열 합치기 결과가 되는것을 주의하자
        System.out.println("=========문자형태의 숫자값 '+' 연산=========");
        System.out.println("123" + "456");

        /* 4. 논리값 연산 */
        // 논리값과 논리값 연산
        // 논리값끼리 연산은 모두 안됨
//        System.out.println(true + false); 오류남
//        System.out.println(true - false); 오류남
//        System.out.println(true * false); 오류남
//        System.out.println(true / false); 오류남
//        System.out.println(true % false); 오류남

        // 4-2 논리값과 정수(int)의 연산
        // 논리값과 정수의 연산은 모든 연산자 불가능
//        System.out.println(true + 1); 오류남
//        System.out.println(true - 1); 오류남
//        System.out.println(true * 1); 오류남
//        System.out.println(true / 1); 오류남
//        System.out.println(true % 1); 오류남

        // 4-3 논리값과 실수(double)의 연산
//        System.out.println(true + 0.1); 오류남
//        System.out.println(true - 0.1); 오류남
//        System.out.println(true * 0.1); 오류남
//        System.out.println(true / 0.1); 오류남
//        System.out.println(true % 0.1); 오류남

        // 4-4 논리값과 문자의 연산
        // 논리값과 문자의 연산은 모든 연산자 불가능
        // 문자는 내부적으로 숫자로 취급되니까
//        System.out.println(true + 'a');
//        System.out.println(true - 'a');
//        System.out.println(true * 'a');
//        System.out.println(true / 'a');
//        System.out.println(true % 'a'); // 오류남

        // 4-5 논리값과 문자열의 연산
        // '+' 만 되고 나머지 연산자는 안됨
        System.out.println("=========논리와 문자열의 연산=========");
        System.out.println(true + "에베베");
//        System.out.println(true - "에베베");
//        System.out.println(true * "에베베");
//        System.out.println(true / "에베베"); //오류남


    }
}
