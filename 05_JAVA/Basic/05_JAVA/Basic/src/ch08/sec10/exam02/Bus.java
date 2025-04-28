package ch08.sec10.exam02;

public class Bus implements Vehicle {
    //Vehicle: 따르는 규칙의 이름. Vehicle 인터페이스를 따라야 함.

    //추상 메소드 재정의
    @Override
    public void run() {
        //public: 메소드도 어디서나 쓸 수 있도록 공개함.
        //void: 결과를 돌려주지 않음.
        //run(): 탈것의 "달리다" 기능을 버스에 맞게 만든 메소드.
        System.out.println("버스가달립니다.");
    }

    //추가 메소드
    public void checkFare() {
        System.out.println("승차요금을체크합니다.");
    }}
