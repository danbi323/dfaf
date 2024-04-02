package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.book.Book;

public class Application2 {


    public static void main(String[] args) {
    // Object 클래스의 equals() 메소드의 오버라이딩 목적을 이해하고 활용
    /*
    equals() 메소드의 오버라이딩
    equals 메소드는 매개변수로 전달받은 인스턴스와 == 연산을 하여 true와 false를 반환
    동일한 인스턴스인지를 비교

    동일 객체와 동등객체
    동일객체 : 주소가동일한 인스턴스를 동일객체라고 함
    동등객체는 주소는 다르더라도 필드값이 동일한 객체를 동등객체라고 함
     */

        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(1, "홍길동전", "허균", 50000);
        Book book3 = new Book(2, "김치전", "세균", 15000);

        System.out.println("두 인스턴스의 == 연산비교" + (book1 == book2));
        System.out.println("두 인스턴스의 equals 연산비교" + (book1.equals(book2)));



    }
}