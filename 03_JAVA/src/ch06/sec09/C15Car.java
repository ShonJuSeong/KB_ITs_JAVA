package ch06.sec09;

public class C15Car {
    //필드 선언
    String model;
    int speed;

    //생성자 선언
    C15Car(String model) {
        this.model = model;
    }
        //메소드 선언
        void setSpeed(int speed){
            this.speed = speed;
        }
    void run(){
        this.setSpeed(100);
        System.out.println(this.model + "가 달립니다. " + "(시속 : " + this.speed + "km/h)");
    }

}

// - model 필드는 생성자로 초기화
// - speed 필드의 getter/setter 메서드 정의
// - run() 메서드 호출 시 다음과 같이 출력
// === xxx(model 값)가 달립니다. (시속:yyy(speed 값)km/h)
// car 클래스 올바른 동작하는지 확인