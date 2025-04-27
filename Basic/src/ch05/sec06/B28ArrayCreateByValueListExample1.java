package Basic.src.ch05.sec06;

public class B28ArrayCreateByValueListExample1 {
    public static void main(String[] args) {
        //배열 변수 선언, 배열 생성
        String[] season = { "Spring", "Summer", "Fall", "Winter" };
//String[]: 문자열들을 저장할 배열 타입. // season: 배열 이름. //=: 대입 연산자. 오른쪽 값을 왼쪽 변수에 저장.
//{ "Spring", "Summer", "Fall", "Winter" }: 문자열 4개를 배열로 묶음

        //배열 항목값 읽기
        System.out.println("season[0] : " + season[0]);
        System.out.println("season[1] : " + season[1]);
        System.out.println("season[2] : " + season[2]);
        System.out.println("season[3] : " + season[3]);

        System.out.println("------------------------------");
        //1번 인덱스 값 변경
        season[1] = "여름";
        System.out.println("season[1] : " + season[1]);
        System.out.println("------------------------------");
        //배열 변수 선언, 배열 생성
        int[] scores = { 83, 90, 87 };
//int[]: 정수(int)들을 저장하는 배열 타입 / scores: 배열 이름. / { 83, 90, 87 }: 세 개의 숫자를 가진 배열.

        //총합, 평균 구하기
        int sum = 0;
        //= 0: 초기값은 0으로 설정.
        for(int i = 0; i<3; i++){
        //i를 0으로 시작, / i가 3보다 작을 동안 반복, / 매번 i를 1씩 증가시킴.

        sum += scores[i];
        //sum = sum + scores[i]; 와 같음  / 현재 sum 값에 scores[i] 값을 더함.
        }
        System.out.println("총합 : " + sum);
        double avg = (double) sum / 3;
        //(double) sum: sum을 double 타입으로 강제 변환. (정수끼리 나누면 소수점 사라지니까 일부러 double로 변환함
        System.out.println("평균 : " + avg);
    }
}


//season[0] : Spring
//season[1] : Summer
//season[2] : Fall
//season[3] : Winter
//총합 : 260
//평균 : 86.66666666666667
