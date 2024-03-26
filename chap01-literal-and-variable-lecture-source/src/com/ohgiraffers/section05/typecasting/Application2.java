package com.ohgiraffers.section05.typecasting;

public class Application2 {

    public static void main(String[] args) {

        // 수업목표. 강제 형변환
        /*
        강제형변환
        바꾸려는 자료형으로 캐스트 연산자를 이용하여 형변환
        예) (바꿀자료형) 값;
         */

        /*
        자동형변환 규칙의 반대 상황에서 강제형변환이 필요
        1. 강제형변환 규칙
            1-1. 큰 자료형에서 작은 자료형으로 변경시 강제 형변환이 필요
            1-2. 실수를 정수로 변경시 강제 형변환 필요
            1-3. 문자형을 int미만 크기의 변수에 저장할 때 강제형변환 필요
            1-4. 논리형은 강제 형변환도 x
         */

        // 1-1 큰 자료형에서 작은 자료형으로 변경시 강제 형변환
        // 1-1-1 정수끼리의 강제 형변환
        long lnum = 8;
//        int inum = lnum;    // 데이터 손실 가능성을 컴파일러가 알려줌 에러
        int inum = (int)lnum; // 변경하려는 자료형을 명시해서 강제 형변환

        short snum = (short) inum;

        // 1-1-2 정수끼리 강제형변환
        double dnum = 8.0;
//        float fnum = dnum; 오류
        float fnum = (float) dnum;

        // 1-2 실수를 정수로 변경시 강제 형변환
        float fnum1 = 4.0f;
//        long lnum1 = fnum1;
        long lnum1 = (long) fnum1;

        // 1-3 문자형을 int미만 크기의 변수에 저장할때 강제 형변환
        int num1 = 97;
        int num2 = -97;

        char ch2 = (char) num1;
        char ch3 = (char) num2;

        System.out.println("ch2 : " + ch2);
        System.out.println("ch3 : " + ch3);

        // 1-4 논리형은 강제형변환 규칙에도 제외
        // 강제형변환해도 전부 에러
        boolean isTrue = true;
//        byte b = (byte) isTrue; 에러남

    }
}
