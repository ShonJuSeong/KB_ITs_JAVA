package Basic.src.ch05.sec06;

public class B30ArrayCreateByNewExample {
    public static void main(String[] args) {

        //배열 변수 선언과 배열 생성
        int[] arr1 = new int[3];
        //int[]: 정수(int) 타입 배열 선언.
        //new int[3]: 정수 3개를 저장할 수 있는 메모리 공간 생성.
        //arr1은 현재 0, 0, 0 상태. (int 기본값 0)

        //배열 항목의 초기값 출력
        for(int i=0; i<3; i++){
            System.out.print("arr1[" + i + "] : " + arr1[i] + ", ");
            //i=0부터 i=2까지 반복.
            //arr1의 각 인덱스 값 출력
            //모두 0으로 나온다.
        }
        System.out.println("\n");
        //배열 항목의 값 변경
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        //배열 항목 변경값 출력
        for(int i=0; i<3; i++){
            System.out.print("arr1[" + i + "] : " + arr1[i] + ", ");
        }

        System.out.println();
        System.out.println("--------------------------------");
        System.out.println();
        //배열 변수 선언과 배열 생성
        double[] arr2 = new double[3];
//double[]: 실수(double) 타입 배열 선언.
//new double[3]: double 3개 저장 공간 생성.
//arr2는 현재 0.0, 0.0, 0.0 상태. (double 기본값 0.0)


        //배열 초기값 출력
        for(int i=0; i<3; i++){
            System.out.print("arr2[" + i + "] : " + arr2[i] + ", ");
        }
        System.out.println();

        System.out.println();
        //배열 항목의 값 변경
        arr2[0] = 0.1;
        arr2[1] = 0.2;
        arr2[2] = 0.3;
        //배열 항목의 변경 값 출력
        for(int i=0; i<3; i++){
            System.out.print("arr2[" + i + "] : " + arr2[i] + ", ");
        }
        System.out.print("\n");
        System.out.println();
        System.out.println("--------------------------------");

        //배열 변수 선언과 배열 생성
        String[] arr3 = new String[3];
        //String[]: 문자열(String) 타입 배열 선언.
        //new String[3]: 문자열 3개 저장할 공간 생성.
        //arr3는 현재 null, null, null 상태. (String 기본값 null)

        for(int i=0; i<3; i++){
            System.out.print("arr3[" + i + "] : " + arr3[i] + ", ");
        }
        //배열 항목의 값 변경
        arr3[0] = "1월";
        arr3[1] = "2월";
        arr3[2] = "3월";
        //배열 항목의 변경 값 출력
        System.out.println();

        for(int i=0; i<3; i++){
            System.out.print("arr3[" + i + "] : " + arr3[i] + ", ");
        }
        System.out.println();
        System.out.println("--------------------------------");
    }

}
//  배열      이름	        타입	기본값	        변경 후 값
//  arr1	 int[]	        0	                10, 20, 30
//  arr2	 double[]   	0.0	                0.1, 0.2, 0.3
//  arr3	 String[]   	null	            "1월", "2월", "3월"


//○ 정수 요소 3개를 가지는 정수 배열 arr1을 선언 및 생성하고(초기화하지 않음) 그 arr1 배열의 내용을 출력
//○ 문자열 요소 3개를 가지는 문자열 배열 arr2를 선언 및 생성하고(초기화하지 않음) 그 arr1 배열의 내용을 출력