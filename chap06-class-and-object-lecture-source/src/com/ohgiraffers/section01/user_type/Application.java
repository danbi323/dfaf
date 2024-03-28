package com.ohgiraffers.section01.user_type;

public class Application {

    public static void main(String[] args) {

        // 클래스가 무엇인지

        // 1. 변수를 이용한 회원데이터 관리
        String id = "user01";
        String pwd = "pass01";
        String name = "홍동동";
        int age = 20;
        char gender = '남';
        String[] hobby = new String[] {"족구", "야구", "농구"};

        System.out.println("id = " + id);
        System.out.println("pwd = " + pwd);
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("hobby = " );
        for (int i = 0; i < hobby.length; i++) {
            System.out.println(hobby[i] + " ");
        }

        /*
        단점이 있다
        1. 변수명을 다 관리해야하는 어려움이 있음
        2. 모든 회원 정보를 인자로 메소드 호출시 값을 전달해야하면 너무 많ㅇㄴ값들을 인자로
        전달해야돼서 한 눈에 안들옴
        3. 리턴은 1개의 값만 가능하기 때문에 회원정보를 묶어서 리텀값으로 사용할수x
        (서로 다른 자요형이기 때문
         */

        /*
        사용자 정의의 자료형 사용
        2-1 변수 선언 및 객체 생성
        자료형 변수명 = new 클래스명(); <- 지금까지 사용한 구문은 객체(인스턴스) 를 생성하는구문
        사용자정의 자료형인 클래스를 이용하기 위해서는 new 연산자로 heap에 할당해야한다
        객체를 생성하게 되면 클래스에 정의한 필드와 메소드 대로 객체 생성
        아이디, 비번, 이름, 나이, 성별,취미를 연속된 메모리 주소에 사용하도록 heap에 공간만들음
         */

        Member mem = new Member(); // 객체 생성(사용자 정의 변수명)

        // 2-2 생성된 인스턴스의 초기값 확인
        /*
        필드에 접근하기 위해서는 래퍼런스변수명.필드명
        '.' 참조연산자 , 래퍼런스 변수가 참고하고잇는 주소로 접근한다는 의미
        각 공간은 필드명으로 접근(배열은 인덱스로 접근. 객체는 필드명으로 접근)
         */
//
//        System.out.println("mem.id = " + mem.id);
//        System.out.println("mem.pwd = " + mem.pwd);
//        System.out.println("mem.name = " + mem.name);
//        System.out.println("mem.age = " + mem.age);
//        System.out.println("mem.gender = " + mem.gender);
//        System.out.println("mem.hobby = " + mem.hobby);

        mem.id = "user02";
        mem.pwd = "pass02";
        mem.name = "단비";
        mem.age = 15;
        mem.gender = '여';
        mem.hobby = new String[]{"축구","농구","야구"};

        System.out.println("변경후 mem.id = " + mem.id);
        System.out.println("mem.pwd = " + mem.pwd);
        System.out.println("mem.name = " + mem.name);
        System.out.println("mem.age = " + mem.age);
        System.out.println("mem.gender = " + mem.gender);
        System.out.print("mem.hobby = ");
        for (int i = 0; i < mem.hobby.length; i++) {
            System.out.print(mem.hobby[i] + " ");
        }
    }
}
