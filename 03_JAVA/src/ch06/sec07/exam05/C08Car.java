package ch06.sec07.exam05;

public class C08Car {
    //필드 선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    C08Car(String model){
    //생성자 호출
    this(model, "은색", 250);}


    C08Car(String model, String color)
    //생성자 호출
    {this(model, color, 250);}

    C08Car(String model, String color, int maxSpeed)
    {this.model = model;
     this.color = color;
     this.maxSpeed = maxSpeed;}
}

