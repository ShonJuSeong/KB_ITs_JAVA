package ch08.sec04;

public class RemoteControlExample {
    public static void main(String[] args) {
        //인터페이스 변수 선언
        RemoteControl rc;
        //인터페이스 타입으로 변수 rc 선언.
        //rc는 RemoteControl을 구현한 어떤 객체든 담을 수 있다.

        //Television 객체를 생성하고 인터페이스 변수에 대입
        rc = new Television();
        //Television 객체를 만들고 rc에 대입.
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();
        //Television 클래스에 있는 메소드들이 실행됨.

        //Audio 객체를 생성하고 인터페이스 변수에 대입 Audio 객체를 만들고 rc에 다시 대입.
        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

    }
}
