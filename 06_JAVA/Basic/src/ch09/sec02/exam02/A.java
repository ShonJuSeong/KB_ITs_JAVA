package ch09.sec02.exam02;

public class A {
    //인스턴스 멤버 클래스
    class B {
        //인스턴스 필드
        int field1 = 1;
        // int : 정수형 타입.
        // field1 : B 객체가 가지는 변수. 객체마다 따로 존재.
        // field1 : 변수 이름. B 객체가 생성될 때 같이 생겨나는 인스턴스 필드
        // = 1 : 초기값 1을 줌.

        //정적 필드
        static int field2 = 2;
        //static: 클래스 전체에서 공유되는 변수.
        //int field2: 정수형 정적 필드.
        //모든 B 객체가 공유하는 하나의 값.

        //생성자
        B() {
            System.out.println("B-생성자 실행");
        }
        //B() : B 클래스가 객체로 생성될 때 자동으로 실행되는 코드.

        //인스턴스 메소드
        void method1() {
            System.out.println("B-method1 실행");
        } //method1 : B 객체가 사용할 수 있는 메소드.

        //정적 메소드
        static void method2() {
            System.out.println("B-method2 실행");
        }
        //static : 객체 없이도 클래스명으로 호출 가능.
        //method2 : B 클래스 자체에 속한 메소드.
    }
        //인스턴스 메소드
        void useB(){
            //B객체 생성 및 인스턴스 필드 및 메소드 사용
            //void: 리턴값 없음.
            //useB: A 클래스의 인스턴스 메소드.
            //내부에서 B 객체를 만들고 필드와 메소드를 사용함.

            B b = new B();
            //B: 내부 클래스 타입.
            //b: 변수 이름.
            //new B(): 새 B 객체를 생성.
            //이때 생성자 호출됨 → "B-생성자 실행" 출력.
            System.out.println(b.field1);
            b.method1();  //b.method1() : b 객체의 인스턴스 메소드 실행 → "B-method1 실행"

            //B 클래스의 정적 필드 및 메소드 사용
            System.out.println(B.field2);
            B.method2();
            //B.field2 : 클래스 이름으로 정적 변수 호출 (값: 2).
            //B.method2() : 클래스 이름으로 정적 메소드 호출 → "B-method2 실행"
    }
    }

//인스턴스 멤버 클래스   :    외부 클래스의 인스턴스가 있어야만 생성 가능한 내부 클래스
//인스턴스 필드/메소드   :    객체마다 다르게 존재함. 객체를 통해서만 사용 가능
//정적 필드/메소드	클래스 :   전체에서 공유됨. 클래스 이름으로 바로 사용 가능
//new B()             :   B 객체를 생성하며 생성자 실행됨
//System.out.println() :  콘솔에 값 출력하는 명령


//public class A {
//    class B {
//        int field1 = 1;
//        static int field2 = 2;
//        B() {
//            System.out.println("B-생성자 실행");
//        }
//        void method1() {
//            System.out.println("B-method1 실행");
//        }
//        static void method2() {
//            System.out.println("B-method2 실행");
//        }
//    }
//    void useB() {
//        B b = new B();
//        System.out.println(b.field1);
//        b.method1();
//        System.out.println(B.field2);
//        B.method2();
//    }
//}