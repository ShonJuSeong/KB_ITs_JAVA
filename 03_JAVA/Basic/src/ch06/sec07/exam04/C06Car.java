package ch06.sec07.exam04;

public class C06Car {
    //필드선언 / 필드(Field) = 객체의 "속성" (변수처럼 저장)
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    //생성자 선언
    //객체 만들 때 처음 세팅해주는 특별한 메서드.
    //이름은 클래스 이름이랑 똑같음.
    //new 할 때 자동으로 호출
    // 생성자(Constructor) 선언
    //생성자란?
    //객체를 만들 때(new C06Car()) 자동으로 호출되는 "초기 설정" 메서드야.
    //이름은 무조건 클래스명이랑 같아야 함.
    //여러 개 만들면 상황에 따라 골라서 쓸 수 있음. (이걸 생성자 오버로딩이라고 해)
    C06Car() {
    }     //생성자-1
    C06Car(String model) {
    this.model = model;
    }

    C06Car(String model, String color){ //생성자3
        this.model = model;
        this.color = color;
    }
    C06Car(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
//- 매개변수가 없는 생성사(디폴트 생성자)
//- 매개변수로 model만 가지는 생성자
//- 매개변수로 model과 color를 가지는 생성자
//- 매개변수로 model, color, maxSpeed를 가지는 생성자

//C06Car(String model) {this.model = model;}
//this.model → 필드
//model → 매개변수

//디폴트 생성자	매개변수 없는 생성자. 없으면 자동생성 (단, 생성자 직접 만들면 직접 작성해야 함)
//생성자 오버로딩	같은 이름으로 매개변수 다르게 여러 생성자 만드는 것
//this 키워드	필드와 매개변수 이름이 같을 때 구분하는 데 필요
//생성자 체이닝	생성자 안에서 다른 생성자 호출 (this(...))
//기본값	값을 안 주면 타입별 기본값 자동 설정됨