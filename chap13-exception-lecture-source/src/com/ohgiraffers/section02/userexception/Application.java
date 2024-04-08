package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section01.exception.ExceptionTest;

public class Application {

    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();

        try {
//            et.checkEnoughMoney(30000,50000);
//            et.checkEnoughMoney(-50000, 10000);
//            et.checkEnoughMoney(50000,-60000);
            et.checkEnoughMoney(50000,30000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
