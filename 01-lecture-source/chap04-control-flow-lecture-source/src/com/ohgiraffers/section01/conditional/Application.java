package com.ohgiraffers.section01.conditional;

public class Application {

    public static void main(String[] args) {

        A_if a = new A_if();
        // 단독 if문 흐름 확인용 메소드 출력
//        a.test();

        // 중첩된 if문 흐름 확인용 메소드
//        a.testNestedIfStatment();

        // if-else
        B_ifElse b = new B_ifElse();
//        b.simpleIfElseStatement();

        // 중첩 if-else
//        b.testNeatedIfElseStatment();

        C_ifElseIf c = new C_ifElseIf();
//        c.test();
//        c.testNestedIfElseIfStatment();

        D_switch d = new D_switch();
        d.testSwitchVendingMachine();
    }
}
