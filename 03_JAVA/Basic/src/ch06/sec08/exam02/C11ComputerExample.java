package ch06.sec08.exam02;

public class C11ComputerExample {
    public static void main(String[] args) {
    Computer myCom = new Computer();
    //Computer 객체 생성

    //sum() 메소드 호출 시 매개값 1, 2, 3 제공
    //합산 결과 리턴, result1 변수 대입
    int result1 = myCom.sum(1, 2, 3);
    System.out.println("result1: " + result1);

    //sum() 메소드 호출 시 매개값 1, 2, 3, 4, 5 제공
    //합산 결과 리턴, result2 변수 대입
    int result2 = myCom.sum(1, 2, 3, 4, 5);
    System.out.println("result2: " + result2);

    //sum() 메소드 호출 시 배열 제공
    //합산 결과 리턴, result3 변수 대입
    int[] values = { 1, 2, 3, 4, 5 };
    int result3 = myCom.sum(values);
    System.out.println("result3: " + result3);

    //sum() 메소드 호출 시 배열 제공
    //합산 결과 리턴, result4 변수 대입
    int result4 = myCom.sum(new int[] { 1, 2, 3, 4, 5 });
    System.out.println("result4: " + result4);
}
}
//result1: 6
//result2: 15
//result3: 15
//result4: 15