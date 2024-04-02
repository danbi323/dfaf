package com.ohgirrafers.section01.init;

public class Application {

    /*
     * 객체 배열에 대해 이해할 수 있다.
     * 객체배열은 레퍼런스 변수에 대한 배열이다.
     * 생성한 인스턴스도 배열을 이용해서 관리하면
     * 동일한 타입 여러 개 인스턴스를 각각 취급하지 않고 연속 처리할 수 있어서 유용하다
     * 또한 반환값은 1개의 값만 반환할 수 있기 때문에
     * 동일한 타입의 여러 인스턴스를 반환해야하는 경우 객체배열을 이용할 수 있다.
     * */
    public static void main(String[] args) {


        Car car1 = new Car("페라리", 3000);
        Car car2 = new Car("람보르기니", 4000);
        Car car3 = new Car("롤스로이스", 3500);
        Car car4 = new Car("부가티", 2500);
        Car car5 = new Car("포르쉐", 2000);

        car1.deiverMaxSpeed();
        car2.deiverMaxSpeed();
        car3.deiverMaxSpeed();
        car4.deiverMaxSpeed();
        car5.deiverMaxSpeed();
        System.out.println("========================================");
        Car[] carArray = new Car[5];
        carArray[0] = new Car("페라리", 3000);
        carArray[1] = new Car("람보르기니", 4000);
        carArray[2] = new Car("롤스로이스", 3500);
        carArray[3] = new Car("부가티", 2500);
        carArray[4] = new Car("포르쉐", 2000);

        for (int i = 0; i < carArray.length; i++) {
            carArray[i].deiverMaxSpeed();
        }
        System.out.println("==========================================");
        Car[] carArray2 = {
                new Car("페라리", 3000),
                new Car("람보르기니", 4000),
                new Car("롤스로이스", 3500),
                new Car("부가티", 2500),
                new Car("포르쉐", 2000)
        };

        for (Car c : carArray2){
            c.deiverMaxSpeed();
        }
    }
}