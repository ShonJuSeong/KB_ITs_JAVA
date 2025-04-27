package ch04.sec04;

public class B11MultiplicationTableExample {
    public static void main(String[] args) {
for (int m=2; m<=9; m++){
    System.out.println("***" + m + "단 ***");
     for (int n=1; n<=9; n++)
         System.out.println(m + "x" + n + " = " + (m*n));
}
    }
}

/*
 *** 2단 ***
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
…
*** 9단 ***
9 x 1 = 9
9 x 2 = 18
…
9 x 8 = 72
9 x 9 = 81
*/