package ch06.sec08.exam02;

public class Computer {
    //가변 길이 매개변수를 갖는 메소드 선언
    int sum(int ... values) {
        //sum변수 선언
        //메서드 이름: sum
        //리턴 타입: int (합산한 결과를 리턴)
        //매개변수: int ... values
        //"가변 길이 매개변수" 라고 부름.
        //➔ 매개값을 몇 개든 자유롭게 넘길 수 있게 해줌.
        //넘어온 값들은 배열처럼 다뤄짐!

        int sum = 0;
    //합계를 저장할 sum 변수 만들고 0으로 초기화.

        //values는 배열 타입의 변수처럼 사용
        for(int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        //values는 배열처럼 다룰 수 있어서,
        //반복문(for문) 돌면서 배열 안 모든 숫자들을 하나씩 합산.

        //합산 결과를 리턴
        return sum;
    }
}

// int ... values	가변 길이 매개변수 ➔ 배열처럼 사용
// sum	            합산 결과를 저장할 변수
// for문	        배열을 차례차례 돌면서 더함
// return	        최종 합계값을 돌려줌
