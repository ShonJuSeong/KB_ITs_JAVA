package ch13.sec02.exam01;
// 멤버 변수 kind, model 제네릭으로 운영
// 각각의 멤버에 대해 Getter, Setter, 메서드를 직접 정의(Lombok사용 불가)

// 제네릭 타입으로 선언 //타입 파라미터로 K, M사용
public class Product <K, M>{
//Product 클래스는 제네릭 클래스
//<K, M>은 **타입 파라미터(type parameter)**로, 실제 사용 시 타입을 지정할 수 있도록 함
//예: Product<String, Integer>로 선언하면 K = String, M = Integer로 작동.
//K는 kind의 자료형, M은 model의 자료형을 의미

    //필드 // 타입 파라미터를 필드 타입으로 사용 // 멤버 변수(field)정의
    private K kind;
    private M model;
    //private으로 선언해서, 클래스 외부에서는 직접 접근할 수 없고, 반드시 getter/setter로 접근해야 함.
//K kind: kind 필드는 K 타입으로 설정
//M model: model 필드는 M 타입으로 설정


    //메소드
    public K getKind() { return this.kind;}
    public M getModel() { return this.model;}
    public void setKind(K kind) { this.kind = kind;}
    public void setModel(M model) { this.model = model;}
    //타입 파라미터를 리턴 타입과 매개 변수 타입으로 사용
    //타입에 따라 적절한 getter/setter 생성//타입은 코드 작성 시점이 아니라 실제 객체 생성 시점에 정해짐
}
