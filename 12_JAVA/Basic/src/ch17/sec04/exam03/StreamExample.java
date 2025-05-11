package ch17.sec04.exam03;

import java.util.stream.IntStream;

public class StreamExample {
    public static int sum; //합계를 구하기 위한 변수
    //main에서 sum 메서드를 사용하려면 static이 동일해야함

    public static void main(String[] args) {
//        방법 1: 외부에 선언한 정적 변수 sum에 값 누적
//        IntStream stream = IntStream.rangeClosed(1,100);
//        stream.forEach(a->sum+=a);
//        System.out.println("총합: "+ sum);

//        방법 2: 스트림 자체에서 sum() 메서드로 합계 계산
//        int sum = IntStream.rangeClosed(1,100).sum();
//        System.out.println("총합: "+ sum);

//        방법 3:reduce()와 메서드 참조를 이용한 합계 계산
//              reduce() : 누적(축소) 연산을 수행하는 종단 연산
        int sum = IntStream.rangeClosed(1, 100)
                .reduce(Integer::sum)//Integer.sum(a,b): 두 값을 더함. 누적 계산 수행
                .getAsInt(); //형변환
        System.out.println("총합: "+ sum);

    }
}