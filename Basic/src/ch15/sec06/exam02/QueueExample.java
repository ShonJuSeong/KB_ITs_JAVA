package ch15.sec06.exam02;
//○ LinkedList를 큐로 이용

//○ Message 인스턴스를 다음 순(command, to)으로 추가
//▪ sendMail, 홍길동
//▪ sendSMS, 신용권
//▪ sendKakaotalk, 감자바

//○ 큐가 빌 때까지 큐에서 Message를 추출하며 command에 따라 다음과 같이 출력

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        //Queue 컬렉션 생성
        Queue<Message> messageQueue = new LinkedList<>();
        //제네릭 타입 --><Message> 에는 Message 타입만 들어갈 수 있음 (타입 안정성 확보) // Message class에서 선언 완료

        //메세지 넣기
        messageQueue.offer(new Message("sendMail", "홍길동"));
        //offer()는 큐에 요소를 추가하는 메서드
        //new Message("sendMail", "홍길동") 객체를 큐에 넣음
        messageQueue.offer(new Message("sendSMS", "신용권"));
        messageQueue.offer(new Message("sendKakaotalk", "김자바"));
        //"sendSMS"와 "sendKakaotalk" 메시지를 각각 신용권, 김자바에게 보내기 위해 큐에 저장

        //메세지를 하나씩 꺼내어 처리
        while (!messageQueue.isEmpty()) {
            //큐가 비어있지 않을 때 계속 반복
            //isEmpty()는 큐가 비어있는지 확인하는 메서드 (true/false 반환)
            //!는 부정 → 비어있지 않을 때만 반복
            Message message = messageQueue.poll();
            //poll()은 큐에서 가장 먼저 들어온 요소를 꺼내고 제거함
            //꺼낸 결과를 Message 타입 변수 message에 저장
            //큐에 아무것도 없으면 null 반환 (여기선 while 조건으로 이미 막음)
            switch (message.command){ //조건문
                //괄호 안에 들어간 message.command 값(문자열)에 따라 아래에 있는 case 중 하나를 선택
                //예: 만약 command가 "sendSMS"이면, case "sendSMS": 부분부터 실행
                case "sendMail":
                System.out.println(message.to + "님에게 메일을 보냅니다.");
                break;
                    case "sendSMS":
                    System.out.println(message.to + "님에게 SMS를 보냅니다.");
                    break;
                        case "sendKakaotalk":
                        System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
                        break;
            }
        }
    }
}

//messageQueue.offer(new Message("sendMail", "홍길동"));
//messageQueue.offer(new Message("sendSMS", "신용권"));
//messageQueue.offer(new Message("sendKakaotalk", "김자바"));
//↓
//홍길동님에게 메일을 보냅니다.
//신용권님에게 SMS를 보냅니다.
//감자바님에게 카카오톡를 보냅니다.


/*
Queue	            FIFO 구조 자료구조 (First-In-First-Out)
LinkedList	        큐 구현체로 사용됨
offer()	            큐에 데이터 추가
poll()	            큐에서 가장 먼저 들어온 데이터 꺼냄
isEmpty()	        큐가 비었는지 확인
switch문	        명령(command)에 따라 다르게 처리
@Data	            Lombok: getter/setter, toString 등 자동 생성
 */