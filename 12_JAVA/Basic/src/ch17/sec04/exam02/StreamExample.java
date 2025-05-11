package ch17.sec04.exam02;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        //int,long,double값 이외에는 "객체 스트림"으로 생성됨.
        String[] strArray = {"홍길동","신용권","김미나"};
        Stream<String>strStream = Arrays.stream(strArray);
        strStream.forEach(item-> System.out.println(item+","));
        System.out.println();

        //마지막 ',' 제거를 위한 2가지 방법
        //1. stream + collectors.joining()
        //각 요소 사이에 ","를 넣고 하나의 문자열로 결합-자동으로 마지막 요소 뒤에 쉼표를 넣지 않음.
        String result = Arrays.stream(strArray).collect(Collectors.joining(","));
        System.out.println(result);

        //2.인덱스를 활용한 스트림 반복
        //조건문을 통해 마지막 요소인지 확인하고 쉼표 생략
        IntStream.range(0, strArray.length).forEach(i->{if(i==strArray.length -1){
            System.out.print(strArray[i]);
        }else{
            System.out.print(strArray[i] + ",");
        }});
        System.out.println();

        //int, long, double은 "기본 스트림"으로 생성됨.
        int[] intArray = {1,2,3,4,5};
        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(item-> System.out.println(item+","));
    }
}