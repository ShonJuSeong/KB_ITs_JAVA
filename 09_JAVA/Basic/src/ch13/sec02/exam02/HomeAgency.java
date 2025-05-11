package ch13.sec02.exam02;

public class HomeAgency implements Rentable<Home> {
    //implements: 인터페이스 구현 //Rentable<Home>: Rentable 인터페이스를 Home 타입으로 구현
    @Override
    public Home rent() {
        return new Home();
    }
}
