package ch04.sec02;

public class B05IfNestedExample {
    public B05IfNestedExample() {
    }

    public static void main(String[] args) {
        int score = (int)(Math.random() * (double)20.0F) + 81;
        System.out.println("점수:" + score);
        if (score >= 95) {
            System.out.println("점수:" + score);
            System.out.println("학점: A+");
        } else if (score >= 90) {
            System.out.println("점수:" + score);
            System.out.println("학점: A");
        } else if (score >= 85) {
            System.out.println("점수:" + score);
            System.out.println("학점: B+");
        } else {
            System.out.println("점수:" + score);
            System.out.println("학점: B");
        }

    }}