package ch06.sec07.exam03;
//Korean 클래스를 다음과 같이 정의했을 때,생성자에서 name, ssn필드를 초기화하세요.
public class C05Korean {
    // 필드선언
    String nation = "대한민국";
    String name;
    String ssn;

    //String nation = "대한민국";
    //nation 이라는 변수(=필드)를 만듦.
    //기본값으로 "대한민국" 을 넣어둠.
    //String name;
    //name 이라는 필드 만들었지만 아직 값은 없음.
    //String ssn;
    //ssn이라는 필드도 만들었는데 초기값 없음.
    //→ 즉,
    //nation은 무조건 "대한민국"이고,
    //name, ssn은 아직 모르니까 생성자에서 채워줘야 함.

    // 생성자선언
    public C05Korean(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;

        //this.name = name;
        //this.변수 = 매개변수 형태로 초기화하는 것.
        //왼쪽 this.name은 필드 (클래스가 들고 있는 값)
        //this.는 현재 객체를 의미함.
        //오른쪽 name은 생성자 매개변수 (() 안에 받은 값)
        //"받은 값을 이 클래스 안에 저장해라" 는 뜻.
        //this.ssn = ssn;
        //똑같음. 전달받은 ssn을 클래스 필드 ssn에 저장.
    }
}
//this는 "현재 객체 자기 자신"을 가리키는 특별한 키워드
//public C05Korean(String name, String ssn) {
//    this.name = name;
//    this.ssn = ssn;
//}
//name (오른쪽)은 생성자의 매개변수.
//this.name (왼쪽)은 객체의 필드.
//만약 this를 안 쓰고 그냥 name = name; 이렇게 하면? 👉 자바는 둘 다 매개변수 name으로 알아듣기 때문에, 필드에는 아무것도 안 들어감.

//구분	        설명
//this      	현재 객체(자기 자신)를 가리킨다
//필요한 경우	    매개변수와 필드 이름이 겹칠 때 구분하려고
//기본 개념	    "내 자신을 가리킨다


//this() : 같은 클래스 안에 있는 다른 생성자를 호출할 때도 쓸 수 있음!

//this는 "현재 객체 자기 자신"을 가리키는 키워드이고,
// 주로 매개변수와 필드 이름이 같을 때 정확하게 구분해서 값을 넣기 위해 쓴다.