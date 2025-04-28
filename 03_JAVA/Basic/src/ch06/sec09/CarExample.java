package ch06.sec09;

public class CarExample {
    public static void main(String[] args) {
        C15Car myCar = new C15Car("포르쉐");
        C15Car yourCar = new C15Car("벤츠");

        myCar.run();
        yourCar.run();
    }
}
