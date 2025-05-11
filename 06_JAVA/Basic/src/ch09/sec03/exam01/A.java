package ch09.sec03.exam01;

public class A {
    //정적 멤버 클래스
    static class B{}
    //static	이 클래스는 **정적 중첩 클래스(정적 멤버 클래스)**
    //A         객체가 없어도 바로 사용 가능
    //class	    클래스를 만든다는 뜻
    //B	        클래스 이름

    //인스턴스 필드값으로 B 객체 대입
    B field1 = new B();
    //B	            B 타입 (A의 내부 클래스)
    //field1	    A 객체의 필드 (변수 이름)
    //=	            대입 연산자(오른쪽 값을 왼쪽에 넣음)
    //new B()	    B 클래스의 새 객체를 생성

    //정적 필드값으로 B객체 대입
    static B field2 = new B();
    //static	A 객체 없이 사용 가능
    //B     	타입
    //field2	변수 이름
    //new B()	B 클래스 객체 생성

    //생성자
    A() {
        B b = new B();
    }
    //A()	    생성자. A 객체를 만들면 실행됨
    //B b	    B 타입의 지역변수 b
    //new B()	b에 새 B 객체 대입
    // ➡️ A 객체를 만들면 내부에서 B 객체도 하나 만듦.

    //인스턴스 메소드
    void method1() {
        B b = new B();
    }
    //void               아무것도 리턴하지 않음.
    //method1            A 객체의 인스턴스 메서드.
    //B b = new B();     B 객체를 생성해서 지역 변수 b에 저장.

    //정적 메소드
    static void method2(){
        B b = new B();
    }
    //B b = new B();	정적 메서드에서도 B 객체 생성 가능
}
