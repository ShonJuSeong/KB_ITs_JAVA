package ch03.sec03;

public class A07OverflowUnderflowExample {
    public static void main(String[] args) {
        byte var1 = 125;
        for(int i=0; i<5; i++) { //{ }를 5번 반복 실행
            var1++; //++ 연산은 var1의 값을 1 증가시킨다.
            System.out.println("var1: " + var1);        //var1: 126/ var1:127 /var1: -128/ var1: -127 / var1: -126 //byte는 127초과시 오버플로우
        }
        System.out.println("-----------------------");
        byte var2 = -125;
        for(int i=0; i<5; i++) { //{ }를 5번 반복 실행
            var2--; //-- 연산은 var2의 값을 1 감소시킨다.
            System.out.println("var2: " + var2);        //var2: -126/var2: -127/var2: -128/var2: 127/var2: 126
        } // byte : -128 ~ 127
    }
}
