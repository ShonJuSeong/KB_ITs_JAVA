package ch02.sec04;

public class A00FloatDoubleExample {
    public static void main(String[] args) {
        //정밀도 확인
        float var1 = 0.12348f;
        float var2 = 0.12345678901234567890f;
        double var3 = 0.1234567890123456789012354678901234567890;

        System.out.println(var1); //0.12348
        System.out.println(var2); //0.12345679
        System.out.println(var3); //0.12345678901234568
    }
}
