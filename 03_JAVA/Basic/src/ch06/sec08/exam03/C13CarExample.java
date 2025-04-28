package ch06.sec08.exam03;

public class C13CarExample {
    public static void main(String[] args) {

        C12Car myCar = new C12Car();
//C12Car : 자동차 객체 타입.
//myCar : 새 객체 이름.
//new C12Car() : 새 C12Car 객체를 생성.
        myCar.setGas(5);
        //myCar 객체의 setGas 메소드 호출.
        //gas에 5를 넣음.
        if (myCar.isLeftGas()) {
             //myCar에 gas가 남아 있는지 확인.
            //true면 안의 코드 실행.
            System.out.println("출발합니다.");
            myCar.run();
        }
        System.out.println("gas를 주입하세요");
    }


}
//gas가 있습니다.
//출발합니다.
//달립니다.(gas잔량:5)
//달립니다.(gas잔량:4)
//달립니다.(gas잔량:3)
//달립니다.(gas잔량:2)
//달립니다.(gas잔량:1)
//멈춥니다.(gas잔량:0)
// gas를 주입하세요.

//this.gas 사용 이유 → 지역변수 gas와 구분하기 위해. (this가 없으면 헷갈림)
//while(true) 사용 이유 → 무한 주행하다가 gas가 0 되면 스스로 빠져나오기 위해.
//return 사용 이유 → 메소드 즉시 종료해서 불필요한 루프를 막기 위해.