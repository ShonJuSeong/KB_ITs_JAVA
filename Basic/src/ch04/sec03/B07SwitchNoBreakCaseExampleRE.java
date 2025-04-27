package ch04.sec03;

public class B07SwitchNoBreakCaseExampleRE {
    public static void main(String[] args) {
        int time = 9;   // 10, 11 인 경우
        System.out.println("[현재시간: " + time + " 시]");
        switch(time) {
            case 8: System.out.println("출근합니다."); break;
            case 9: System.out.println("회의를 합니다."); break;
            case 10: System.out.println("업무를 봅니다."); break;
            default: System.out.println("외근을 나갑니다.");
        }
    }
}
