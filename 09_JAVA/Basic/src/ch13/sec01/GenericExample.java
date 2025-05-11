package ch13.sec01;

public class GenericExample {
    public static void main(String[] args) {
        //Box<String> Box1 = new Box<String>();
        // Box생성할 때, 타입파라미터를 T대신 String로 대신,

        Box<String> box1 = new Box<>(); // Box<String>은 T가 String으로 바뀐 Box 클래스
        // new Box<>()는 Box 객체를 메모리에 생성
        box1.content = "안녕하세요."; //박스 안에 "안녕하세요."라는 문자열을 담음.
        String str = box1.content; //박스에서 content 값을 꺼내서 str이라는 변수에 저장.
        System.out.println(str);

        //왼쪽: String str
        //→ str이라는 문자열 변수를 새로 만들고,
        //오른쪽: box1.content
        //→ 앞에서 박스에 저장해 둔 "안녕하세요."를 꺼내서 그 값으로 초기화.

//        Box<Integer> Box2 = new Box<Integer>();
        //Box생성 시 타입 파라미터를 T대신 Integer로 대체
        Box<Integer> box2 = new Box<>();
        box2.content = 100;
        //field 변수 content 선언.
        int value = box2.content;
//        value 변수에 content 저장.
        System.out.println(value);

    }
}
//안녕하세요.
//100 출력