package Basic.src.ch05.sec05;

public class B27SplitExample {

    public static void main(String[] args) {
    String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";

    //문자열 분리
    String[] tokens = board.split(",");
//String[]: 문자열 배열. 여러 개의 문자열을 저장할 수 있음.
//tokens: 배열 변수 이름.
//=: 대입 연산자.
//board.split(","): board라는 문자열을 ,(콤마)를 기준으로 나눔. 결과는 여러 개의 문자열이니까 배열에 저장.


    //인덱스별로 묶기
        System.out.println("번호 " +  tokens[0]);
        //tokens[0]: 배열의 첫 번째 요소. (인덱스 0) → "1"이라는 값.
        System.out.println("제목 " +  tokens[1]);
        //tokens[1]: 배열의 두 번째 요소. (인덱스 1) → "자바 학습".
        System.out.println("내용 " +  tokens[2]);
        System.out.println("이름 " +  tokens[3]);
        System.out.println();
//for문으로 출력하기
        for(int i = 0; i<tokens.length; i++) {
            System.out.println(tokens[i]);
//for: 반복문 시작.
//(int i = 0; i<tokens.length; i++): 세미콜론(;)으로 구분된 세 가지.
//int i = 0: i를 0으로 초기화.
//i<tokens.length: i가 배열 길이보다 작을 동안 반복.
//i++: 반복할 때마다 i를 1씩 증가시킴.
//for문으로 배열에 들어있는 모든 조각을 한 줄씩 출력한다.
//System.out.println("번호 " + tokens[0]);
//System.out.println("제목 " + tokens[1]);
//System.out.println("내용 " + tokens[2]);
//System.out.println("이름 " + tokens[3]);
//을 한줄로 요약 한 코드
}

    }
}
//boad의 문자열을 ','를 찾아 분리하여 결과를 아래와 같이 출력하고,
//for문을 이용하여 출력하세요.
//번호: 1
//제목: 자바 학습
//내용: 참조 타입 String을 학습합니다.
//성명: 홍길동
//1
//자바 학습
//참조 타입 String을 학습합니다.
//홍길동