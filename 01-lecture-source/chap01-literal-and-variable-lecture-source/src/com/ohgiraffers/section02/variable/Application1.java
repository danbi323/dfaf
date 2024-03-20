package com.ohgiraffers.section02.variable;

public class Application1 {

    public static void main(String[] args) {

        /* 변수의 사용 */
    /* 변수의 사용 목적
    1. 값에 의미를 부여하기 위한 목적(의미 전달이 쉬워야 코드가 읽기 쉬워지고, 협업 및 유지보수에 유리하기 때문)
    2. 한 번 저장해둔 값을 재사용하기 위한 목적(변수를 이용하여 코드를 작성하면, 값을 변경할 때 보다 간편하게 변경할수 있다)
    3. 시간에 따라 변하는 값을 저장하고 사용 가능(변하는 값을 저장하기 위한 공간)
     */

        // 1. 값에 의미부여를 하기 위한 목적
        System.out.println("=========값에 의미 부여 테스트==========");

        System.out.println("보너스를 포함한 급여 : " + (100000 + 9999) + "원");

        int salary = 9999999;
        int bonus = 200000;

        System.out.println("보너스를 포함한 급여 : " + (salary + bonus) + "원");

        // 2. 한번 저장해둔 값을 재사용 하기 위한 목적
        System.out.println("=========변수의 저장한 값 재사용 테스트==========");
        System.out.println("1번의 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("2번의 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("3번의 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("4번의 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("5번의 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("6번의 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("7번의 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("8번의 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("9번의 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("10번의 고객에게 포인트를 100포인트 지급하였습니다.");

        int point = 100;
        System.out.println("1번 고객에게 포인트를 " + point + "포인트를 지급하였습니다.");
        System.out.println("2번 고객에게 포인트를 " + point + "포인트를 지급하였습니다.");
        System.out.println("3번 고객에게 포인트를 " + point + "포인트를 지급하였습니다.");
        System.out.println("4번 고객에게 포인트를 " + point + "포인트를 지급하였습니다.");
        System.out.println("5번 고객에게 포인트를 " + point + "포인트를 지급하였습니다.");
        System.out.println("6번 고객에게 포인트를 " + point + "포인트를 지급하였습니다.");
        System.out.println("7번 고객에게 포인트를 " + point + "포인트를 지급하였습니다.");
        System.out.println("8번 고객에게 포인트를 " + point + "포인트를 지급하였습니다.");
        System.out.println("9번 고객에게 포인트를 " + point + "포인트를 지급하였습니다.");
        System.out.println("10번 고객에게 포인트를 " + point + "포인트를 지급하였습니다.");

        // 3. 시간에 따라 변경되는 값을 정하고 사용
        System.out.println("=========변수의 저장된 값 변경 테스트==========");

        int sum = 0;

        sum = sum + 10;

        System.out.println("sum에 10을 더하면 현재의 sum의 값은? " + sum);

        sum = sum + 100;

        System.out.println("sum에 10이있었는데 추가로 100을 더하면 현재의 sum의 값은? " + sum);

        sum = sum + 100;
        System.out.println("sum에 110이있었는데 추가로 100을 더하면 현재의 sum의 값은? " + sum);


    }
}


