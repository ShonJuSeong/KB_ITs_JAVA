package ch04.sec04;

public class B13SumFrom1To100Example {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (i <= 100) {
            sum += i;
            i++;}
            System.out.println("1~" + (i-1) + " 합 " + sum);
    }
}





/*
for문 사용
         int sum = 0;
        int i;
        for(i=1; i<=100; i++) {
            sum += i;
        }
        System.out.println("1~" + (i-1) + " 합 " + sum);
    }
}

 1~100 합 : 5050

 */