package com.ohgiraffers.section05.typecasting;

public class Application3 {

    public static void main(String[] args) {

        // 수업목표. 자동형변환과 강제형변환 이용하여 서로 다른 자료형끼리 연산 수행
        /*
        자동 형변환과 강제 형변환을 이용하여 서로 다른 자료형끼리 연산을 수행할 수 있다.
        다른 자료형끼리 연산은 큰 자료형으로 자동변환후 연산처리
         */

        int inum = 10;
        long lnum = 100;

        // 목차 두 수의 연산 결과를 int 형으로 변환후 int 자료형 변수에 리턴받는다
//        int isum = inum + lnum;
        int isum = (int) (inum + lnum);

        // 목차2. long형 값을 int로 강제 형변환
        int isum2 = inum + (int) lnum;

        // 목차3. 결과값을 long으로 받는다.(자동형변환)
        long result = inum + lnum;

        System.out.println(result);

        // 주의사항 int미만의 연산 처리의 결과는 int형이다.
        byte bnum1 = 1;
        byte bnum2 = 2;
        short snum1 = 3;
        short snum2 = 4;

//        short snum = bnum1 + snum1;   에러발생
//        byte b = bnum1 + bnum2;
        int result1 = bnum1 + bnum2;
        int resilt2 = bnum1 + snum1;
        int resilt3 = snum1 + snum2;

    }
}
