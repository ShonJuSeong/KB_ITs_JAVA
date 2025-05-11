package ch09.sec06.exam03;
//다음 클래스 내부에 ClickListener 인터페이스를 정의하세요.
// ○ 인터페이스의 메서드는 void onClick() 하나 추가
public class Button {
    //정적 멤버 인터페이스
public static interface ClickListener {
    //추상 메소드
    void onClick();
    }


//필드
private ClickListener clickListener;

//메소드
public void setClickListener(ClickListener clickListener) {
    this.clickListener = clickListener;
}

//Button 이 클릭되었을 때 실행하는 메소드 선언
public void click() {
    this.clickListener.onClick();
    }
}

//✅ 인터페이스란?
//메서드의 껍데기(선언)만 정의하는 구조야.
//**실제 동작(구현)**은 이 인터페이스를 구현하는 클래스에서 작성함.
//예: 리모컨 설명서(인터페이스) vs 실제 리모컨(구현 클래스)