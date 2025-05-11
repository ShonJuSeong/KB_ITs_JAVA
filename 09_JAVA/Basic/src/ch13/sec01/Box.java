package ch13.sec01;

public class Box <T>{
    public T content; //타입 파라미터로 T 사용 // content : 실제 데이터를 담을 공간
}
//파라미터는  **'값을 전달받기 위한 변수'**. 	메서드나 클래스에 전달되는 값이나 타입을 받는 변수

//<T>는 타입 파라미터라고 부르며, 나중에 사용할 때 실제 타입(String, Integer 등)으로 대체됨.
//예:
//Box<String>이면 → T는 String
//Box<Integer>이면 → T는 Integer