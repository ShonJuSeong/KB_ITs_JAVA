package ch15.sec06.exam01;


//스택을 이용하여 다음 순서대로 추가하고, 스택이 빌 때까지 하나씩 뽑으면서 해당 요소를 출력하세요.
//추가 순서 Coin 100, 50, 500, 10


import java.util.Stack; //Stack은 후입선출 (LIFO: Last-In, First-Out) 구조

public class StackExample {
    public static void main(String[] args) {
        //Stack 컬렉션 생성
        Stack<Coin> coinBox = new Stack<Coin>();
        //Coin 객체만 담는 스택(coinBox)생성
        //제네릭을 통해 타입 안정성 확보 : 다른 타입 못넣음
        // 제네릭 : Stack클래스가 coin 제네릭 타입으로 정의
        // 타입 안정성/형변환 불필요


        //동전 넣기
        coinBox.push(new Coin(100)); //push()는 스택에 데이터를 위에서 쌓는 메서드
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(500));
        coinBox.push(new Coin(10));


        //동전을 하나씩 꺼내기
        while(!coinBox.isEmpty()){
            // coinBox.isEmpty()는 스택이 비었는지 확인
            // 비어있지 않다면 반복을 계속
            //! 는 논리부정자
            // 스택이 비어있는지 확인 -> 스택이 비어있지 않을 때 반복(while)
            Coin coin = coinBox.pop();  //스택에서 가장 마지막에 들어간 Coin 객체 꺼내서 반환, 꺼낸 객체는 제거(pop)
            System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
        }
    }
}
//꺼내온 동전 : 10원 (뒤부터 호출됨)
//꺼내온 동전 : 500원
//꺼내온 동전 : 50원
//꺼내온 동전 : 100원
//  ↑ LIFO 구조
