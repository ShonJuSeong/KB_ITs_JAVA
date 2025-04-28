package ch11.sec05;

public classThrowsExample1 {
    public static void main(String[] args) {
        try {
            findClass();
        } catch(ClassNotFoundException e) {
            System.out.println("예외 처리: " + e.toString());
        }
    }
    public static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.String2");

    }
    //예외 처리: java.lang.ClassNotFoundException: java.lang.String2
}
