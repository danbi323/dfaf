package com.ohgiraffers.section01.exception;

public class ExceptionTest {

    public void checkEnoughMoney(int price, int money) throws Exception {


        System.out.println("가지고 계신 돈은 " + money + "원 입니다.");

        if (money >= price){
            System.out.println("상품을 구입할수이따");
        }else {

            throw new Exception();
        }
        System.out.println("즐쇼핑 하셔요");
    }
}
