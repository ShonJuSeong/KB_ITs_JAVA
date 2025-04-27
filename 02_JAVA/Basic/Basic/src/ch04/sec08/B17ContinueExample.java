package ch04.sec08;

public class B17ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10 ; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
// for문을 이용하여 1에서부터 10까지의 숫자를 출력하는데,
// if문과 continue 문을 사용하여 짝수만 출력하세요.
// 2 4 6 8 10