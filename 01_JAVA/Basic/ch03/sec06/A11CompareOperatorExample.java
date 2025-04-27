package ch03.sec06;

public class A11CompareOperatorExample {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;
        boolean result1 = (num1 == num2);
        boolean result2 = (num1 != num2);
        boolean result3 = (num1 <= num2);
        System.out.println("result1: " + result1);  //true
        System.out.println("result2: " + result2);  //false //무조건 반대 값 출력
        System.out.println("result3: " + result3);  //true
        char char1 = 'A';
        char char2 = 'B';
        boolean result4 = (char1 < char2);          //65 < 66 //boolean 은 참/거짓판명하는 자료형
        System.out.println("result4: " + result4);  // true
        int num3 = 1;
        double num4 = 1.0;
        boolean result5 = (num3 == num4);           // 인트/더블 비교시 인트가 자동으로 더블로 변환
        System.out.println("result5: " + result5);  // true
        float num5 = 0.1f;
        double num6 = 0.1;
        boolean result6 = (num5 == num6);           //
        boolean result7 = (num5 == (float)num6);    //
        System.out.println("result6: " + result6);  // false /---> 0.1f는 잘린값, 0.1은 정확한 값. 즉 같지 않음
        System.out.println("result7: " + result7);  // true  / num6을 강제로 float화 시켰으니 같아짐.
        String str1 = "자바";
        String str2 = "Java";
        boolean result8 = (str1.equals(str2));      //
        boolean result9 = (! str1.equals(str2));    //
        System.out.println("result8: " + result8);  // false    /애당초 영어/한글이 다르니...
        System.out.println("result9: " + result9);  // true
    }
}
//  동등비교 == 값 같은지 검사
//  동등비교 != 값 다른지 검사
//  크기비교 >  큰지 검사
//  크기비교 >= 크거나 같은지 검사
//  크기비교 <  작은지 검사
//  크기비교 <= 작거나 같은지 검사
// A = 65 / B = 66