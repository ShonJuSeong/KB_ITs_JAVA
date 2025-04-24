package ch04.sec03;

public class B08SwitchCharExampleRE {
    public static void main(String[] args) {
        char grade = 'a';
//        char grade = 'b';
//        char grade = 'c';
        switch (grade) {
            case 'A', 'a' -> {
                System.out.println("우수회원입니다.");
            }
                case 'B', 'b' -> {
                        System.out.println("일반회원입니다.");
                }
                        default ->{
                            System.out.println("손님입니다.");
                        }
        }
        switch (grade) {
            case 'A', 'a' -> System.out.println("우수회원입니다.");
            case 'B', 'b' -> System.out.println("일반회원입니다.");
            default -> System.out.println("손님입니다.");
        }
    }
}

//○ A 또는 a인 경우 '우수 회원입니다.' 출력
//○ B 또는 b인 경우 '일반 회원입니다.' 출력
//○ 나머지의 경우 '손님입니다.' 출력