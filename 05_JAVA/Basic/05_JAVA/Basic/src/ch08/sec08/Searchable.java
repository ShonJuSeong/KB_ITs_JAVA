package ch08.sec08;

import org.w3c.dom.ls.LSOutput;

public interface Searchable implements RemoteControl, Searchable{
    //tunrOn(); 추상 메소드 오버라이딩
    @Override
    public void tunrOn(){
        System.out.println("TV를 켭니다.");
    }

    //turnOff(); 추상메소드 오버라이딩
    @Override
    public void tunrOff(){
        System.out.println("TV를 끕니다.");
    }

    //search() 추상메소드 오버라이딩
    @Override
    public void search(String url) {
        System.out.println(url + "을 검색합니다.");
    }
}
