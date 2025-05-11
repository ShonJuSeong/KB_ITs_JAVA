package ch17.sec03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {
    public static void main(String[] args) {
        // Student 객체들을 요소로 갖는 list 생성
        List<Student> list = Arrays.asList(

                //데이터 저장
                new Student("홍길동", 10),
                new Student("신용권", 20),
                new Student("유미선", 30)
        ); //list

//        //방법 1 : 중간 변수 사용
//        //Student 객체 스트림 생성
//        Stream<Student>studentStream = list.stream();
//        //Student -> 점수(int)로 변환(mapToInt 사용)
//        IntStream scoreStream = studentStream.mapToInt(student->student.getScore());
//        //점수 평균 계산
//        double avg = scoreStream.average().getAsDouble();
//        System.out.println("평균점수: " + avg);

        //방법 2 : 스트림 파이프라인을 한 줄로 연결하여 처리
        //1)list.stream() : 리스트로부터 스트림 생성


        double avg = list.stream()
                //각 Student 객체를 점수(int)로 변환
                .mapToInt(student->student.getScore())
                //점수 평균 계산(OptionalDouble 반환)
                .average()
                //OptionalDouble에서 실제 double 값 추출
                .getAsDouble();
        System.out.println("평균 점수: "+ avg);
    }

}