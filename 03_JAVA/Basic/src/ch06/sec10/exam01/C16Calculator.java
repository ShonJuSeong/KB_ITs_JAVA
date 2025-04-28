package ch06.sec10.exam01;

public class C16Calculator {
    static double pi = 3.14159;
    //static : 객체를 생성하지 않고도 사용 가능한 필드.
    //double : 소수점까지 표현 가능한 숫자 타입.
    //pi : 원주율을 나타내는 변수 이름.
    //= 3.14159; : pi 변수에 3.14159 값을 저장.
    static int plus(int x, int y) {
        //static : 객체 없이 바로 호출 가능한 메소드.
        //int : 결과로 정수 값을 리턴하겠다는 뜻.
        //plus : 메소드 이름 (더하기 기능).
        //(int x, int y) : 두 개의 정수 입력값을 받음.
        return x + y;
        //return : 결과를 돌려주겠다는 명령.
        //x + y : 입력된 두 숫자를 더한 결과를 돌려줌
    }
    static int minus(int x, int y) {
        //static : 객체 없이 바로 호출 가능.
        //int : 결과로 정수 값을 리턴.
        //minus : 메소드 이름 (빼기 기능).
        //(int x, int y) : 두 개의 정수 입력값을 받음.
        return x -y;
        //return : 결과를 돌려줌.
        //x - y : 입력된 두 숫자를 뺀 결과를 돌려줌.
    }
}
