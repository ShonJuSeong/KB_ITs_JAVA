package ch15.sec03.exam02;

//앞에서 작성한 Member 클래스를 다음과 같이 운영하고, 올바르게 동작하는지 확인하세요.

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {

        //HashSet 컬렉션 생성
        Set<Member> set = new HashSet<Member>();

        //Member 객체 저장
        set.add(new Member("홍길동", 30));
        set.add(new Member("홍길동", 30));
        //set 중복 x 에 의해 2개 다 추가 x

        //저장된 객체 수 출력
        System.out.println("총 객체 수 : " + set.size());
    }
}
//출력 결과
//총 객체 수 : 1