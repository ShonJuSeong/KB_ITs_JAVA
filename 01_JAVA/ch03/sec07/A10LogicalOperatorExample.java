package ch03.sec07;

public class A10LogicalOperatorExample {
    public static void main(String[] args) {
//        int charCode = 'A';
        int charCode = 'a';
//        int charCode = '5';
        if( (65<=charCode) & (charCode<=90) ) {
            System.out.println("대문자이군요.");                      //
        }
        if( (97<=charCode) && (charCode<=122) ) {
            System.out.println("소문자이군요.");                      //
        }
        if( (48<=charCode) && (charCode<=57) ) {
            System.out.println("0~9 숫자이군요.");                   //
        }
        //-----------------------------------------------------
//        int value = 6;
        int value = 7;
        if( (value%2==0) | (value%3==0) ) {                         // |는 "하나라도 true면 true
            System.out.println("2 또는 3의 배수이군요.");              //    int value = 6
        }
        boolean result = (value%2==0) || (value%3==0);              // || -> or : 둘 중 하나라도 true면 전체 true  // 6 % 2 == 0 → true /6 % 3 == 0 → true / result = true
        if( !result ) {                                             // !는 not 연산자를 무조건 반대로 true -> false        // result = true → !result = false
            System.out.println("2 또는 3의 배수가 아니군요.");       // false일 때 `출력하라는 코드가 없어서 안 뜸 / int value = 7


        }System.out.println(result);                    // 6 = TRUE // 7 = FALSE
    }
}
//int charCode = 'A'  대문자이군요. / 2 또는 3의 배수이군요.     // charCode A= 65    //  int value 6에 대한 2, 3의 배수라고 선언
//int charCode = 'a'  소문자이군요. / 2 또는 3의 배수이군요.     //  charCode a= 97   //  int value 6에 대한 2, 3의 배수라고 선언
//int charCode = '5' 0~9 숫자이군요. / 2 또는 3의 배수이군요.    //   charCode 5 = 53 //  int value 6에 대한 2, 3의 배수라고 선언
// 모든 if문이 독립적으로 실행, 하나의 if가 true여도 나머지 if 모두 실행

