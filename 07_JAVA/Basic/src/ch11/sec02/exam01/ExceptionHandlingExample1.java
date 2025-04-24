package ch11.sec02.exam01;

public class ExceptionHandlingExample1 { public static void printLength(String data) {
    int result = data.length();         //data 없기에, java.lang.NullPointerException 발생
    System.out.println("문자 수: " + result);
}
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("[프로그램 종료]");
/*
        문자 수: 10
        Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "data" is null
        at ch11.sec02.exam01.ExceptionHandlingExample1.printLength(ExceptionHandlingExample1.java:4)
        at ch11.sec02.exam01.ExceptionHandlingExample1.main(ExceptionHandlingExample1.java:10)
        매개값을 null로 해놨기에, null -> 없
  */
}

}
