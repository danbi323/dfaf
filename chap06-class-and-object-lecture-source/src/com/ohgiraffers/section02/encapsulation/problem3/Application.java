package com.ohgiraffers.section02.encapsulation.problem3;

public class Application {

    public static void main(String[] args) {
        // 필드에 직접 접근시 발생하는 문제 해결

        Monster monster1 = new Monster();
        monster1.setinfo("피카츄");
        monster1.setHp(200);
        
        Monster monster2 = new Monster();
        monster2.setinfo("파이리");
        monster2.setHp(100);
        
        Monster monster3 = new Monster();
        monster3.setinfo("이상해씨");
        monster3.setHp(-200);

        System.out.println("monster1.getinfo() = " + monster1.getinfo());
        System.out.println("monster2.getinfo() = " + monster2.getinfo());
        System.out.println("monster3.getinfo() = " + monster3.getinfo());

        monster3.kind = "망나뇽";
        monster3.hp = -500;

        System.out.println("monster3.kind = " + monster3.kind);
        System.out.println("monster3.hp = " + monster3.hp);
    }
}
