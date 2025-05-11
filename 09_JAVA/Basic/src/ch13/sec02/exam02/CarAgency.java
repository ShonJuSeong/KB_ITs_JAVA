package ch13.sec02.exam02;

public class CarAgency implements Rentable<Car>{
    @Override
    //@Override: 인터페이스의 메서드를 재정의함
    public Car rent(){
        return new Car();
    }
}
