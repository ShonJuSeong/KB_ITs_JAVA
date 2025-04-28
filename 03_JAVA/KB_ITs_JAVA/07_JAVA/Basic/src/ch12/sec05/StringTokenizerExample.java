package ch12.sec05;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {

        String data1 = "홍길동&이수홍,박연수"; //% , 제거
       String[] arr = data1.split("&|,");
        for(String token : arr) {
            System.out.println(token);
        }
        System.out.println("------------------");
        String data2 = "홍길동/이수홍/박연수"; // '/' 제거 + Tokenizer 用
        StringTokenizer st = new StringTokenizer(data2, "/");
        while(st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}
// ○ split 메서드를이용하여"홍길동&이수홍,박연수"에서 이름 문자열만 추출하여 출력
// ○ String Tokenizer를이용하여"홍길동/이수홍/박연수" 에서 이름 문자열만 추출하여 출력