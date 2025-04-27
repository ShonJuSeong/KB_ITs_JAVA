package ch07.sec07.exam01;
class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}

// D -> B -> A
// E -> C -> A

public class PromotionExample {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a1 = b;
        A a2 = c;
        A a3 = d;
        A a4 = c;
        B b1 = d;
        C c1 = e;
//상속관계에서 자동 타입변환


//        B b3 = e;
//        C c2 = d;
        //B와 E, C와 D는 상관없는 관계니, 컴파일 오류.
    }
}
