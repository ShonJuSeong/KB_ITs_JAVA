package ch16.sec04;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        //실행문이 두 개 이상일 경우
        person.action((x,y)->{
            double result = x+y;
            return result;
        });
        // sum() 메서드를 호출
//        person.action((x,y)->{
//            return sum(x,y); //return문 하나만 있을 경우 생략 가능
        person.action((x,y)->sum(x,y));
    }
    public static double sum(double x, double y) {
        return (x + y);
    }

}