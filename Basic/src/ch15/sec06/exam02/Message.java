package ch15.sec06.exam02;
//롬복을 이용하여 다음 클래스를 완성하세요.
//전체 매개변수 생성자
import lombok.Data;
        @Data
        //getter, setter, toString(), equals(), hashCode() 자동생성

public class Message {
    public String command;
    public String to;

    public Message(String command, String to) {
        this.command = command;
        //this.command는 필드, command는 파라미터
        this.to = to;
    }
}