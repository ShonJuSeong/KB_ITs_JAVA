package ch05.sec05;

public class B21EmptyStringExample {
    public static void main(String[] args) {
    String hobby = "";
    if(hobby.equals("")) {
        System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자열");
    }
}
}
//hobby 변수가 참조하는 String 객체는 빈 문자열