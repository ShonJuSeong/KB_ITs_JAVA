package ch08.sec09;

public interface InterfaceC extends InterfaceA, InterfaceB {
    void methodC();
}
//InterfaceC는 InterfaceA와 InterfaceB를 상속(extends) 받았어.
//즉,
//InterfaceC는 methodA()도 가지고,
//methodB()도 가지고,
//추가로 자기 메소드 methodC()도 가진다.
//결론:
//InterfaceC를 구현하는 클래스는
//methodA(), methodB(), methodC() 세 개를 모두 만들어야 한다.