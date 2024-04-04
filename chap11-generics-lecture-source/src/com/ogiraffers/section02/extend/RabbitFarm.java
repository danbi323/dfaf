package com.ogiraffers.section02.extend;

//public class RabbitFarm<T implements Animal> 에러
//public class RabbitFarm<T extends Animal> 정상

//public class RabbitFarm<T extends Rabbit> {
//public class RabbitFarm<T extends Rabbit & Animal> {클래스와 인터페이스 상속
//public class RabbitFarm<T extends Rabbit ,Snake> {
public class RabbitFarm<T extends Rabbit> {

    private T animal;

    public RabbitFarm(){}
    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
