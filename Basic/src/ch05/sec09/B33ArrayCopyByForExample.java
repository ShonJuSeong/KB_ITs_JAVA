package Basic.src.ch05.sec09;

public class B33ArrayCopyByForExample {
    public static void main(String[] args) {
        //길이 3인 배열
        int[] oldIntArray = { 1, 2, 3 };
        //정수형 배열 oldIntArray 생성.
        //크기 3.
        //값 1, 2, 3 저장.
        //oldIntArray[0] = 1, oldIntArray[1] = 2, oldIntArray[2] = 3.

        //길이 5인 배열로 새로 생성
        int[] newIntArray = new int[5];
        // 배열 항목 복사
        //정수형 배열 newIntArray 생성.
        //크기 5.
        //값은 기본값 0으로 초기화.
        //newIntArray[0]~newIntArray[4] 모두 0.

        for( int i = 0; i < oldIntArray.length; i++ ){
            newIntArray[i] = oldIntArray[i];
            System.out.print(newIntArray[i]);
            System.out.println();
//            System.out.print(oldIntArray[i]);
            //반복문 시작.
            //i = 0부터 oldIntArray.length(3)보다 작을 동안 반복.
            //0, 1, 2 세 번 반복.
        }
        System.out.println();
        //배열 항목을 출력
        for(int i = 0; i <newIntArray.length; i++){
            System.out.print(newIntArray[i] + ", ");
        }
    }
}





// oldIntArray를 newIntArray 배열(요소가 5개임)로 복사하세요.
// ○ for 문을 이용해서 복사함
//○ for 문을 이용해서 다음과 같이 각 요소를 출력함