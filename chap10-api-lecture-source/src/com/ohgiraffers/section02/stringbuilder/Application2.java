package com.ohgiraffers.section02.stringbuilder;

public class Application2 {

    public static void main(String[] args) {
        /* 수업목표 Stringbuilder의 자주 사용되는 메소드의 용법을 확인할 수 있다.*/
        StringBuilder sb1 = new StringBuilder();

        /* capcity() : 용량(현재 퍼버의 크기)을 정수형으로 반환하는 메소드 (문자열길이 + 16 기본용량)*/
        System.out.println("sb1.capacity() = " + sb1.capacity());


    /*
     * append() : 인자로 전달한 값을 문자열로 변환 후 기본 문자의 마지막에 추가한다.
     * 기본 용량을 초과하는 경우(기존문자열 + 1 ) * 2 를하여 용량을 확장시킴*/

//        for (int i = 0; i < 50; i++) {
//            sb1.append(i);
//
//            System.out.println("sb1 = " + sb1);
//            System.out.println("sb1.capacity() = " + sb1.capacity());
//            System.out.println("sb1.hashCode = " + sb1.hashCode());
//        }

        StringBuilder sb2 = new StringBuilder("javaoracle");
        /*
        delete() : 시작인덱스와 종료인덱스를 이용해 문자열에서 원하는 부분의 문자열을 제거
        deleteCharAt() : 문자열 인덱스를 이용해서 문자 하나를 제거한다
        둘 다 원본에 영향을 미친다
         */

        System.out.println("sb2.delete(2, 5) = " + sb2.delete(2, 5));
        System.out.println("sb2.deleteCharAt(0) = " + sb2.deleteCharAt(0));

        System.out.println("sb2 = " + sb2);

        // insert() : 인자로 전달된 값을 문자열로 변환 후 지정된 인덱스 위치에 추가
        System.out.println("sb2.insert() = " + sb2.insert(1, "vao")); // avaoracle
        System.out.println("sb2.insert() = " + sb2.insert(0, "j")); // javaoracle

        // 인덱스 번호가 문자열 길이와 같은 경우 append()와 같은 역할을 한다
        System.out.println("insert() = " + sb2.insert(sb2.length(), "jdbc")); // 문자열 합치기

        System.out.println("sb2 = " + sb2);

        /*
        reverse() : 문자열의 인덱스 순번을 역순으로 재배열
         */
        System.out.println("sb2.reverse() = " + sb2.reverse());
        System.out.println("sb2 = " + sb2);

        /*
        String클래스와 동일한 메소드도 있음
        charAt(), indexOf()/lastIndexOf(), length(), replace(), substring(), toString()
         */


    }
}
