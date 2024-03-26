package com.ohgiraffers.section02.demensinal;

public class Application1 {

    public static void main(String[] args) {

        // 다차원 배열의 구조를 이해하고 사용
        /*
        다차원배열
        다차원 배열은 2차원 이상의 배열을 의미
        배열의 인덱스마다 또 다른 배열의 주소를 보관하는 배열을 의미함
        즉, 2차원 배열은 1차원 배열 여러개를 하나로 묶어서 관리하는 배열을 의미함
        더 많은 차원의 배열을 사용할 수 있지만 일반적으로 2차원 배열보다 높은 차원의 배열은 사용 빈도가
        현저히 적음
         */

        /*
        2차원 배열 사용 방법
        1. 배열의 주소를 보관할 래퍼런스 변수 선언(stack)
        2. 여러개의 1차원 배열의 주소를 관리할 배열을 생성(heap)
        3. 각 인덱스에 관리하는 배열을 할당(heap) 하여 주소를 보관하는 배열에 저장
        4. 생성한 여러개의 일차원 배열에 차례로 접근해서 사용
         */

        // 1. 배열의 주소를 보관할 래퍼런스 변수 선언)stack)
        int[][] iarr;
        int iarr2[][];
        int[] iarr3[];

        //2. 여러개의 1차원 배열의 주소를 관리하는 배열 생성(heap)
        /*
        heap 에 공간을 할당할때 new연산자를 이용
        배열의 주소를 관리하는 배열의 길이는 앞부분에 정수형으로 표기해 반드시 크기를 지정해야됨
         */
//        iarr = new int[][];   크기 지정 안하면 에러
//        iarr = new int[][5];  주소 묶어서 관리할 배열 크기 지정 x 에러
        iarr = new int[3][];

        // 3. 주소를 관리하는 배열의 인덱스마다 배열을 할당
        iarr[0] = new int[5];
        iarr[1] = new int[5];
        iarr[2] = new int[5];

        iarr2 = new int[3][5];

        // 4-1 배열을 하나씩 접근해서 출력하기
        for (int i = 0; i < iarr[0].length; i++) {
            System.out.println(iarr[0][i] + " ");
        }
        System.out.println();
        for (int i = 0; i < iarr[1].length; i++) {
            System.out.println(iarr[1][i] + " ");
        }
        System.out.println();
        for (int i = 0; i < iarr[2].length; i++) {
            System.out.println(iarr[2][i] + " ");
        }
        System.out.println();


        for (int i = 0; i < iarr.length; i++) {

            for (int j = 0; j < iarr[i].length; j++) {
                System.out.println(iarr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
