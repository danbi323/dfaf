package com.ohgiraffers.section03;

public class SuperClass {
    // 오버라이딩(overriding)
    /* 오버라이딩이란?
    부모클래스에서 상속받은 메소드를 자식 클래스에서 재정의하여 사용하ㅡㄴㄴ것
     */
    /*
    오버라이딩 성립요건
    1. 메소드 이름이 동일해야됨'
    2. 메소드의 리턴타입이 동일
    3. 매개변수 타입,갯수, 순서 동일해야됨
    4. private 메소드는 접근이 불가하기때문에 오버라이딩이 불가능
    5. final키워드가 사용된 메소드는 오버라이딩 불가능
    6. 접근제한자는 부모 메소드와 같거나 더 넓은 범위여야함
    7. 예외처리는 같은 예외거나 더 구체적(하위)인 예외를 처리해야됨 < 예외 챔터에서 다룸
     */

    public void method(int num){}

    private void privateMethod(){}

    public final void finalMethod(){}

    protected void protectedMethod(){}

}
