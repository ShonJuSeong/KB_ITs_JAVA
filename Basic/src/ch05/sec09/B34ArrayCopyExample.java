package Basic.src.ch05.sec09;

public class B34ArrayCopyExample {
    public static void main(String[] args) {
        //길이 3인 배열
        String[] oldStringArray = {"java", "array", "copy"};
        //문자열 배열 oldStringArray 생성.
        //크기 3.
        //oldStringArray[0] = "java"
        //oldStringArray[1] = "array"
        //oldStringArray[2] = "copy"

        //길이 5인 배열
        String[] newStringArray = new String[5];
        //문자열 배열 newStringArray 생성.
        //크기 5.
        //모든 요소는 null로 초기화됨.

        //배열 항목 복사

        System.arraycopy(oldStringArray, 0, newStringArray, 0, oldStringArray.length);
        //배열 복사하는 메서드 호출.
        //매개변수 5개.

        //1-> oldStringArray : 복사할 원본 배열.
        //2-> 0 : 원본 배열에서 복사를 시작할 인덱스.
        //3-> newStringArray : 복사 대상 배열.
        //4-> 0 : 복사 대상 배열에서 붙여넣기 시작할 인덱스.
        //5-> oldStringArray.length : 복사할 요소 개수 (3개).

        //만약 첫 번째 0을 1로 바꾼다면?
        //System.arraycopy(oldStringArray, 1, newStringArray, 0, oldStringArray.length);
        //oldStringArray[1]부터 복사를 시작한다.
        //oldStringArray[1] = "array"
        //oldStringArray[2] = "copy"
        //그 다음은 없으니까 배열 범위 넘어가면서 ArrayIndexOutOfBoundsException 오류 터진다.
        //복사 범위(oldStringArray.length = 3)인데, oldStringArray[1]부터 3개 가져오라 해서 범위 초과남.

        //결과
        //newStringArray[0] = "java"
        //newStringArray[1] = "array"
        //newStringArray[2] = "copy"
        //newStringArray[3] = null
        //newStringArray[4] = null

        //배열 항목 출력
        for (int i = 0; i < newStringArray.length; i++) //newStringArray 길이(5)만큼 돌림.
            {
            System.out.print(newStringArray[i] + " ");
        }
    }
}
//  java array copy null null