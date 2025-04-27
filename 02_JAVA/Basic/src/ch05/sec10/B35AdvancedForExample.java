package Basic.src.ch05.sec10;
//향상된 for문을 이용하여 scores 배열의 점수 총합과 평균 점수를 출력하세요.
public class B35AdvancedForExample {
    public static void main(String[] args) {

        //배열 변수 선언, 배열 생성
        int[] scores = { 95, 71, 84, 93, 87 };
        //정수형 배열 scores 선언.
        //값은 95, 71, 84, 93, 87.
        //배열 크기는 5.

        //배열 항목 전체 합 구하기
        int sum = 0;
        //총합 저장할 변수 sum 선언.
        //초기값 0.

        for( int score : scores){sum = sum + score;} // 5개 항목이 한 번 씩 score 변수에 저장, sum 누적(반복 5회)
        System.out.println("점수 총합 : " + sum);
        //scores 배열 안의 값 하나씩 꺼냄.
        //꺼낸 값은 임시 변수 score에 저장.
        //score 값을 sum에 계속 누적.
        //반복 흐름:
        //1회 : score = 95 → sum = 0 + 95 → sum = 95
        //2회 : score = 71 → sum = 95 + 71 → sum = 166
        //3회 : score = 84 → sum = 166 + 84 → sum = 250
        //4회 : score = 93 → sum = 250 + 93 → sum = 343
        //5회 : score = 87 → sum = 343 + 87 → sum = 430

        double avg = (double)sum / scores.length;
        System.out.println("점수 평균 : " + avg);

        //평균 구함.
        //sum을 double 타입으로 변환해서 소수점 계산 가능하게 함.
        //scores.length = 5.
        //430 ÷ 5 = 86.0

    }
}
//점수 총합 : 430
//점수 평균 : 86.0