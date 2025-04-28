package ch08.sec10.exam02;

public class CastingExample {
    public static void main(String[] args) {

        //인터페이스 변수 선언과 구현 객체 대입
        Vehicle vehicle = new Bus();

        //인터페이스를 통해서 호출
        vehicle.run();
        //Vehicle 인터페이스에 정의된 run을 호출.

//        vehicle.checkFare();

        //강제 타입 변환 후 호출
        Bus bus = (Bus)vehicle;
        //(Bus)vehicle: vehicle을 Bus 타입으로 강제 변환(casting).
        bus.run();
        //bus.run(): Bus 클래스의 run() 호출.
        bus.checkFare();
        //Bus 클래스의 checkFare() 호출.
    }
}


//버스가달립니다.
//버스가달립니다.
//승차요금을체크합니다.