package ch09.sec03.exam02;

public class AExample {
    public static void main(String[] args) {
    //B 객체 생성 및 인스턴스 필드 및 메소드 사용
        A.B b = new A.B();
        //new A.B(): 새로운 B 객체 생성
        //생성자 실행됨 → 출력: B-생성자 실행
        System.out.println(b.field1);
        //b.field1: B 객체 b의 인스턴스 필드 → 값: 1
        //출력: 1
        b.method1();
        //B 객체 b의 메서드 실행
        //결과: "B-method1 실행" 출력


        //B 클래스의 정적 필드 및 메소드 사용
        System.out.println(A.B.field2);
        //클래스 이름으로 바로 접근 → 정적 필드
        //값: 2
        //출력: 2
        A.B.method2();
        //클래스 이름으로 정적 메서드 호출
        //실행 결과: "B-method2 실행" 출력
    }
}
//B-생성자 실행
//1
//B-method1 실행
//2
//B-method2 실행