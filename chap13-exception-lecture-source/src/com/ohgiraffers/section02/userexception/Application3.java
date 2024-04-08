package com.ohgiraffers.section02.userexception;


import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application3 {

    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnoughMoney(20000,30000);
        } catch (PriceNegativeException |MoneyNegativeException e) {

            // 예외가 발생한 클래스의 이름을 알 수 있음
            System.out.println(e.getClass());

        } catch (NotEnoughMoneyException e) {
            /*예외 클래스명, 예외 발생 위치, 예외 메세지를 stack 호출 역순으로
            * 빨ㅇ간색 글씨를 이용해 로그 형태로 출력*/
            e.printStackTrace();
        }finally {
            System.out.println("final 블럭 동작");
        }
        System.out.println("프로그램 종료");
    }
}
