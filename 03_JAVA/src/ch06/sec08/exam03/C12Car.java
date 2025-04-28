package ch06.sec08.exam03;

public class C12Car {
    int gas;
    // 리턴값이 없는 메소드로 매개값을 받아서 gas 필드값을 변경
    void setGas(int gas) {
        //void : 이 메소드는 리턴값이 없음.
        //setGas : 메소드 이름. gas를 '설정'하는 함수.
        //(int gas) : 호출할 때 정수(int) 타입 하나를 입력 받음.
    this.gas = gas;
    //this.gas : 현재 객체(C12Car)의 gas 필드.
    //= gas : 입력 받은 매개변수 값을 현재 객체의 gas 필드에 저장.
    }

    // 리턴값이 boolean인 메소드로 gas 필드값이 0이면 false를,
    // 0이 아니면 true를 리턴
    // 리턴하기전 조건에 따라 "gas가 없습니다" 또는 "gas가 없습니다" 출력
        boolean isLeftGas() {
        //boolean : true 또는 false를 리턴하는 메소드.
        //isLeftGas : 'gas가 남아 있는지' 확인하는 함수.
        if(gas == 0){
        //if : 조건문. (만약에)
        //gas == 0 : gas가 0과 같으면.
            System.out.println("gas가 없습니다.");
            return false ;
            //return : 메소드 결과를 호출한 곳에 반환.
            //false : gas가 없으니 false 반환.
        }
        System.out.println("gas가 있습니다");
        return true;
     //gas가 있으니 true를 반환.
    }
    void run() {
        while(true) {
            //while(true) : 무조건 계속 반복하는 무한루프.
            if(gas > 0) {
                System.out.println("달립니다.(gas잔량 : " + gas + " ) ");
                gas -= 1;
                //gas를 1만큼 감소시킨다. (gas = gas - 1과 같음)
            }else {
                System.out.println("멈춥니다. (gas잔량 : " + gas + " ) ");
                return;//메소드 종료
                //메소드 run을 즉시 종료.
            }
        }
    }
    // 무한 루프를 돌면서 루프를 한 번 돌 때마다 gas의 값은 1 감소
// 주행이 가능한 상태라면 "달립니다.(gas잔량: xxx)" 출력
// 주행할 수 없는 상태라면 "멈춥니다.(gas잔량: xxx)" 출력 후 메소드를 종료
    }
