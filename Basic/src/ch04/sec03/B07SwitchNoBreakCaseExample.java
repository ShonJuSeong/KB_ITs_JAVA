package ch04.sec03;

public class B07SwitchNoBreakCaseExample {
    public static void main(String[] args) {
        int time = 9;   // 10, 11 인 경우
        System.out.println("[현재시간: " + time + " 시]");
        switch(time) {
            case 8: System.out.println("출근합니다.");
            case 9: System.out.println("회의를 합니다.");
            case 10: System.out.println("업무를 봅니다.");
            default: System.out.println("외근을 나갑니다.");
        }
    }
    }
//[현재시간: 9 시]
//회의를 합니다.
//업무를 봅니다.
//외근을 나갑니다.
