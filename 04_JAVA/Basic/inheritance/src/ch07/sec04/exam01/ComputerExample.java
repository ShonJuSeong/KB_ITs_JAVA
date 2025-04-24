package ch07.sec04.exam01;

public class ComputerExample {
    public static void main(String[] args) {
        int r = 10;
        Calculator calculator = new Calculator();
        System.out.println("원면적" + calculator.areaCircle(r));
        System.out.println();

        Computer computer = new Computer();
        System.out.println("원면적" + computer.areaCircle(r));

    //오버라이딩 재정의 를 통해 더 자세한 값을 표현 할 수 있음을 보여줌.
    }
}
