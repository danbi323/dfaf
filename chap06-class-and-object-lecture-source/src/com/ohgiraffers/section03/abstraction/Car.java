package com.ohgiraffers.section03.abstraction;

public class Car {

    private boolean isOn; // 초기에는 시동이 꺼진 false상태

    private int speed;

    // 시동이 걸려있는 상태인 경우 할 일이 없고 시동이 걸려있지 않은경우 시동걸음
    public void startUp(){

        if (isOn){
            System.out.println("이미 시동이 걸려있습니다.");
        }else {
            this.isOn = true;
            System.out.println("시동을 걸었습니다. 출발 준비 완료");
        }
    }

    public void go(){
        if (isOn){
            System.out.println("차가 앞으로 움직임");
            this.speed += 10;
            System.out.println("현재 차의 시속은 " + this.speed + "km/h 입니다.");
        }else {
            System.out.println("시동이 걸려있지 않았습니다. 시동을 걸어");
        }
    }

    public void back(){
        if (isOn){
            System.out.println("후진한당");
        }else {
            System.out.println("시동키삼~");
        }
    }

    public void stop(){
        if(isOn){
            if (this.speed > 0){
                this.speed = 0;
                System.out.println("브레이크를 밟았다. 차 멈춰");
            }else {
                System.out.println("이미 멈춰있음");
            }
        }else {
            System.out.println("시동 걸려있지 않음. 시동 켜");
        }
    }

    public void turnOff(){
        if(isOn){
            if (speed > 0){
                System.out.println("달리는 상태에서 시동을 끌 수 없습니다. 차를 멈춰");

            }else {
                System.out.println("시동 끕니다. 다시 운행하려면 시동켜");
            }
        }else{
            System.out.println("이미 꺼져있습니다.");
        }
    }
}
