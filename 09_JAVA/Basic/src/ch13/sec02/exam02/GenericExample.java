package ch13.sec02.exam02;

public class GenericExample {
    public static void main(String[] args) {
        HomeAgency homeAgency = new HomeAgency();
        //HomeAgency: 클래스 이름 (사용자 정의 클래스)
        //homeAgency: 변수 이름
        //=: 대입 연산자
        //new: 메모리에 객체 생성
        //HomeAgency(): 생성자 호출
        Home home = homeAgency.rent();
        home.turnOnLight();
        //home: 앞에서 만든 Home 객체
        //.: 객체의 멤버 접근 연산자
        //turnOnLight(): 전등 켜는 메서드 실행

        CarAgency carAgency = new CarAgency();
        Car car = carAgency.rent();
        car.run();

    }
}
