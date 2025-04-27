package Basic.src.ch05.sec06;

public class B29ArrayCreateByValueListExample2 {
    public static void main(String[] args) {
        //배열 변수 선언
    int[] scores;
            //= new int[] { 83, 90, 87 };
//int[] : 정수(int형) 배열을 선언
//scores : 배열의 이름. 배열에 나중에 값넣을 것. //선언만 했고, 메모리 할당은 안함

    //배열 변수에 배열 대입
        scores = new int[] { 83, 90, 87 };
        //new int[] : 새로운 int 배열 객체를 생성.  //{83, 90, 87} : 배열에 83, 90, 87 값을 넣음
        //즉, scores[0]=83, scores[1]=90, scores[2]=87로 들어감.

    // 배열 항목의 총합 구하고 출력
        int sum1 = 0;
        for(int i =0; i<3; i++) {
            sum1 += scores[i];
        }
        //for : 반복문 시작 //int i = 0 : 인덱스 0부터 시작. //i < 3 : i가 3보다 작을 동안 반복.
        //i++ : i를 1씩 증가시킴. //sum1 += scores[i]; : sum1 = sum1 + scores[i];
        System.out.println("총합 : " + sum1);
// i	    scores[i]	    sum1 (누적합)
// 0	      83	          83
// 1	      90	          173
// 2	      87	          260
        //배열을 매개값으로 주고, printItem()메소드 호출
    printItem(new int[]{83, 90, 87});
    //printItem(...) : printItem 메소드를 호출.
    //new int[]{83, 90, 87} : 호출할 때 바로 새로운 배열을 만들어서 넘긴
}

//printItem() 메소드 선언
    public static void printItem(int[] scores) {
        for(int i=0; i<3; i++){
            System.out.println("scores[" + i + "] : " + scores[i]);
            //for문으로 0부터 2까지 반복.
            //System.out.println으로 scores 배열의 i번째 값을 출력.
        }
    }
}

//아래로 출력되도록 printItem() 메서드를 추가하세요.
//score[0]: 83
//score[1]: 90
//score[2]: 87