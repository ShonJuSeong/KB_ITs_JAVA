package ch06.sec10.exam01;

import ch06.sec08.exam01.Calculator;

public class C17CalculatorExample {
    public static void main(String[] args) {
        double result1 = 10 * 10 * C16Calculator.pi;  // 원의넓이
        //double result1 : 소수점 결과를 저장하는 변수 선언.
        //10 * 10 * C16Calculator.pi : 10 × 10 × 3.14159 계산. (원의 넓이 구하는 공식 반지름² × π)

        int result2 = C16Calculator.plus(10, 5); // 10, 5의합
        //int result2 : 정수 결과를 저장할 변수 선언.
        //C16Calculator.plus(10, 5) : 10과 5를 더한 결과 저장.

        int result3 = C16Calculator.minus(10, 5); // 10, 5의차
        //int result3 : 정수 결과를 저장할 변수 선언.
        //C16Calculator.minus(10, 5) : 10에서 5를 뺀 결과 저장.

        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);
    }
    }
