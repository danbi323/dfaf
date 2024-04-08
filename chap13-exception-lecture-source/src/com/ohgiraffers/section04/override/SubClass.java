package com.ohgiraffers.section04.override;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends SuperClass{

    /*@Override
    public void method() throws IOException {}*/ // 예외없이 오버라이딩 가능

    // 같은 예외를 던져주는 구문으로 오버라이딩해야됨
    /*@Override
    public void method() throws IOException{}*/

    // 부모의 예외처리 클래스보다 상위예외로는 후손 클래스에서 오버라이딩 할수없음
//    @Override
//    public void method() throws Exception{}

    // 부모의 예외처리보다 하위예외인경우 오버라이딩할수없음
    @Override
    public void method() throws FileNotFoundException {}
}
