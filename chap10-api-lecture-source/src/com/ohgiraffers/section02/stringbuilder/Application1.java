package com.ohgiraffers.section02.stringbuilder;

public class Application1 {

    public static void main(String[] args) {
        // String과 StringBuilder의 차이점
        /*
        두 클래스는 스레드 동기화 기능 제공 여부에 따라 차이점이있음
        StringBuilder : 스레드 동기화 기능을 제공하지않음
                        스레드 동기화처리를 고려하지않는 상황에서 StringBuffer보다 성능이 좋음
        StringBuffer : 스레드 동기화 기능 제공
                        성능면에서는 StringBuilder보다 느림
        StringBuilder를 이용할것
         */

        /*
        String과 StringBuilder
        String : 불변이라는 특징
                문자열에 + 연산을 합치기 하는 경우, 기존 인스턴스를 수정하는 것이 아닌
                새로운 인스턴스를 반환
                따라서 문자열 변경이 자주 일어나는 경우 성능면에서 좋지않음
                하지만 변하지 않는 문자열을 자주 읽어들이는 경우에는 오히려 좋은 성능을 기대할수있음
        StringBuilder : 가변이라는 특징
                        문자열에 append()메소드를 이용하여 합치기 하는경ㅇ
                        기존 인스턴스를 수정하기 때문에 새로운 인스턴스를 생성하지 않는다
                        따라서 자주 문자열 변경이 일어나는경우 String보다 성능이 좋다
         */

        StringBuilder sb = new StringBuilder("java");
        System.out.println("sb = " + sb);

        /*
        hashCode는 오버라이딩되어있지않음
        즉, 동일한 값을 가지는 경우 같은 해쉬코드를 반환하는것이 아닌
        인스턴스가 동일해야 같은 해쉬코드 반환
         */

        System.out.println("sb.hashCode() = " + sb.hashCode());

        sb.append("oracle");
        System.out.println("sb = " + sb);
        System.out.println("sb.hashCode() = " + sb.hashCode());

    }
}
