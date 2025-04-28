package ch06.sec07.exam05;

public class C09CarExample {
    public static void main(String[] args) {
    C08Car car1 = new C08Car("자가용");
    System.out.println("car1.company = " + car1.company);
    System.out.println("------------------------------------");

    C08Car car2 = new C08Car("자가용");
    System.out.println("car2.company = " + car2.company);
    System.out.println("car2.model = " + car2.model);
    System.out.println("------------------------------------");

    C08Car car3 = new C08Car("자가용", "빨강");
    System.out.println("car3.company = " + car3.company);
    System.out.println("car3.model = " + car3.model);
    System.out.println("car3.color = " + car3.color);
    System.out.println("------------------------------------");

    C08Car car4 = new C08Car("택시", "검정", 250);
    System.out.println("car4.company = " + car4.company);
    System.out.println("car4.model = " + car4.model);
    System.out.println("car4.color = " + car4.color);
        System.out.println("car4.maxSpeed = " + car4.maxSpeed);
    }

}

//car1.company : 현대자동차
//car2.company : 현대자동차
//car2.model : 자가용
//car3.company : 현대자동차
//car3.model : 자가용
//car3.color : 빨강
//car4.company : 현대자동차
//car4.model : 택시
//car4.color : 검정
//car4.maxSpeed : 200
