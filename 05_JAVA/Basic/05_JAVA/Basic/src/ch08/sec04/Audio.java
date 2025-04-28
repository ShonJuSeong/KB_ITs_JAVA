package ch08.sec04;

public class Audio implements RemoteControl {
    //필드
    private int volume;

    //turnOn() 추상 메소드 오버라이딩
    @Override
    public void turnOn(){
        System.out.println("Audio를 켭니다.");
    }

    //turnOff() 추상 메소드 오버라이딩
    @Override
    public void turnOff(){
        System.out.println("Audio를 끕니다.");
    }

    //setVolume() 추상 메소드 오버라이딩
    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;  //최대 볼륨(10) 넘으면 강제로 10으로 맞춘다.
        }else if (volume < RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME; //0보다 작으면 강제로 0으로 맞춘다.
        }else { this.volume = volume;}  //0~10 사이면 그대로 설정.
        System.out.println("현재 Audio 볼륨 : " + this.volume);
    }
}
