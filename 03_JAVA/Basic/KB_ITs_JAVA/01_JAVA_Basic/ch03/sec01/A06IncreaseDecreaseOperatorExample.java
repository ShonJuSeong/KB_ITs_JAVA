package ch03.sec01;

public class A06IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;
        x++;    // 후위증가
        ++x;    // 전위증가
        System.out.println("x=" + x);                   // x=12
        System.out.println("-----------------------");  // --
        y--;    // 후위증가
        --y;    // 전위증가
        System.out.println("y=" + y);                   // y=8
        System.out.println("-----------------------");  //
        z = x++;
        System.out.println("z=" + z);                   // z= 12
        System.out.println("x=" + x);                   // x= 13
        System.out.println("-----------------------");  //
        z = ++x;
        System.out.println("z=" + z);                   // z=14
        System.out.println("x=" + x);                   // x=14
        System.out.println("-----------------------");  //
        z = ++x + y++;
        System.out.println("z=" + z);                   // z= 23 (15+8)
        System.out.println("x=" + x);                   // x= 15
        System.out.println("y=" + y);                   // y= 9
    }
}
