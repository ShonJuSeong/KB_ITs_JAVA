package ch16.sec01;

public class LambdaExample {
    public static void main(String[] args) {
        action((x,y)->{
            // x + y 계산
            int result = x+y;
            System.out.println("result: "+result);
            // x – y 계산
            int result2 = x-y;
            System.out.println("result2: "+result2);
        });
    }
    public static void action(Calculable calculable) {
        //데이터
        int x = 10;
        int y = 4;
        //데이터 처리
        calculable.calculate(x, y);
    }
}