package ch04.sec03;

public class B06SwitchExample {
    public static void main(String[] args) {
        int num = (int)(Math.random()*6) +1;
        switch (num) {
            case 1 :
                System.out.println(num + "번이 나왔습니다.");
                break;
        case 2 :
        System.out.println(num + "번이 나왔습니다.");
        break;
            case 3 :
                System.out.println(num + "번이 나왔습니다.");
                break;
            case 4 :
                System.out.println(num + "번이 나왔습니다.");
                break;
            case 5 :
                System.out.println(num + "번이 나왔습니다.");
                break;
            default:
                System.out.println(num + "번이 나왔습니다.");
//                break;

        }
    }
}
