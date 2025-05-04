package ch15.sec04.exam01;

import java.util.HashMap;   //HashMap: 데이터를 키-값 쌍으로 저장하는 자료구조
import java.util.Iterator;  //Iterator: 데이터를 하나씩 꺼내는 도구
import java.util.Map;       //Map: HashMap의 인터페이스(설계도)
import java.util.Map.Entry; //Map.Entry: Map 안의 키와 값 한 쌍
import java.util.Set;       //Set: 중복을 허용하지 않는 집합 구조

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        //Map 컬렉션 생성(인터페이스..설계도)
        //Map<String, Integer> : 키(key)는 문자열(String), 값(value)은 정수(Integer)인 Map.
        //map : 변수 이름
        //new HashMap<>() : HashMap 객체 생성 / 실제 저장소를 만들기

        //객체 저장
        map.put("신용권", 85); //put(key, value)	데이터 저장
        map.put("홍길동", 90); //안보여요 //HashMap은 중복된 키를 허용하지 않기에.
        map.put("동장군", 80);
        map.put("홍길동", 95); // 중복된 것은 마지막 것만 저장
        System.out.println("총 Entry 수: " + map.size());
        //size()는 저장된 키-값 쌍의 개수를 반환 / 총 3개 출력
        System.out.println();
        //키로 값 얻기
        String key = "홍길동"; // 홍길동 이라는 key를 변수에 저장
        int value = map.get(key);   // 키를 매게값으로 주면 값을 리턴 // map.get("홍길동") → 95 반환
        System.out.println(key + ": " + value);
        System.out.println();

        //키 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
        Set<String> keySet = map.keySet();  //Map 안의 모든 키들을 Set으로 반환 //set- 중복 허용 X, 순서 뒤죽박죽
        Iterator<String> keyIterator = keySet.iterator();  //KeyIterator : Set을 하나씩 꺼낼 수 있는 반복자
        //키를 반복하기 위해 반복자를 얻음

        while (keyIterator.hasNext()) {
            // -> while 조건 true 일시 반복문 실행
            //keyIterator : set에 있는 것 하나씩 꺼냄
            // hasNext() : 꺼낼 값 있을 시(다음 요소 있을 시) true 반환
            String k = keyIterator.next(); //next() : 다음 값 꺼내기
            Integer v = map.get(k); //map.get(k) : 현재 키에 해당하는 값 꺼냄.
        System.out.println(k + " : " + v);}
        System.out.println();


        //엔트리 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
        Set<Entry<String, Integer>> entrySet = map.entrySet();
        //set선언/Entey의 key : String / Integer : value / Map 안의 모든 (키, 값) 쌍을 Entry 객체로 모은 Set
        // Set entrySet = map.entrySet();

        Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
        //엔트리를 반복하기 위해 반복자를 얻음
        //entrySet.iterator() : entrySet에 저장된 Entry들을 차례대로 꺼낼 수 있게 해주는 반복자 생성
        //entryIterator : 반복자를 저장할 변수 이름
        //"entrySet이라는 이름으로 키-값 쌍들을 묶고, 그걸 하나씩 꺼낼 수 있도록 반복자를 만듦."


        while (entryIterator.hasNext()) {
            Entry<String, Integer> entry = entryIterator.next();
            //entryIterator.next() : 다음 Entry 하나 꺼냄
            String k = entry.getKey(); // 키 꺼냄
            Integer v = entry.getValue(); //값 꺼냄
            System.out.println(k + " : " + v);
        }
        System.out.println();

        //키로 엔트리 삭제
        map.remove("홍길동"); //홍길동은 영영 사라짐.
        System.out.println("총 Entry 수: " + map.size());
                System.out.println();
    }
}
//총 Entry 수: 3
//
//홍길동: 95
//
//홍길동 : 95
//신용권 : 85
//동장군 : 80
//
//홍길동 : 95
//신용권 : 85
//동장군 : 80
//
//총 Entry 수: 2

//Map<K, V>	        키-값 저장
//put(K, V)	        저장
//get(K)	        조회
//remove(K)	        삭제
//keySet()	        키들만 반환
//entrySet()	    키-값 쌍 반환
//Iterator	        하나씩 꺼내는 도구
//while(hasNext())	반복 조건
//Entry.getKey()	키 꺼내기
//Entry.getValue()	값 꺼내기