package Basic.src.ch05.sec06;

public class B31ArrayLengthExample {
    public static void main(String[] args) {
        //배열 변수 선언, 배열 대입
        int[] scores = {84, 90, 96};

        //배열 항목의 총합 구하기
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            //반복문 for
            //i = 0 : i를 0부터 시작.
            //i < scores.length : scores 배열의 길이(length)보다 작을 때까지 반복.
            //scores.length는 3이 (84, 90, 96 → 3개)
            //i++ : 반복할 때마다 i를 1씩 늘림.
            sum += scores[i];
        }
        System.out.println("총합 : " + sum);

        //배열 항목의 평균 구하기
        double avg = (double)sum / scores.length;
        System.out.println("평균 : " + avg);

        }
    }




//정수 요소 84, 90, 96을 가지는 배열이 있을 때, 총합과 평균을 구해 출력하세요