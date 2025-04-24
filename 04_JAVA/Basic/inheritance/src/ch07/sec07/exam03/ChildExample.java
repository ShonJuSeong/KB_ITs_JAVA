package ch07.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.field1 = "data1";
        parent.method1();
        parent.method2();

//        parent.field2 = "data2";
//        parent.method3();
        // 자식은 부모의 필드와 메소드를 선언된 것만 사용해야 한다.
        //아래처럼 강제로 자식타입으로 변환하기 전에는 사용할 수 없다.
        Child child = (Child) parent;
        child.field2 = "data2";
        child.method3();
    }
}
