package ch09.sec03.exam01;
//정적 멤버 클래스 B의 내부 인스턴스를 생성하세요.
public class AExample {
    public static void main(String[] args) {
        // B 객체 생성
        A.B b = new A.B();
    }
    //A.B	        A 클래스 안에 있는 static 클래스 B
    //b	            변수 이름
    //new A.B()	    외부 클래스 A의 객체 없이 바로 B 객체 생성 (가능!)

}



//항목	                     인스턴스 멤버 클래스     	            정적 멤버 클래스

//선언 방법     	            class B	                            static class B
//생성 방법 	                A a = new A(); A.B b = a.new B();	A.B b = new A.B();
//외부 클래스 인스턴스 필요?	필요함     	                        필요 없음
//static 메서드 안에서 사용	불가능	                            가능
