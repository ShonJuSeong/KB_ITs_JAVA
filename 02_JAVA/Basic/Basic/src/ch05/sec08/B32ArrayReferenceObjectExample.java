package Basic.src.ch05.sec08;

public class B32ArrayReferenceObjectExample {
    public static void main(String[] args) {
        String[] strArray = new String[3];
//문자열(String) 타입 배열 strArray 생성. / 크기 3. /strArray[0], strArray[1], strArray[2] 존재. /현재 각각 null 상태.

        strArray[0] = "Java";
        strArray[1] = "Java";
        strArray[2] = new String("Java");

        //strArray[0] = "Java";
        //strArray[0]에 "Java" 문자열 리터럴 저장.
        //"Java" 문자열은 문자열 상수 풀(String Constant Pool) 에 저장됨.
//-------------------------------------------------------------------------------
        //strArray[1] = "Java";
        //strArray[1]에 "Java" 문자열 리터럴 저장.
        //"Java"는 이미 상수 풀에 있으므로 strArray[0]과 같은 주소 가리킴.
//-------------------------------------------------------------------------------
        //strArray[2] = new String("Java");
        //strArray[2]에 "Java"라는 새로운 String 객체 생성 후 저장.
        //new 키워드 사용 → 힙 메모리에 별도로 새 객체 생성.
        //strArray[0], strArray[1]과는 다른 주소 가짐.


        System.out.println( strArray[0] == strArray[1] );
        //== 연산자는 주소(참조값) 비교.
        //strArray[0]과 strArray[1]은 같은 "Java" 상수 풀 객체 가리킴.
        //주소 같음 → true 출력.

        System.out.println( strArray[0] == strArray[2] );
        System.out.println( strArray[1] == strArray[2] );
        //strArray[0]은 상수 풀 "Java"를 가리킴.
        //strArray[2]는 new로 만든 새로운 "Java" 객체 가리킴.
        //주소 다름 → false 출력.

        System.out.println( strArray[0].equals(strArray[2]) );
        System.out.println( strArray[1].equals(strArray[2]) );
        //.equals()는 내용(문자열) 비교.
        //strArray[0] 내용은 "Java".
        //strArray[2] 내용도 "Java".
        //내용 같음 → true 출력.

        //System.out.println( strArray[0] == strArray[2] );
        //System.out.println( strArray[1] == strArray[2] );
        //== 사용.
        //참조값(주소값) 비교.
        //strArray[0]와 strArray[2] 비교.
        //strArray[1]와 strArray[2] 비교
        //strArray[0]과 strArray[1]은 같은 리터럴 "Java"를 가리킴. (상수 풀)
        //strArray[2]는 new String("Java")라서 힙 영역에 새 객체.
        //그래서 둘 다 false 나온다.
        //주소가 다르기 때문이다


        //System.out.println( strArray[0].equals(strArray[2]) );
        //System.out.println( strArray[1].equals(strArray[2]) );
        //.equals() 사용.
        //문자열 내용 비교.
        //strArray[0]와 strArray[2] 비교.
        //strArray[1]와 strArray[2] 비교.
        //strArray[0], strArray[1], strArray[2] 모두 안의 문자열은 "Java".
        //문자열 내용이 같으니까 둘 다 true 나온다.
    }
}


//true
//false
//true

