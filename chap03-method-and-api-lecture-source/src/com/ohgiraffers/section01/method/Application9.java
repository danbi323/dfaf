package com.ohgiraffers.section01.method;

public class Application9 {

    public static void main(String[] args) {

        // 다른 클래스에 작성한 메소드를 호출

        // 최대값 최솟값을 비교할 두 정수를 변수로 선언
        int first = 100;
        int second = 50;

        // non-static메소드의 경우
        /*
        클래스가 다르더라도 사용하는 방법 동일
        클래스명 사용할이름 = new 클래스명();
        사용한이름.메소드명();
         */

        Calculator cal = new Calculator();
        int min = cal.minNumberOf(first, second);
        System.out.println(min);

        // static 메소드인 경우
        /*
        다른 클래스에 작성한 static 메소드의 경우 호출할 때 클래스명을 반드시 기숭해야함
        클래스명.메소드명();
         */
        int max = Calculator.maxNumberOf(first, second);

        System.out.println("두 수 중 최대값은? " + max);
        /*
        static도 non-static메소드처럼 호출은 가능하지만 권장하지 않음
        이미 메모리에 로딩되어있는 static메소드는 여러 객체가 공유하게 된다.
        그때 객체로 접근하게 되면 인스턴스가 가진 값으로 공유된 값에 예상치 못하는 동작을 유발할 수 있기 때문
        사용을 제한해 달라는 경고. 시스템이 복잡할수록 유지보수에 악영향

         */

        int max2 = cal.maxNumberOf(first, second);

        System.out.println("두 수 중 최대값은? " + max2);

    }
}
