package ch03.sec04;

public class A08AccuracyExample1 {
    public static void main(String[] args) {
        int apple = 1;
        double pieceUnit = 0.1;
        int number = 7;
        double result = apple -number*pieceUnit;
        System.out.println("사과 1개에서 남은 양: " + result); // 1-0.7=0.3 (x)
                                                            // 사과 1개에서 남은 양: 0.29999999999999993
                                                            // ->부동 소수점 방식을 사용하는 실수타입에서 일어나기 때문.

     }
}
