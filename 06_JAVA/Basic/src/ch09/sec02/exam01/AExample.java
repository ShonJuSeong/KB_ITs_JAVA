package ch09.sec02.exam01;
//앞에서 정의한 클래스를 이용해서 클래스 A와 내부 클래스 B를 인스턴스화 시켜보세요.
public class AExample {
    public static void main(String[] args) {
        //A객체 생성
        A a = new A();
//A: 타입. 외부 클래스 A의 객체를 만들기 위한 선언.
//a: 변수 이름.
//=: 대입.
//new A(): 클래스 A의 객체 생성자 호출.


        //B객체 생성
        A.B b = a.new B();
        //A.B : 내부 클래스 B의 전체 이름. 클래스 A 안의 B를 의미.
        //b : 변수 이름.
        //= : 대입.
        //a.new B() : 외부 클래스의 인스턴스 a를 통해 내부 클래스 B의 객체를 생성.
    }
}
/*
B 객체를 A클래스 외부에 생성하려면 default 또는 public 접근 제한을 가져야 하고,
A객체를 먼저 생성한 다음 B객체를 생성해야 한다.

 */