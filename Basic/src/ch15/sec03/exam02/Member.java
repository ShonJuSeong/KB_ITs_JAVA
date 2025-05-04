package ch15.sec03.exam02;

//다음 Member 클래스를 Set에 저장하기위한 클래스로 수정하세요.

public class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
        //Member 객체가 생성될 때 name과 age 값을 받아 필드를 초기화함
        //this.name은 현재 객체의 name 필드
        //name은 파라미터, this.name은 필드
    }
    //hashcode 재정의
    @Override //부모 클래스(또는 Object 클래스)의 메서드를 자식 클래스에서 재정의
    public int hashCode() {
        //메서드는 객체의 고유한 정수 값(해시 코드) 를 반환
        return name.hashCode() + age;
    }//name과 age값이 같을 시 동일한 hashCode 반환함.

    // equals 재정의
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member target) {
            return target.name.equals(this.name) && (target.age == age);
        }else
            return false;
    }
}
