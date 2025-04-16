package ch03.sec10;

public class A12AssignmentOperatorExample {
    public static void main(String[] args) {
        int result = 0;
        result += 10;
        System.out.println("result1=" + result); // 10
        result -= 5;
        System.out.println("result2=" + result); // 5
        result *= 3;
        System.out.println("result3=" + result); // 15
        result /= 5;
        System.out.println("result4=" + result); // 3
        result %= 3;
        System.out.println("result5=" + result); // 0
    } //위부터 차근차근 내려옴.
}
