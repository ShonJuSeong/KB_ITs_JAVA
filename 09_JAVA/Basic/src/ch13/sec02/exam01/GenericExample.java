package ch13.sec02.exam01;

public class GenericExample {
    public static void main(String[] args) {
        //K는 Tv로 대체, M은 String으로 대체
    Product<Tv, String> product1 = new Product<>();
    //Tv 타입(kind)과 String 타입(model)을 갖는 제네릭 클래스 사용 //product1: 변수 이름

    //Setter 매개값은 반드시 Tv와 String을 제공
        product1.setKind(new Tv());  //setKind: kind 필드에 값을 넣는 메서드 호출 // new Tv(): Tv 객체 생성해서 넣음
        product1.setModel("스마트Tv");

        //Getter리턴 값은 Tv와 String이 됨
        Tv tv = product1.getKind();  // product1.getKind()는 Tv 타입 반환하므로 Tv tv에 대입
        String tvModel = product1.getModel(); //은 문자열 반환 → String 변수에 저장
        //-------------------------------------

        //K는 Car로 대체, M은 String으로 대체
        Product<Car, String> product2 = new Product<>(); //Car 타입을 kind로, String을 model로 사용하는 제네릭 객체 생성

        //Setter 매개값은 반드시 Car와 String을 제공
        product2.setKind(new Car());  //Car 객체 생성해서 kind에 저장
        product2.setModel("SUV자동차"); //문자열 "SUV자동차"를 model에 저장

        //Getter 리턴값은 Car와 String이 됨
        Car car = product2.getKind();  //product2의 kind 값을 가져와서 Car 타입 변수에 저장
        String carModel = product2.getModel();  //product2의 model 값을 가져와서 문자열 변수에 저장
    }
}
