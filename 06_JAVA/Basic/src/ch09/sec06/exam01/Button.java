package ch09.sec06.exam01;
//다음 클래스 내부에 ClickListener 인터페이스를 정의하세요.
// ○ 인터페이스의 메서드는 void onClick() 하나 추가
public class Button {
    //정적 충첩 인터페이스
    public static interface ClickListener {
        //public	    외부에서 사용 가능
        //static	    정적(static) 중첩 인터페이스임. 클래스 이름으로 접근 가능
        //interface	    인터페이스를 정의함
        //ClickListener	인터페이스 이름 (클릭 이벤트를 감지하는 역할)

        //추상 메소드
        void onClick();
        //void     반환값이 없다는 뜻
        //onClick  메서드 이름. 클릭됐을 때 실행될 메서드 이름
        //();      매개변수 없음
    }
}

//✅ 인터페이스란?
//메서드의 껍데기(선언)만 정의하는 구조야.
//**실제 동작(구현)**은 이 인터페이스를 구현하는 클래스에서 작성함.
//예: 리모컨 설명서(인터페이스) vs 실제 리모컨(구현 클래스)