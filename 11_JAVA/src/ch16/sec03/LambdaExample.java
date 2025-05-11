package ch16.sec03;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        //매개변수가 두 개일 경우
        person.action1((name,job)->{
            System.out.print(name + "이 ");
            System.out.println(job+"을 합니다.");
        });
        person.action1((name,job)-> System.out.println(name+"이 "+job+"을 하지 않습니다."));

        //매개변수가 한 개일 경우
        //매개변수 이름은 람다식 내부에서 자유롭게 지정 가능 (개수와 타입만 일치하면 됨)
        person.action2((content)->{
            System.out.print("\""+content+"\"");
            System.out.println("라고 말합니다.");
        });
        person.action2(content->System.out.println("\""+content+"\"라고 외칩니다."));
    }
}