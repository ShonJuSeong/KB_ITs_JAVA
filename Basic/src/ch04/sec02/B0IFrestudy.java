package ch04.sec02;

public class B0IFrestudy {
    public static class B01IfExample {
        public static void main(String[] args) {
            int score = 93;
            if(score >= 90) {
                System.out.println("점수가 90보다 큽니다.");
                System.out.println("등급은 A입니다.");
            }
            int score2 = 85;
            if(score2 < 90){
                System.out.println("점수가 90보다 작습니다.");
                System.out.println("등급은 B입니다.");                //if문과는 상관없는 실행문
        }
        }
    }

    public static class B02IfElseExample {
        public static void main(String[] args) {
            int score = 85;
    //        int score = 93;
            if(score >= 90){
                System.out.println("점수가 90보다 큽니다.");
                System.out.println("등급은 A입니다.");
            }else {
                System.out.println("점수가 90보다 작습니다.");
                System.out.println("등급은 B입니다.");

            }
        }
    }

    public static class B03IfElseIfElseExample {
        public static void main(String[] args) {
            int score = 95;
            if (score >= 90) {
                System.out.println("점수가 90점 이상입니다");
                System.out.println("등급은 A입니다.");
            }
            else if (score >= 80) {
                System.out.println("점수가 80점 이상입니다");
                System.out.println("등급은 B입니다.");
            }
            else if (score >= 70) {
                System.out.println("점수가 70점 이상입니다");
                System.out.println("등급은 C입니다.");
            }
            else {
                System.out.println("점수가 70점 미만입니다");
                System.out.println("등급은 D입니다.");
            }
        }
    }

    public static class B04IfDiceExample {
        public static void main(String[] args) {
            int num = (int)(Math.random()*6) +1;
            if(num == 1){
                System.out.println("1번이 나왔습니다.");
            }else if(num == 2){
                System.out.println("2번이 나왔습니다.");
            }else if(num == 3){
                System.out.println("3번이 나왔습니다.");
            }else if(num == 4){
                System.out.println("4번이 나왔습니다.");
            }else if(num == 5){
                System.out.println("5번이 나왔습니다.");
            }else if(num == 6){
                System.out.println("6번이 나왔습니다.");
            }
        }
    }

    public static class B05IfNestedExample {
        public static void main(String[] args) {
            int score = (int)(Math.random()*20) +81;
            System.out.println("점수:" + score);

            String grade;
            if(score >= 95){
                System.out.println("점수:"+score);
                System.out.println("학점: A+");
            }
            else if(score >= 90){
                System.out.println("점수:"+score);
                System.out.println("학점: A");
            }else if(score >= 85){
                System.out.println("점수:"+score);
                System.out.println("학점: B+");
            }else {System.out.println("점수:"+score);
                System.out.println("학점: B");
            }
        }
    }
}
