package ch03.sec04;

public class A09AccuracyExample2 {
    public static void main(String[] args) {

        int apple = 1;
        int totalpiece = apple * 10;
        int number = 7;

        int result = totalpiece - number;

        System.out.println("10조각에서 남은 조각" + result);            //  1*10 - 7        = 3
        System.out.println("사과 1개에서 남은 양" + result/10.0);       //  (1*10 - 7) / 10 = 0.3
    }                                                                //  정수 연산으로 하면 정확한 값이 나옴.
}
