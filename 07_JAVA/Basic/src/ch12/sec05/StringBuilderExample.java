package ch12.sec05;

public class StringBuilderExample {
    public static void main(String[] args) {
        String data = new StringBuilder()
                .append("DEF")          // 문자열 끝에 추가
                .insert(0, "ABC")  //0번째 위치에 추가
                .delete(3, 4)  //문자열 일부를 삭제 -> ABC"D"EF 삭제
                .toString();
        System.out.println(data);
    }
    //ABCDEF
    //.append : 문자열 끝에 추가
    //.insert : 문자열을 지정 위치에 추가
    //.delite : 문자열 일부를 삭제 -> ABC"D"EF 삭제
    //.toString :완성된 문자열 리턴
}
