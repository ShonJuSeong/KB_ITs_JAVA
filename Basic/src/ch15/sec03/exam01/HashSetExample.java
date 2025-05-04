package ch15.sec03.exam01;
import java.util.*;
//* : 와일드카드
//다음 프로그램의 결과를 적어보고, 실제 실행을 통해 결과를 확인하세요.

public class HashSetExample {
    public static void main(String[] args) {

        Set<String> set = new HashSet<String>();
        //Set은 인터페이스, HashSet 구현 클래스.
        //Set<String>: 문자열(String)만 저장할 수 있는 Set 컬렉션
        //new HashSet<String>(): 실제로 메모리에 저장 공간 만듦.
        //즉, set은 중복을 허용하지 않고, 순서가 없는 문자열 모음


        //객체 저장
        set.add("Java"); //set.add(...)는 값을 하나씩 저장하는 코드
        set.add("JDBC");  //Set은 중복을 자동으로 걸러냄
        set.add("Servlet/JSP");
        set.add("Java"); // set컬렉션은 중복된 것을 저장하지 않음. so, 이거 저장 안함.
        set.add("iBATIS");
        //저장된 객체 수 출력
        int size = set.size(); // int size : 저장되어 있는 전체 객체 수 리턴
        System.out.println("총 객체 수: " + size);
        //최종적으로 들어가는 값 : "Java", "JDBC", "Servlet/JSP", "iBATIS"
    }
}
//총 객체 수: 4


//특징	        Set	                   List
//중복 허용	    ❌ 불가	               ✅ 가능
//순서 보장	    ❌ 없음 (HashSet)	   ✅ 있음 (ArrayList)
//대표 클래스	    HashSet, TreeSet	   ArrayList, LinkedList