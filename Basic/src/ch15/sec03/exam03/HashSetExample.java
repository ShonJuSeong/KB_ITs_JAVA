package ch15.sec03.exam03;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {

        //HashSet 컬렉션 생성
        Set<String> set = new HashSet<String>();
//Set은 인터페이스, HashSet은 그 구현 클래스
        //set 특) 중복 허용 x, 순서 안지킴

        //객체 추가
        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Spring");

        //객체를 하나씩 가져와서 처리
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            //객체를 하나씩 가져오기
            String element = iterator.next();
            System.out.println( element);
            if(element.equals("JSP")){
                iterator.remove();} //현재 순회중인 요소 제거
        }
        //iterator.hasNext() → 다음 요소가 있는지 확인
        //iterator.next() → 다음 요소를 가져옴
        //"JSP"일 경우, iterator.remove()로 안전하게 제거

        System.out.println("--------------");

        //객체제거
        set.remove("JDBC");

        //객체를 하나씩 가져와서 처리
        for (String element : set) {
            System.out.println(element);
        }
        // Iterator 패턴으로 순회하며 각 요소를 출력하세요.

        // 향상된 for 문으로  순회하며 각 요소를 출력하세요.
    }
}