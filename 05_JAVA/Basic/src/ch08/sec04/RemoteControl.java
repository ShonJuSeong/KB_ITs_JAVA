package ch08.sec04;

public interface RemoteControl {
    //상수 필드
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    //추상 메소드
    //"이름만 있고, 내용(몸통)은 없는 메소드"
    //메소드 선언부만 있고, {} 중괄호가 없이 끝나는 메소드.
    //대신 abstract 키워드를 붙여야
    //목적 = "자식 클래스가 반드시 이 메소드를 완성해라!" 강제하는 것.
    void turnOn();
    void turnOff();
    void setVolume(int volume);
//RemoteControl은 인터페이스야.
//인터페이스는 "설계도" 같은 거야.
//"RemoteControl을 구현하는 클래스는 반드시 turnOn, turnOff, setVolume을 구현해야 한다" 라고 강제하는 역할이야.

//디폴트 메소드
    //인터페이스 안에서도 기본 실행 내용을 가진 메소드를 만들 수 있게 한 것.
    default void setMute(boolean mute){
        if(mute){
            System.out.println("무음 처리합니다.");
            //추상 메소드 호출하면서 상수 필드 사용
            setVolume(MIN_VOLUME);
            //setVolume 메소드를 이용해서 볼륨을 0으로 만든다.
        } else {
            System.out.println("무음 해제합니다.");}
        }
    }

