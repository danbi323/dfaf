package com.ohgiraffers.section01.method;

public class Application5 {

    public static void main(String[] args) {

        // 메소드 리턴
        /*
        return이란?
        모든 메소드 내부에 리턴이 존재
        void 메소드의 경우는 리턴을 명시적으로 작성하지않아도 마지막줄에 컴파일러가 자동으로 추가 해줌
        return은 현재 메소드를 강제 종료하고 호출한 구문으로 다시 돌아가는 명령어
         */

        System.out.println("main() 메소드 시작");

        // 1. 메소드 리턴 테스트
        Application5 app5 = new Application5();
        app5.testMethod();


        System.out.println("main() 메소드 종료");
    }

    public void testMethod(){

        System.out.println("테스트 메소드 동작 확인...");

        // 컴파일러에 의해 자동으로 추가되는 구문
        // 가장 마지막 작성, 마지막에 작성되지 않을경우는 컴파일에러

        return;

//        System.out.println(); 에러발생. return은 가장 마지막에 작성
    }

}
