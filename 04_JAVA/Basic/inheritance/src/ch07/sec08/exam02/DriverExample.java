package ch07.sec08.exam02;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        Driver.drive(bus);
//        System.out.println(taxi);
//        System.out.println("버스가 달립니다.");
        Taxi taxi = new Taxi();
        Driver.drive(taxi);
//        System.out.println();
//        System.out.println("택시가 달립니다.");
    }
}
