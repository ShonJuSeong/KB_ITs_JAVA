package ch06.sec08.exam01;

public class C10CalculatorExample {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
        //new Calculator() ➔ Calculator 객체를 하나 생성.
        //myCalc라는 변수에 그 객체를 담음.

        myCalc.powerOn();
        //powerOn() 메서드 호출.
        //출력: "전원을 ON 합니다."
        //myCalc가 가리키는 Calculator 객체의 powerOn() 메서드를 호출.
        //이 메서드는 그냥 "전원을 ON 합니다."를 출력만 하고,
        //리턴값은 없음 (void 메서드).

//Calculator 객체 생성
//리턴값이 없는 powerOn() 메소드 호출
        int result1 = myCalc.plus(5, 6);
        //plus(5, 6) 호출 ➔ 5 + 6 계산 ➔ 11 리턴.
        System.out.println("result1: " + result1);
        int x = 10;
        int y = 4;

        System.out.println("-----------------------------");

        double result2 = myCalc.divide(x, y);
        //x=10, y=4로 세팅.
        //divide(10, 4) 호출 ➔ 10 ÷ 4 ➔ 2.5 리턴.
        //result2에 2.5 저장.
        System.out.println("result2: " + result2);
        myCalc.powerOff();
        //출력 ( 메서드 호출)
    }
}
//전원을켭니다.
//result1: 11
//result2: 2.5
//전원을끕니다.