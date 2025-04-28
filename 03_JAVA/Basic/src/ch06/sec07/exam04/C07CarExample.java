package ch06.sec07.exam04;

public class C07CarExample {
    public static void main(String[] args) {
        C06Car car1 = new C06Car();
        //디폴트 생성자(default constructor) 매개변수가 없는 생성자
        System.out.println("car1.company = " + car1.company);
        System.out.println("---------------------------------");
        C06Car car2 = new C06Car("자가용");
        System.out.println("car2.company = " + car2.company);
        System.out.println("car2.model = " + car2.model);
        System.out.println("---------------------------------");
        C06Car car3 = new C06Car("자가용", "빨강");
        System.out.println("car3.company = " + car3.company);
        System.out.println("car3.model = " + car3.model);
        System.out.println("car3.color = " + car3.color);
        System.out.println("---------------------------------");
        C06Car car4 = new C06Car("택시", "검정", 200);
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
/*
객체	    company	    model	color	maxSpeed
car1	현대자동차	null	null	0
car2	현대자동차	자가용	null	0
car3	현대자동차	자가용	빨강	    0
car4	현대자동차	택시  	검정	    200
 */


//**오버로딩(overloading)**은
//"이름은 같지만 매개변수만 다르게 여러 개 만드는 것" ➔ 같은 이름인데
// ➔ 매개변수 개수, 타입, 순서가 다르면
//➔ 여러 개 만들 수 있다!
// 이름은 다 C06Car인데,