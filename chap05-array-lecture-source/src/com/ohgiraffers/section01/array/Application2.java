package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /*수업목표. 배열의 사용방법을 익혀 배열을 사용할 수 있다.
         *
         * 배열의 사용방법
         * 1. 배열의 선언
         * 2. 배열의 할당
         * 3. 배열의 인덱스 공간에 값 대입
         * */

        /*1. 배열의 선언
         * 자료형[] 변수명;
         * 자료형 변수명[];
         * */

        // 선언은 stack에 배열의 주소를 보관할수있는 공간 만드는것
        int[] iarr;
        char carr[];

        /*
        선언한 레퍼런스 변수에 배열을 할당하고 대입
        new 연산자는 heap 영역에 공간을 할당하고 발생한 주소값을 반환하는연산자
        발생한 주소를 래퍼런스 변수(참조형 변수)에 지정하고 이것을 참ㅂ조하고 사용하기 때문에 참조자료형이라고함
         */

        /*
        배열 할당시에는 반드시 배열의 크기를 지정해야됨
         */
//        iarr = new int[]; 크기 지정안해서 에러
        iarr = new int[5];
        carr = new char[10];

        // 위의 선언이랑 할당을 동시에 가능
        int[] arr2 = new int[5];
        char[] carr2 = new char[10];


        // heap메모리는 이름으로 접근하는게 아니라 주소로 접근
//        steak에 저장된 주소로 heap에 할당된 배열을 찾아갈수있다
        System.out.println("arr2 = " + arr2); // 16진수 주소값
        System.out.println("carr2 = " + carr2); // 16진수 주소값

        /*
        hashcode() : 일반적으로 객체의 주소값을 10진수로 변환해 생성된 객체의 고유한 정수값 반환
        동일객체인지 비교할때 사용할 목적으로 쓰이며 동등객체를 동일 객체 취급하기 위해 오버라이딩 사용
         */
        System.out.println("carr2 = " + carr2.hashCode());
        System.out.println("arr2 = " + arr2.hashCode());

        System.out.println("arr2의 길이 : " + arr2.length);
        System.out.println("crr2의 길이 : " + carr2.length);

        Scanner sc = new Scanner(System.in);

        System.out.println("새로 할당할 배열의 길이를 입력하세요 : ");
        int size = sc.nextInt();

        double[] darr = new double[size];

        System.out.println("darr의 hashcode : " + darr.hashCode()); // 51228289
        System.out.println("darr의 길이 : " + darr.length);

        darr = new double[30];

        System.out.println("변경후 darr의 hashcode : " + darr.hashCode()); // 51228289
        System.out.println("변경후 darr의 길이 : " + darr.length);


        darr = null;

//        System.out.println("darr.length = " + darr.length); 에러
    }

}
