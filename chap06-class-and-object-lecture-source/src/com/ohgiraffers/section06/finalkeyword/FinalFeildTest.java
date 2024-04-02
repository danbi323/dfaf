package com.ohgiraffers.section06.finalkeyword;

public class FinalFeildTest {

    // final 키워드에 대해 이해
    /*
    final
    : final은 중단의 의미를 가지는 키워드
    final 키워드를 사용할 수 있는 위치는 다양한 편이며 의미가 약간은 다르지만, 결국 변경 불가의 의미이다.
    1. 지역변수 : 초기화 이후 값 변경 불가
    2. 매개변수 : 호출시 전달한 인자 변경 불가
    3. 전역변수 : 인스턴스 생성후 초기화 이후에 값 변경 불가
    4. 클래스(static) 변수 : 프로그램 start 이후 값 변경 불가
    5. non-static메소드 : 메소드 재작성 불가
    6. static메소드 : 메소드 재작성 불가
    7. 클래스 : 상속 불가
     */

    // 1. non-static field에 final 사용
    /*
    final은 변경불가의 의미를 가짐
    따라서 조기 인스턴스가 생성되고 나면 기본값 0 이 필드에 들어감
    그 초기화 이후 값을 변경할 수 없기 때문에 선언을 하면서 바로 초기화를 해줘야됨
    그렇지 않으면 compoile error가 발생
     */

//    private final int NON_STATIC_NUM; 선언만 하면 에러

    private final String NON_STATIC_NAME;

    public FinalFeildTest(String NON_STATIC_NAME) {
        this.NON_STATIC_NAME = NON_STATIC_NAME;
    }

    // 2. static field에 final 사용
    /*
    static에서도 자바에서 지정한 기본값이 대입되기때문에 final키워드 사용시 초기화 안하면 에러발생

     */
//    private static final int STATIC_NUM;    // 에러남 0으로 초기화되기때문에 값 변경 불가
    private static final int STATIC_NUM = 1;


    /*
    생성자를 이용한 초기화 불가능
    생성자는 인스턴스가 생성되는 시점에서 호출이되기 때문에 그 전에는 초기화가 이루어지지 못함
    하지만 static은 프로그램이 start될때 할당되기 때문에 초기화가 되지않은상태로 선언된것과동일
    기본값으로 초기화된 이후에 값을 변경하지 못하기 때문에 에러 발생
     */

    // 초기화 블럭으로는 가능

}
