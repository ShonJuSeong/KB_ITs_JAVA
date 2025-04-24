package ch12.sec04;

public class MeasureRunTimeExample {
    public static void main(String[] args) {
    long Time1 = System.nanoTime(); //시작시간
    int sum = 0;
    for (int i = 1; i <=1000000; i++)
    {sum += i;}

    long Time2 = System.nanoTime(); //끝난 시간

        System.out.println("1~1000000의 합: " + sum);

        System.out.println("계산에 " + (Time2-Time1) + " 나노초가 소요되었습니다.");
    }
}
