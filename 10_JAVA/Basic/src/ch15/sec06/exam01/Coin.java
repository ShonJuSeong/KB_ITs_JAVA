package ch15.sec06.exam01;
//롬복을 이용하여 다음 클래스를 완성하세요.
//Lombok은 코드를 자동으로 생성해주는 도구
// 개발자가 일일이 getter, setter, toString()
// 같은 반복 코드를 안 써도 되게 해줌.

// 전체 매개변수 생성자
// value에 대한 Getter

import lombok.Getter;
@Getter

public class Coin {
        //getValue() 메서드는 생략
        private int value; // 동전 금액 저장

        public Coin(int value) {
                this.value = value;
        } //생성자 (constructor)//new Coin(100)을 하면
        // 이 생성자가 호출되어 value에 100이 저장
        public int getValue(){
                return value;
        }
        //value 값을 가져올 수 있는 Getter 메서드
        // @getter 어노테이션으로인해 생략해도 ㄱㅊ
}
