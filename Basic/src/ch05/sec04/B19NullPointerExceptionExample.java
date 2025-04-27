package ch05.sec04;

public class B19NullPointerExceptionExample {
    public static void main(String[] args) {
//        int[] intArray = null; // 배열에 아무 배열 생성 x
//        intArray[0] = 10; // 없는 배열에 접근
        String str = null;  //문자열에 null. 객체가 아닌 것에 null값
//        System.out.println("총 문자 수: " + str.length()); //없는 객체에 메서드 호출 시도
    }
}