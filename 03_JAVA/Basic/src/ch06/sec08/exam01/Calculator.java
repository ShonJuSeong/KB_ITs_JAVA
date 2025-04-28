package ch06.sec08.exam01;

public class Calculator {
    //리턴값 없는 메소드 선언
    void powerOn(){
        System.out.println("전원을 ON 합니다.");
    }
    //리턴값 없는 메소드 선언
    void powerOff(){
        System.out.println("전원을 OFF 합니다.");
    }
    // 호출 시 두 정수 값을 전달 받고
    //호출한 곳으로 결과값 int를 리턴하는 메소드 선언
    int plus(int x, int y) {
        int result = x + y;
        return result; // 리턴 값 지정
    }
    //호출할 때 두 개의 정수를 넘겨받음.
    //두 수를 더해서 result에 저장하고,
    //결과를 리턴함 (돌려줌).
    //리턴 타입은 int (정수).


    //호출 시 두 정수 값을 전달 받고
    // 호출 한 곳으로 결과값 double을 리턴하는 메소드 선언
    double divide(int x, int y){
        double result = (double) x / (double)y;
        return result;
    }
    //호출할 때 두 개의 정수를 넘겨받음.
    //(double)로 형변환해서 나누기 함 ➔ 소수점까지 계산하려고.
    //결과를 리턴함.
    //리턴 타입은 double (실수).
}
