package ch17.sec01;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        //Set 컬렉션 생성
        //중복 제거
        Set<String>set = new HashSet<>();
        set.add("홍길동");
        set.add("신용권");
        set.add("감자바");

        //Stream을 이용한 요소 반복 처리
        //set 객체에서 stream() 메서드를 호출해서 Stream을 얻는다.
        Stream<String>stream = set.stream();
        stream.forEach(name->System.out.println(name));

    }
}