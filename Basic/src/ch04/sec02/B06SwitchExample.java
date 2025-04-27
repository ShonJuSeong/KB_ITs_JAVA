package ch04.sec02;

public class B06SwitchExample {
    public B06SwitchExample() {
    }

    public static void main(String[] args) {
        int num = (int)(Math.random() * (double)6.0F) + 1;
        switch (num) {
            case 1 -> System.out.println(num + "번이 나왔습니다.");
            case 2 -> System.out.println(num + "번이 나왔습니다.");
            case 3 -> System.out.println(num + "번이 나왔습니다.");
            case 4 -> System.out.println(num + "번이 나왔습니다.");
            case 5 -> System.out.println(num + "번이 나왔습니다.");
            default -> System.out.println(num + "번이 나왔습니다.");
        }

    }
}
