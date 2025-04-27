package ch07.sec04.exam01;

import ch07.sec03.exam02.Phone;

public class Computer extends Calculator{
    @Override
    public double areaCircle(double r) {
        System.out.println("Computer 객체의 areaCircle() 실행");
        return Math.PI * r * r;
    }
}
