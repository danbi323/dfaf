package com.ohgiraffers.section01.array;

public class Application5 {

    // 배열을 사용하는 예시 이해
    // 랜덤한 카드를 한장 뽑아서 출력

    public static void main(String[] args) {
        String[] cardNumbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};


        int random = (int) (Math.random()*cardNumbers.length);

        System.out.println("당신이 뽑은 카드는 " + cardNumbers[random] + " 카드 입니다.");


    }



}
