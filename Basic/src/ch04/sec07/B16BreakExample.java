package ch04.sec07;

public class B16BreakExample {
    public static void main(String[] args) {
        while (true) {
            int num = (int) (Math.random() * 6) +1;
            System.out.println(num);
            if (num == 6) {
                break;
            }
        }
    }
}
// 4
// 6
// 프로그램 종료