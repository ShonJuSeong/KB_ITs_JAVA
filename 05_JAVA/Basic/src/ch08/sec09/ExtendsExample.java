package ch08.sec09;

public class ExtendsExample {
    public static void main(String[] args) {
        InterfaceCImpl impl = new InterfaceCImpl();
        //InterfaceCImpl 객체를 하나 만든다.
        //impl이라는 이름의 참조변수에 담는다.

        InterfaceA ia = impl;
        ia.methodA();
//        ia.methodB();
        //InterfaceA 타입으로 변수를 하나 선언하고 impl을 대입한다.
        //(다형성: 자식 객체를 부모 타입에 담을 수 있음)
        //ia는 InterfaceA 타입이라서 methodA()만 호출할 수 있다.
        //그래서 methodA()만 호출하고, methodB()는 주석처리했어.
        //(InterfaceA에는 methodB() 없음.)
        System.out.println();

        InterfaceB ib = impl;
        //이번엔 InterfaceB 타입 변수 ib를 선언하고 impl 대입.
//        ib.methodA();
        ib.methodB();
        //InterfaceB 타입이라서 methodB()만 호출할 수 있다.
        //그래서 methodB() 호출.
        //methodA()는 InterfaceB에 없기 때문에 호출 불가(주석처리).
        System.out.println();

        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
        //InterfaceC 타입으로 변수 ic를 선언하고 impl을 대입.
        //InterfaceC는
        //InterfaceA도 상속받고,
        //InterfaceB도 상속받았으니까,
        //methodA(), methodB(), methodC()를 전부 다 호출할 수 있다!
    }
}
//이름	            역할	                                        특징
//인터페이스A	        메서드A()	                                하나의 기능만 강제
//인터페이스B	        방법	                                        하나의 기능만 강제
//인터페이스	        InterfaceA, InterfaceB를 상속받은 인터페이스	방법
//인터페이스	        InterfaceC를 구현한 클래스	                    세 개의 메소드(methodA, methodB, methodC) 모두 구현
//내선	            테스트용 main 클래스	                        인터페이스A, 인터페이스B, 인터페이스

//실행 흐름 요약
//InterfaceCImpl 객체를 만든다.
//InterfaceA 타입으로 바라보면 methodA()만 호출 가능.
//InterfaceB 타입으로 바라보면 methodB()만 호출 가능.
//InterfaceC 타입으로 바라보면 methodA(), methodB(), methodC() 모두 호출 가능.