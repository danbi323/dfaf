package com.ohgiraffers.section02.encapsulation.problem4;

public class Application {
    public static void main(String[] args) {
        // 접근제한자에 대해 이해하고 필드에 접근하지 못하게 강제화

        // 1. private 필드에 직접 접근하여 compile error 확인
        Monster monster = new Monster();
//        monster.kinds = "피카츄";
//        monster.hp = 13;

        // 2. public메소드를 이용해 필드에 간접 접근
        monster.setKinds("동훈이");
        monster.setHp(400);

        System.out.println("monster.getInfo() = " + monster.getInfo());


    }
}
